/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.gui;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;

/**
 *
 * @author Antero Oikkonen
 */
public class ImagePanel extends javax.swing.JPanel {

    public static void setComponentToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        ImagePanel panel = new ImagePanel();
        TextField tf = new TextField();
        tf.setText(panel.getH() + "*" + panel.getW());
        pane.add(panel);
        pane.add(tf);
    }

    private BufferedImage image;
    TextField tf = new TextField();
    int h = 0;
    int w = 0;

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    /**
     * Creates new form ImagePanel
     */
    public ImagePanel() {
        try {
            image = ImageIO.read(new File("./kuvat/pelaaja.png"));
            h=image.getHeight();
            w=image.getWidth();
        } catch (IOException ex) {
            TextField t = new TextField();
            t.setText("Virhe tiedoston lukemisessa");
            this.add(t);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.drawImage(image, 100, 100, this);//To change body of generated methods, choose Tools | Templates.
    }
}
