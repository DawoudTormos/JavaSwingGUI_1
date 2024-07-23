package org.example;

import javax.swing.*;
import java.awt.*;

public class GridLayoutFrame extends JFrame {

    public GridLayoutFrame(int width , int height, int cols , int rows, int gapx, int gapy  ) {
        this.setTitle("BorderLayout Frame");
        this.setLayout(new GridLayout(rows,cols,gapx , gapy));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setVisible(true);
    }
}
