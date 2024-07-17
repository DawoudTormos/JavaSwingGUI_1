package org.example;

import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World!");

        JFrame f1 = new JFrame();

        f1.setSize(420,420);
        f1.setTitle("f1 title")     ;
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*JFrame.EXIT_ON_CLOSE
        JFrame.HIDE_ON_CLOSE
        JFrame.DO_NOTHING_ON_CLOSE
        */
        f1.setResizable(false);


        // ImageIcon icon = new ImageIcon("C:/Users/Dawoud Tormos/Documents/NetBeansProjects/JavaSwingGui_1/src/main/java/java.png");
        ImageIcon icon = new ImageIcon("./src/main/resources/java.png");
        Image img = icon.getImage();
        f1.setIconImage(img);
        f1.setVisible(true);


    }



}