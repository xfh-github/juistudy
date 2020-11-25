package com.xing.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame ();

        Button button1 = new Button ("button1");
        Button button2 = new Button ("button2");
        Button button3 = new Button ("button3");
        Button button4 = new Button ("button4");
        Button button5 = new Button ("button5");
        Button button6 = new Button ("button6");

        frame.setLayout (new GridLayout (3,2));

        frame.add (button1);
        frame.add (button2);
        frame.add (button3);
        frame.add (button4);
        frame.add (button5);
        frame.add (button6);

        frame.pack ();
        frame.setVisible (true);
        frame.addWindowListener (new WindowAdapter () {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit (0);
            }
        });
    }
}
