package dev.asmussen;

// Imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {

    JFrame frame;

    JTextField field;

    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonDecimal;
    JButton buttonEquals, buttonClear, buttonDelete;

    static double valueOne = 0;
    static double valueTwo = 0;
    static double result = 0;

    static int operator = 0;

    static final String errorMessage = "Matematik tegn kan ikke sættes der!";

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

        // Funktioner
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
        buttonDelete = new JButton("DEL");

        // Lav grænser til de forskellige knapper.
        field.setBounds(30,40,280,30);

        button7.setBounds(40, 100, 50, 40);
        button8.setBounds(110, 100, 50, 40);
        button9.setBounds(180, 100, 50, 40);

        buttonDivide.setBounds(250, 100, 50, 40);

        button4.setBounds(40,170,50,40);
        button5.setBounds(110,170,50,40);
        button6.setBounds(180,170,50,40);

        buttonMultiply.setBounds(250,170,50,40);

        button1.setBounds(40,240,50,40);
        button2.setBounds(110,240,50,40);
        button3.setBounds(180,240,50,40);

        buttonMinus.setBounds(250,240,50,40);

        buttonDecimal.setBounds(40,310,50,40);

        button0.setBounds(110,310,50,40);

        buttonEquals.setBounds(180,310,50,40);
        buttonPlus.setBounds(250,310,50,40);
        buttonDelete.setBounds(60,380,100,40);
        buttonClear.setBounds(180,380,100,40);

        // Sæt de forskellige knapper i GUI'en og andre diverse GUI ting så som ActionListeners.
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

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();

        if(src == button1) {

            field.setText(field.getText().concat("1"));

        } if(src == button2) {

            field.setText(field.getText().concat("2"));

        } if(src == button3) {

            field.setText(field.getText().concat("3"));

        } if(src == button4) {

            field.setText(field.getText().concat("4"));

        } if(src == button5) {

            field.setText(field.getText().concat("5"));

        } if(src == button6) {

            field.setText(field.getText().concat("6"));

        } if(src == button7) {

            field.setText(field.getText().concat("7"));

        } if(src == button8) {

            field.setText(field.getText().concat("8"));

        } if(src == button9) {

            field.setText(field.getText().concat("9"));

        } if(src ==button0) {

            field.setText(field.getText().concat("0"));

        } if(src == buttonDecimal) {

            field.setText(field.getText().concat("."));

        } if(src == buttonPlus) {

            valueOne = Double.parseDouble(field.getText());
            operator = 1;

            field.setText("");

        } if(src == buttonMinus) {

            valueOne = Double.parseDouble(field.getText());
            operator = 2;

            field.setText("");

        } if(src == buttonMultiply) {

            valueOne=Double.parseDouble(field.getText());
            operator=3;
            field.setText("");

        } if(src == buttonDivide) {

            valueOne=Double.parseDouble(field.getText());
            operator=4;
            field.setText("");

        } if(src == buttonEquals) {

            valueTwo = Double.parseDouble(field.getText());

            switch(operator) {

                case 1:

                    result = valueOne + valueTwo;
                    break;
                case 2:

                    result = valueOne - valueTwo;
                    break;

                case 3:

                    result = valueOne * valueTwo;
                    break;

                case 4:
                    result = valueOne / valueTwo;
                    break;

                default:

                    result = 0;
            }

            field.setText("" + result);

        } if(src == buttonClear) {

            field.setText("");

        } if(e.getSource()== buttonDelete) {

            String str = field.getText();
            field.setText("");

            for(int i = 0; i < str.length() - 1; i++) {

                field.setText(field.getText() + str.charAt(i));
            }
        }
    }
}
