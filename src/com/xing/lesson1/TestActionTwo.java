package com.xing.lesson1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
        //两个按钮，实现同一监听，
        //开始 结束

        Frame frame = new Frame ("开始-停止");
        Button button1 = new Button ("start");
        Button button2 = new Button ("stop");

        button2.setActionCommand ("button2-stop");
        button1.setActionCommand ("设置修改值，把之前的默认值，覆盖掉Text01");

        MyMonitor myMonitor = new MyMonitor ();

        button1.addActionListener (myMonitor);
        button2.addActionListener (myMonitor);

        frame.add (button1,BorderLayout.SOUTH);
        frame.add (button2,BorderLayout.NORTH);

        frame.pack ();
        frame.setVisible (true);


    }
}
class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println ("按钮被点击了：msg:"+e.getActionCommand ());
    }
}