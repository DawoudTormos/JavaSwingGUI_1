package org.example;

import javax.swing.*;
import java.awt.*;

import static java.lang.System.out;

public class Frame1 extends JFrame {
    public Frame1(String title) {
        this.setVisible(true);

        this.setSize(600,600);
        this.setTitle(title)     ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*JFrame.EXIT_ON_CLOSE
        JFrame.HIDE_ON_CLOSE
        JFrame.DO_NOTHING_ON_CLOSE
        */
        this.setResizable(false);


        // ImageIcon icon = new ImageIcon("C:/Users/Dawoud Tormos/Documents/NetBeansProjects/JavaSwingGui_1/src/main/java/java.png");
        ImageIcon icon = new ImageIcon("./src/main/resources/java.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(190 , 190 , 190));// yellow variation

        //getting yellow vslues
        //out.println(Color.YELLOW.getRed() + " " + Color.YELLOW.getGreen() + " "+ Color.YELLOW.getBlue());
    }
}
