package org.example;

import static java.lang.System.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
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
        f1.setResizable(true);


        Border border = BorderFactory.createLineBorder(Color.black , 4);
        JLabel l1 = new JLabel();
        l1.setText("Hello World!");
        l1.setIcon(icon);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.RIGHT);
        l1.setVerticalTextPosition(JLabel.CENTER);
        l1.setForeground(new Color(0x50ff50));
        l1.setFont(new Font("MV Boli", Font.PLAIN, 27));
        l1.setIconTextGap(10);
        l1.setBackground(new Color(0xffffff));
        l1.setOpaque(true);
        l1.setBorder(border);


        f1.add(l1);
        f1.setVisible(true);//You should set Visibility again after adding a component

        f1.setLayout(null);// before using a layout and learning them, i will try fixing the label to where i want
        l1.setBounds(0,0,350,150);

        f1.pack();









    }



}