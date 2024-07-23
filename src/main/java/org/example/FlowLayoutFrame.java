package org.example;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutFrame extends JFrame {


    public FlowLayoutFrame(int width , int height, int align, int spacingx , int spacingy){
        this.setTitle("FlowLayout Frame");
        this.setLayout(new FlowLayout(align,spacingx,spacingy));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setVisible(true);

    }


}
