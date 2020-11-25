package com.xing.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame ();
        Panel panel = new Panel ();

        frame.setLayout (null);

        //给窗口Frame设置坐标
        frame.setBounds (200,200,400,400);
        frame.setBackground (new Color (0x939347));

        //给panel设置坐标，相对于Frame
        panel.setBounds (50,50,300,300);
        panel.setBackground (new Color (0xE72F3E));

        frame.add(panel);
        frame.setVisible (true);

        frame.addWindowListener (new WindowAdapter () {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit (0);
            }
        });

    }
}
