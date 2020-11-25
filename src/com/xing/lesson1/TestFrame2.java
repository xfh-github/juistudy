package com.xing.lesson1;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口 new
        MyFrame myFrame1 = new MyFrame (100, 100, 20, 20,Color.BLUE);
        MyFrame myFrame2 = new MyFrame (300, 100, 20, 20,Color.YELLOW);
        MyFrame myFrame3 = new MyFrame (100, 300, 20, 20,Color.red);
        MyFrame myFrame4 = new MyFrame (300, 100, 20, 20,Color.magenta);

    }
}
class MyFrame extends Frame{
    static int id=0;
    public MyFrame(int x, int y, int w, int h, Color color){
        super("MyFrame+"+(++id));
        setBackground (color);
        setBounds (x,y,w,h);
        setVisible (true);
    }
}