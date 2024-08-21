package org.example;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame1 extends JFrame implements ActionListener, ChangeListener {

    JButton submitButton;
    JTextField nameField, ageField;
    JRadioButton maleRadio, femaleRadio;
    JComboBox<String> countryComboBox;
    JCheckBox subscribeCheckBox;
    JSlider ageSlider;
    JLabel ageLabel;

    MyFrame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("User Profile Setup");

        // Name TextField
        nameField = new JTextField("Enter your name");
        nameField.setPreferredSize(new Dimension(250, 40));
        nameField.setFont(new Font("Consolas", Font.PLAIN, 20));

        // Age TextField
        ageField = new JTextField("Enter your age");
        ageField.setPreferredSize(new Dimension(250, 40));
        ageField.setFont(new Font("Consolas", Font.PLAIN, 20));

        // Gender Radio Buttons
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Country ComboBox
        String[] countries = {"USA", "Canada", "UK", "Australia", "Other"};
        countryComboBox = new JComboBox<>(countries);

        // Subscription CheckBox
        subscribeCheckBox = new JCheckBox("Subscribe to newsletter");

        // Age Slider
        ageSlider = new JSlider(0, 100, 25);
        ageSlider.setPreferredSize(new Dimension(250, 40));
        ageSlider.setPaintTicks(true);
        ageSlider.setMinorTickSpacing(5);
        ageSlider.setPaintTrack(true);
        ageSlider.setMajorTickSpacing(25);
        ageSlider.setPaintLabels(true);
        ageSlider.addChangeListener(this);

        ageLabel = new JLabel("Age: 25");

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Adding components to the frame
        this.add(nameField);
        this.add(ageField);
        this.add(maleRadio);
        this.add(femaleRadio);
        this.add(countryComboBox);
        this.add(subscribeCheckBox);
        this.add(ageSlider);
        this.add(ageLabel);
        this.add(submitButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "Not specified");
            String country = (String) countryComboBox.getSelectedItem();
            boolean isSubscribed = subscribeCheckBox.isSelected();
            String subscriptionStatus = isSubscribed ? "Yes" : "No";

            // Output the collected information to the console
            System.out.println("User Profile:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Country: " + country);
            System.out.println("Subscribed: " + subscriptionStatus);

            // You can add code here to save this information or process it further.
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == ageSlider) {
            ageLabel.setText("Age: " + ageSlider.getValue());
        }
    }

    public static void main(String[] args) {
        new MyFrame1();
    }
}