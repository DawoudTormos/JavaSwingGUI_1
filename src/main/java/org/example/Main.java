package org.example;

import static java.lang.System.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) throws IOException/* TO use ImageIO.read*/ {
        out.println("Hello World!");


        //changing image size
        BufferedImage originalImage = ImageIO.read(new File("./src/main/resources/java.png"));
        ImageIcon icon = new ImageIcon(  originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH));


        Frame1 f1 = new Frame1("my title");
        f1.setSize(500 , 500);
        f1.setVisible(true);


        JLabel l1 = new JLabel();
        l1.setText("Hello World!");
        l1.setIcon(icon);


        f1.add(l1);
        f1.setVisible(true);//You should set Visibility again after adding a component









    }



}