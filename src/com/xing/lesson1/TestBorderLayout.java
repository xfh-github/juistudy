package com.xing.lesson1;

import java.awt.*;

//东南西北中
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame ("TestBorderLayout");

        Button east = new Button ("east");
        Button CENTER = new Button ("CENTER");
        Button SOUTH = new Button ("SOUTH");
        Button WEST = new Button ("WEST");

        frame.add (east,BorderLayout.EAST);
        frame.add (CENTER,BorderLayout.CENTER);
        frame.add (SOUTH,BorderLayout.SOUTH);
        frame.add (WEST,BorderLayout.WEST);

        frame.setSize (200,200);
        frame.setVisible (true);

    }
}
