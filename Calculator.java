package dev.asmussen;

// Imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class Calculator implements ActionListener {

    JFrame frame;

    JTextField field;

    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonDecimal;
    JButton buttonEquals, buttonClear, buttonDelete;
    JButton buttonTheme;

    String colorTheme = "Light";

    static double valueOne = 0;
    static double valueTwo = 0;
    static double result = 0;

    static int operator = 0;

    Calculator() {

        frame = new JFrame("Lommeregner");

        field = new JTextField();

        // Tal
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");

        // Tegn
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonDecimal = new JButton(",");

        // Funktions knapper
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
        buttonDelete = new JButton("DEL");

        buttonTheme = new JButton("Tema");

        // Lav grænser til de forskellige knapper.
        field.setBounds(30,40,280,30);

        button7.setBounds(40, 100, 50, 40);
        button8.setBounds(110, 100, 50, 40);
        button9.setBounds(180, 100, 50, 40);

        buttonPlus.setBounds(250, 100, 50, 40);

        button4.setBounds(40,170,50,40);
        button5.setBounds(110,170,50,40);
        button6.setBounds(180,170,50,40);

        buttonMinus.setBounds(250,170,50,40);

        button1.setBounds(40,240,50,40);
        button2.setBounds(110,240,50,40);
        button3.setBounds(180,240,50,40);

        buttonMultiply.setBounds(250,240,50,40);

        buttonDecimal.setBounds(40,310,50,40);

        button0.setBounds(110,310,50,40);

        buttonDivide.setBounds(250,310,50,40);

        buttonEquals.setBounds(180,380,100,40);
        buttonDelete.setBounds(60,380,100,40);
        buttonClear.setBounds(180,310,50,40);

        buttonTheme.setBounds(17,450,300,40);

        // Sæt de forskellige knapper i GUI systemet og andre diverse GUI ting så som ActionListeners.
        frame.add(field);

        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        frame.add(buttonDivide);

        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.add(buttonMultiply);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.add(buttonMinus);

        frame.add(buttonDecimal);

        frame.add(button0);

        frame.add(buttonEquals);
        frame.add(buttonPlus);
        frame.add(buttonDelete);
        frame.add(buttonClear);

        frame.add(buttonTheme);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        colorTheme("Light");

        // ActionListeners
        for (JButton buttons : Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonDivide, buttonMultiply, buttonMinus, buttonDecimal, buttonEquals, buttonDelete, buttonClear, buttonTheme)) {
            buttons.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button1) {

            field.setText(field.getText().concat("1"));

        } if(e.getSource() == button2) {

            field.setText(field.getText().concat("2"));

        } if(e.getSource() == button3) {

            field.setText(field.getText().concat("3"));

        } if(e.getSource() == button4) {

            field.setText(field.getText().concat("4"));

        } if(e.getSource() == button5) {

            field.setText(field.getText().concat("5"));

        } if(e.getSource() == button6) {

            field.setText(field.getText().concat("6"));

        } if(e.getSource() == button7) {

            field.setText(field.getText().concat("7"));

        } if(e.getSource() == button8) {

            field.setText(field.getText().concat("8"));

        } if(e.getSource() == button9) {

            field.setText(field.getText().concat("9"));

        } if(e.getSource() == button0) {

            field.setText(field.getText().concat("0"));

        } if(e.getSource() == buttonDecimal) {

            field.setText(field.getText().concat("."));

        } if(e.getSource() == buttonPlus) {

            valueOne = Double.parseDouble(field.getText());
            operator = 1;

            field.setText("");

        } if(e.getSource() == buttonMinus) {

            valueOne = Double.parseDouble(field.getText());
            operator = 2;

            field.setText("");

        } if(e.getSource() == buttonMultiply) {

            valueOne=Double.parseDouble(field.getText());
            operator=3;
            field.setText("");

        } if(e.getSource() == buttonDivide) {

            valueOne=Double.parseDouble(field.getText());
            operator=4;
            field.setText("");

        } if(e.getSource() == buttonEquals) {

            valueTwo = Double.parseDouble(field.getText());

            switch (operator) {

                case 1 -> result = valueOne + valueTwo;

                case 2 -> result = valueOne - valueTwo;

                case 3 -> result = valueOne * valueTwo;

                case 4 -> result = valueOne / valueTwo;

                default -> result = 0;
            }

            field.setText("" + result);

        } if(e.getSource() == buttonClear) {

            field.setText("");

        } if(e.getSource() == buttonDelete) {

            String str = field.getText();
            field.setText("");

            for(int i = 0; i < str.length() - 1; i++) {

                field.setText(field.getText() + str.charAt(i));
            }
        } if(e.getSource() == buttonTheme) {

            if(colorTheme.equals("Light")) {

                colorTheme("Dark");

            } else {

                colorTheme("Light");
            }
        }
    }

    public void colorTheme(String theme) {

        if (theme.equals("Light")) {

            colorTheme = "Light";

            frame.getContentPane().setBackground(Color.WHITE);

            for (JButton buttons : Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonDivide, buttonMultiply, buttonMinus, buttonDecimal, buttonEquals, buttonDelete, buttonClear, buttonTheme)) {
                buttons.setBackground(Color.WHITE);
                buttons.setForeground(Color.BLACK);
            }

        } else {

            colorTheme = "Dark";

            frame.getContentPane().setBackground(new Color(44, 47, 51));

            for (JButton buttons : Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonDivide, buttonMultiply, buttonMinus, buttonDecimal, buttonEquals, buttonDelete, buttonClear, buttonTheme)) {
                buttons.setBackground(new Color(44, 47, 51));
                buttons.setForeground(Color.WHITE);
            }
        }
    }
}
