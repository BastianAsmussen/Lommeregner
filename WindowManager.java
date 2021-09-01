package dev.asmussen;

import javax.swing.*;
import java.awt.Color;

public class WindowManager {

    public static void Create() {

        JFrame frame = new JFrame("Lommeregner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,525);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(55,55,55));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
