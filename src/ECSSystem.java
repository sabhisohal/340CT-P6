package pkg340ct;


import static ECSSystem.moduleCodePanel;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class ECSSystem
{
    static ECSPanel dueTimePanel, moduleCodePanel, moduleTitlePanel, tutorPanel,courseNumberPanel, courseTitlePanel,issueDatePanel, dueDatePanel, typePanel, markPanel;
    final static boolean MULTICOLORED = false;
    
   public ECSSystem() {

        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame mainFrame = new JFrame("Output");
                mainFrame.setSize(400,400);
                mainFrame.setLayout(new GridLayout(3, 1));
                JLabel headerLabel = new JLabel("Module Code : " + moduleCodePanel.textField.getText());
                JLabel headerLabel1 = new JLabel("Module Title : " + moduleTitlePanel.textField.getText());
                JLabel headerLabel2 = new JLabel("Module Tutor : " + tutorPanel.textField.getText());
                JLabel headerLabel3 = new JLabel("Coursework Number : " + courseNumberPanel.textField.getText());
                JLabel headerLabel4 = new JLabel("Coursework Title : " + courseTitlePanel.textField.getText());
                JLabel headerLabel5 = new JLabel("Issue Date : " + issueDatePanel.textField.getText());
                JLabel headerLabel6 = new JLabel("Due Date : " + dueDatePanel.textField.getText());
                JLabel headerLabel7 = new JLabel("Due Time : " + dueTimePanel.textField.getText());
                JLabel headerLabel8 = new JLabel("Assessment Type : " + typePanel.textField.getText());
                JLabel headerLabel9 = new JLabel("% of Module Mark : " + markPanel.textField.getText());
                mainFrame.setLayout(new GridLayout(20, 1));

                mainFrame.add(headerLabel);
                mainFrame.add(headerLabel1);
                mainFrame.add(headerLabel2);
                mainFrame.add(headerLabel3);
                mainFrame.add(headerLabel4);
                mainFrame.add(headerLabel5);
                mainFrame.add(headerLabel6);
                mainFrame.add(headerLabel7);
                mainFrame.add(headerLabel8);
                mainFrame.add(headerLabel9);
                mainFrame.setVisible(true);
            }
    })
        
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("ECSSystem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ECSSystem ECSSystem = new ECSSystem();
        ECSSystem.mainPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(Main.mainPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}