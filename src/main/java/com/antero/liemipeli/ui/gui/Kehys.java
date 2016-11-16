/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.gui;

import com.antero.liemipeli.ui.gui.ImagePanel;
import java.awt.Container;
import java.awt.TextField;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Antero Oikkonen
 */
public class Kehys extends JFrame {


    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Liemipeli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImagePanel.setComponentToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
