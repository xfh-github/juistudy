package com.xing.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        //主要用来启动
        MyFrame myFrame = new MyFrame ();
    }
}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField ();
        add (textField);

        //监听这个文本框输入的文字
        MyActionListener myActionListener = new MyActionListener ();
        textField.addActionListener (myActionListener);

        textField.setEchoChar ('*');
        setVisible (true);
        pack ();
    }
}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField)e.getSource (); //获得一个资源返回一个对象
        System.out.println (field.getText ());  //获得输入框的文本
    }
}