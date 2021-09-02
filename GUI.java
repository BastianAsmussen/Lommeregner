package dev.asmussen;

// Imports
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Spliterator;

public class GUI {

    // Opret private variabler så brugeren ikke skal tænke på dem.
    private String display;
    private final String operatorError = "Her kan du ikke sætte et matematik tegn!";

    private JTextField field;
    private JFrame frame;
    private JPanel panel;

    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_0;

    private JButton button_clear;
    private JButton button_plus;
    private JButton button_minus;
    private JButton button_multiply;
    private JButton button_devide;
    private JButton button_comma;
    private JButton button_calculate;


    // GUI constructor til at lave GUI'en. For at lave en GUI brug: new GUI();.
    public GUI() {

        frame = new JFrame();

        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_4 = new JButton("4");
        button_5 = new JButton("5");
        button_6 = new JButton("6");
        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        button_0 = new JButton("0");
        button_plus = new JButton("+");
        button_minus = new JButton("-");
        button_multiply = new JButton("*");
        button_devide = new JButton("/");
        button_comma = new JButton(",");
        button_clear = new JButton("C");
        button_calculate = new JButton("=");

        button_1.addActionListener(new ActionListenerOne());
        button_2.addActionListener(new ActionListenerTwo());
        button_3.addActionListener(new ActionListenerThree());
        button_4.addActionListener(new ActionListenerFour());
        button_5.addActionListener(new ActionListenerFive());
        button_6.addActionListener(new ActionListenerSix());
        button_7.addActionListener(new ActionListenerSeven());
        button_8.addActionListener(new ActionListenerEight());
        button_9.addActionListener(new ActionListenerNine());
        button_0.addActionListener(new ActionListenerZero());
        button_plus.addActionListener(new ActionListenerPlus());
        button_minus.addActionListener(new ActionListenerMinus());
        button_multiply.addActionListener(new ActionListenerMultiply());
        button_devide.addActionListener(new ActionListenerDevide());
        button_comma.addActionListener(new ActionListenerComma());
        button_clear.addActionListener(new ActionListenerClear());
        button_calculate.addActionListener(new ActionListenerCalculate());

        field = new JTextField();
        field.setEditable(false);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(field);

        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);
        panel.add(button_4);
        panel.add(button_5);
        panel.add(button_6);
        panel.add(button_7);
        panel.add(button_8);
        panel.add(button_9);
        panel.add(button_0);
        panel.add(button_plus);
        panel.add(button_minus);
        panel.add(button_multiply);
        panel.add(button_devide);
        panel.add(button_comma);
        panel.add(button_clear);
        panel.add(button_calculate);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Lommeregner");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,500);
    }

    public class ActionListenerOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "1");
        }
    }

    public class ActionListenerTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "2");
        }
    }

    public class ActionListenerThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "3");
        }
    }

    public class ActionListenerFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "4");
        }
    }

    public class ActionListenerFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "5");
        }
    }

    public class ActionListenerSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "6");
        }
    }

    public class ActionListenerSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "7");
        }
    }

    public class ActionListenerEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "8");
        }
    }

    public class ActionListenerNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "9");
        }
    }

    public class ActionListenerZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            field.setText(display + "0");
        }
    }

    public class ActionListenerPlus implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            if(display.length() <= 0) {
                JOptionPane.showMessageDialog(frame, operatorError);

            }

            char operator = display.charAt(display.length() - 1);
            switch(operator) {
                case '+':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '-':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '*':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '/':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '.':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                default:
                    field.setText(display + "+");
            }
        }
    }

    public class ActionListenerMinus implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            if(display.length() <= 0) {
                JOptionPane.showMessageDialog(frame, operatorError);

            }

            char operator = display.charAt(display.length() - 1);

            switch(operator) {
                case '+':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '-':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '*':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '/':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '.':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                default:
                    field.setText(display + "-");
            }
        }
    }

    public class ActionListenerMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            if(display.length() <= 0) {
                JOptionPane.showMessageDialog(frame, operatorError);

            }

            char operator = display.charAt(display.length() - 1);

            switch(operator) {
                case '+':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '-':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '*':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '/':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '.':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                default:
                    field.setText(display + "*");
            }
        }
    }

    public class ActionListenerDevide implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            if(display.length() <= 0) {

                JOptionPane.showMessageDialog(frame, operatorError);
            }

            char operator = display.charAt(display.length() - 1);

            switch(operator) {
                case '+':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '-':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '*':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '/':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '.':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                default:
                    field.setText(display + "/");
            }
        }
    }

    public class ActionListenerComma implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();
            if(display.length() <= 0) {

                JOptionPane.showMessageDialog(frame, operatorError);
            }

            char operator = display.charAt(display.length() - 1);

            switch(operator) {
                case '+':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '-':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '*':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '/':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                case '.':
                    JOptionPane.showMessageDialog(frame, operatorError);
                    break;

                default:
                    field.setText(display + ".");
            }
        }
    }

    public class ActionListenerClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            field.setText("");
        }
    }

    /*
    IKKE FÆRDIGT!
    Denne funktion skal gå ind i Lommeregner.java og begynde at udregne resultatet.
    Så sender Lommeregner.java resultatet tilbage og så bliver det udskrevet på skærmen.
    */
    public class ActionListenerCalculate implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display = field.getText();

            String[] newDisplay = display.split("[+--*/]");
            int length = newDisplay.length;
            
        }
    }
}
