package org.ergemp.swingExamples;

import javax.swing.*;
import java.awt.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World GUI");
        //frame.setSize(400,400);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLayout(null);

        frame.pack();
        frame.setVisible(true);
    }
}
