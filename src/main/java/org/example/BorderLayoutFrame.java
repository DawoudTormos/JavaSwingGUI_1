package org.example;


import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {


    public BorderLayoutFrame(int width, int height){
        this.setTitle("BorderLayout Frame");
        this.setLayout(new BorderLayout(10,10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setVisible(true);


    }


}
