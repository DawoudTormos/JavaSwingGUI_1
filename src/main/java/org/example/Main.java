package org.example;

import static java.lang.System.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) throws IOException/* TO use ImageIO.read*/ {
        out.println("Hello World!");

        //Code section for all commits

        //changing image size
        BufferedImage originalImage = ImageIO.read(new File("./src/main/resources/java.png"));
        ImageIcon icon = new ImageIcon(  originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

        // end















        //commit: Working with panels

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.setBounds(10,10,250,250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setBounds(260,10,250,250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.setBounds(10,260,500,250);

        panel3.setLayout(null);



        JLabel label = new JLabel("Hello World!");
        label.setIcon(icon);
        label.setBorder(new BevelBorder(BevelBorder.LOWERED , Color.BLACK,Color.black));
        label.setBounds(0 , 75 , 250, 100);// 250/2 - 100/2
        panel3.add(label);

        JLabel label2 = new JLabel("Hello World!");
        label2.setIcon(icon);
        label.setBorder(new BevelBorder(BevelBorder.LOWERED , Color.BLACK,Color.black));
        //panel3.add(label2);//add with flowlayout or borderlayout



        Frame1 f1 = new Frame1("my title");
        f1.setSize(1000 , 1000);
        f1.setVisible(true);
       f1.setResizable(true);




        f1.add(panel1);
        f1.add(panel2);
        f1.add(panel3);
        f1.setLayout(null);
        f1.setVisible(true);





        //Commit: Working with Jlabels

        /*Frame1 f1 = new Frame1("my title");


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

        //f1.pack();*/









    }



}