package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class MyFrame4 extends JFrame implements ActionListener, KeyListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openItem, colorChooserItem;
    JFileChooser fileChooser;
    JColorChooser colorChooser;
    DrawingPanel drawingPanel;
    JButton drawGraphicsButton, startAnimationButton, restartAnimationButton;
    JLabel instructionsLabel;

    public MyFrame4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLayout(new BorderLayout());

        // Dummy Menu Bar
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        colorChooserItem = new JMenuItem("Color Chooser");

        fileMenu.add(openItem);
        fileMenu.add(colorChooserItem);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);

        // Adding Listeners
        openItem.addActionListener(this);
        colorChooserItem.addActionListener(this);

        // File Chooser
        fileChooser = new JFileChooser();

        // Color Chooser
        colorChooser = new JColorChooser();

        // Drawing Panel
        drawingPanel = new DrawingPanel();
        drawingPanel.setPreferredSize(new Dimension(400, 300));
        this.add(drawingPanel, BorderLayout.CENTER);

        // Instructions Label
        instructionsLabel = new JLabel("Try the key listeners: ALT + G, ALT + R, ALT + B");
        instructionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(instructionsLabel, BorderLayout.NORTH);

        // Buttons for 2D Graphics, Animation, and Restart Animation
        drawGraphicsButton = new JButton("Draw 2D Graphics");
        startAnimationButton = new JButton("Start 2D Animation");
        restartAnimationButton = new JButton("Restart Animation");

        drawGraphicsButton.addActionListener(this);
        startAnimationButton.addActionListener(this);
        restartAnimationButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(drawGraphicsButton);
        buttonPanel.add(startAnimationButton);
        buttonPanel.add(restartAnimationButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // Adding Key Listener
        this.addKeyListener(this);
        this.setFocusable(true);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(this, "File selected: " + filePath);
            }
        }

        if (e.getSource() == colorChooserItem) {
            Color color = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
            if (color != null) {
                drawingPanel.setBackground(color);
            }
        }

        if (e.getSource() == drawGraphicsButton) {
            drawingPanel.drawStaticGraphics();
        }

        if (e.getSource() == startAnimationButton) {
            drawingPanel.startAnimation();
        }

        if (e.getSource() == restartAnimationButton) {
            drawingPanel.restartAnimation();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is called whenever a key is typed.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is called whenever a key is pressed.
        if (e.isAltDown()) {
            if (e.getKeyCode() == KeyEvent.VK_R) {
                drawingPanel.setBackground(Color.RED);
            }
            if (e.getKeyCode() == KeyEvent.VK_G) {
                drawingPanel.setBackground(Color.GREEN);
            }
            if (e.getKeyCode() == KeyEvent.VK_B) {
                drawingPanel.setBackground(Color.BLUE);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is called whenever a key is released.
    }

    // Inner class for Drawing and Animation
    class DrawingPanel extends JPanel {
        private Timer animationTimer;
        private int x = 0;
        private int y = 100;
        private int xSpeed = 3;
        private int ySpeed = 3;
        private boolean animating = false;
        private boolean drawSquare = false;
        private Color squareColor = Color.BLUE;
        private int squareX = 50;
        private int squareY = 50;
        private final Random random = new Random();

        public DrawingPanel() {
            setBackground(Color.LIGHT_GRAY);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (drawSquare) {
                // Draw the square with the current color and position
                g.setColor(squareColor);
                g.fillRect(squareX, squareY, 100, 100);
            }

            if (animating) {
                // Draw the moving red circle with bouncing effect
                g.setColor(Color.RED);
                g.fillOval(x, y, 50, 50);
            }
        }

        public void drawStaticGraphics() {
            drawSquare = true;
            // Generate random color and position
            squareColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            squareX = random.nextInt(getWidth() - 100);
            squareY = random.nextInt(getHeight() - 100);
            repaint(); // Trigger the panel to redraw
        }

        public void startAnimation() {
            if (animationTimer != null && animationTimer.isRunning()) {
                animationTimer.stop();
            }
            animating = true;
            drawSquare = false; // Ensure the square is not drawn during animation
            animationTimer = new Timer(5, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Move the circle
                    x += xSpeed;
                    y += ySpeed;

                    // Bounce off the walls
                    if (x < 0 || x + 50 > getWidth()) {
                        xSpeed = -xSpeed;
                    }
                    if (y < 0 || y + 50 > getHeight()) {
                        ySpeed = -ySpeed;
                    }

                    repaint(); // Redraw the panel
                }
            });
            animationTimer.start();
        }

        public void restartAnimation() {
            if (animationTimer != null && animationTimer.isRunning()) {
                animationTimer.stop();
            }
            x = 0;
            y = 100;

            animating = true;
            drawSquare = false; // Ensure the square is not drawn during animation
            repaint(); // Clear the panel before starting the new animation
            startAnimation(); // Restart animation
        }
    }
}
