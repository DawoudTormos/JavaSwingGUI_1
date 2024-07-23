package org.example;

import static java.lang.System.*;

//below imports that appear unused are used in a commented code
// each commented block of code could be used and tested by downloading the repo at the commit message for the comment block
//each comment block have its commit message typed above it

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

         originalImage = ImageIO.read(new File("./src/main/resources/click-me-icon.png"));
        ImageIcon clickMeIcon = new ImageIcon(  originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        // end


        GridLayoutFrame frame = new GridLayoutFrame(500,500,3,3,10,10);

        frame.add(new ModernJButton("1"));
        frame.add(new ModernJButton("2"));
        frame.add(new ModernJButton("3"));
        frame.add(new ModernJButton("4"));
        frame.add(new ModernJButton("5"));
        frame.add(new ModernJButton("6"));
        frame.add(new ModernJButton("7"));
        frame.add(new ModernJButton("8"));
        frame.add(new ModernJButton("9"));

        frame.setVisible(true);



        //Commit: Working with FlowLayout. Creating a FlowLayoutFrame class
        /*
        FlowLayoutFrame frame = new FlowLayoutFrame(600,600, FlowLayout.CENTER,10,100);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(250, 250));
        p1.setBackground(Color.lightGray);
        p1.setLayout(new FlowLayout());

        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));

        frame.add(p1);

        frame.setVisible(true);*/




        //Commit : Working with BorderLayout. Creating a BorderLayoutFrame class
        /*BorderLayoutFrame frame = new BorderLayoutFrame(600,600);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.RED);p1.setPreferredSize(new Dimension(100, 70));
        p2.setBackground(Color.green);p2.setPreferredSize(new Dimension(70, 70));
        p3.setBackground(Color.yellow);p3.setPreferredSize(new Dimension(70, 70));
        p4.setBackground(Color.magenta);p4.setPreferredSize(new Dimension(70, 70));
        p5.setBackground(Color.blue);p5.setPreferredSize(new Dimension(70, 70));

        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.WEST);
        frame.add(p3,BorderLayout.EAST);
        frame.add(p4,BorderLayout.SOUTH);
        frame.add(p5,BorderLayout.CENTER);
        //frame.setVisible(true);




        //                  sub-panels in p5            //
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();

        p6.setBackground(Color.gray);p6.setPreferredSize(new Dimension(100, 70));
        p7.setBackground(Color.lightGray);p7.setPreferredSize(new Dimension(70, 70));
        p8.setBackground(Color.blue);p8.setPreferredSize(new Dimension(70, 70));
        p9.setBackground(Color.black);p9.setPreferredSize(new Dimension(70, 70));
        p10.setBackground(Color.darkGray);p10.setPreferredSize(new Dimension(70, 70));

        p5.setLayout(new BorderLayout());
        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.WEST);
        p5.add(p8,BorderLayout.EAST);
        p5.add(p9,BorderLayout.SOUTH);
        p5.add(p10,BorderLayout.CENTER);*/





        

        //Commit:Working with : Buttons, actionlistners, mouselisenteners, adding a Designed JButton class "ModernJButton" and using three ways for adding the listeners(lambda, object of listners class and frame implemetning listners class).
        /*
        Frame2 frame = new Frame2("Buttons",600,700);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);


        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 140, 50);
        button.addActionListener(frame);
        Border border = BorderFactory.createLineBorder(Color.black , 4);
        //button.setBorder(border);
        button.setFocusable(false);
        button.setIcon(clickMeIcon);
        frame.add(button);


        JButton button2 = new JButton("Click Me Lambda");
        button2.setBounds(50, 150, 140, 50);
        button2.addActionListener((e)->{
            out.println("clicked the click me JButton with lambda function as actionListeners");
        });
        frame.add(button2);


        //modern look for button
        JButton button3 = new JButton("Modern Button");
        button3.setBounds(50, 250, 140, 50);
        button3.setBackground(new Color(45, 45, 45));
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 13));
        button3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button3.setFocusPainted(false);
        frame.add(button3);

        //modern look for button using a class and with hover effects
        ModernJButton button4 = new ModernJButton("Modern Button2");
        button4.setBounds(50, 350, 140, 50);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    out.println("clicked:\t" + e.getSource().toString());
            }
        });
        frame.add(button4);


        JButton button5 = new JButton( "Button 5");
        button5.setBounds(50, 450, 140, 55);
        button5.setIcon(clickMeIcon);
        button5.setFocusable(false);
        button5.setHorizontalTextPosition(JButton.CENTER);
        button5.setVerticalTextPosition(JButton.BOTTOM);
        button5.setFont(new Font("Comic Sans", Font.BOLD, 16));
        button5.setIconTextGap(-2);
        button5.setForeground(Color.CYAN);
        button5.setBackground(Color.lightGray);
        button5.setBorder(BorderFactory.createEtchedBorder());
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.println("clicked:\t" + e.getSource().toString());
            }
        });
        frame.add(button5);

         */






        //commit: Working with panels

        /*JPanel panel1 = new JPanel();
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
        f1.setVisible(true);*/





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