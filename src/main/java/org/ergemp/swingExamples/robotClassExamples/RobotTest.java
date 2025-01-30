package org.ergemp.swingExamples.robotClassExamples;

import java.awt.*;

public class RobotTest {
    public static void main(String[] args) {
        try {
            // These coordinates are screen coordinates
            int xCoord = 500;
            int yCoord = 500;

            // Move the cursor
            Robot robot = new Robot();
            robot.mouseMove(xCoord, yCoord);
        } catch (AWTException e) {
        }

        try {
            //moves mouse to the middle of the screen
            new Robot().mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
            //remember to use try-catch block (always, and remember to delete this)
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
