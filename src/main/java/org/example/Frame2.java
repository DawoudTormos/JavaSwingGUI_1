package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// for buttons testing
public class Frame2 extends JFrame implements ActionListener {

    public Frame2(String title , int width, int height){
        this.setTitle(title);
        this.setLayout(null);
        this.setSize(width,height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if((   (JButton) e.getSource() ).getText()   ==  "Click Me"){
            System.out.println( "Click Me JButton was clicked" );
            //this.setVisible(false);
        }
    }

}
