package org.ergemp.swingExamples;

import javax.swing.*;
import java.awt.*;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setPreferredSize(new Dimension(400, 400));
        JLabel label = new JLabel("Hi. I am a GUI.");

        //frame.add(label);
        frame.getContentPane().add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
