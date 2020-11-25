package com.xing.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//练习的demo讲解
public class ExDemo {
    public static void main(String[] args) {
        Frame frame = new Frame ();

        frame.setSize (400,400);
        frame.setLocation (200,200);
        frame.setVisible (true);
        frame.setBackground (Color.BLACK);
        frame.setLayout (new GridLayout (2,1));

        Panel p1 = new Panel (new BorderLayout ());
        Panel p2 = new Panel (new GridLayout (2,1));
        Panel p3 = new Panel (new BorderLayout ());
        Panel p4 = new Panel (new GridLayout (2,1) );

        p2.add (new Button ("p2-button-1"));
        p2.add (new Button ("p2-button-2"));

        p1.add (new Button ("west-1"),BorderLayout.WEST);
        p1.add (new Button ("east-2"),BorderLayout.EAST);
        p1.add(p2,BorderLayout.CENTER);

        for (int i = 0; i < 4; i++) {
            p4.add (new Button ("for-"+i));
        }
        p3.add (new Button ("west-1"),BorderLayout.WEST);
        p3.add (new Button ("east-2"),BorderLayout.EAST);
        p3.add (p4,BorderLayout.CENTER);

        frame.add (p1);
        frame.add (p3);

        frame.addWindowListener (new WindowAdapter () {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit (0);
            }
        });







    }
}
