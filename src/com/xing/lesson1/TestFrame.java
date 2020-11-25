package com.xing.lesson1;

import java.awt.*;

//gui的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame ，JDK 看源码
        Frame frame = new Frame ("我的第一个Java图形界面窗户");
        //需要设置可见行
        frame.setVisible (true);
        //设置窗口大小
        frame.setSize (400,400);
        //设置背景颜色
        frame.setBackground (new Color (196, 129, 31));
        //设置弹出的初始位置
        frame.setLocation (100,100);
        //设置大小固定
        frame.setResizable (false);



    }
}
