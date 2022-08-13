package com.jerry.ikun;

import java.util.Scanner;

public class ikun {
    /**
     <li>注：此程序纯属娱乐</li>
     */
    public static void main(String[] args) {
        Scanner ikun = new Scanner(System.in);

        while (true) {
        System.out.print("请输入您要做的事(help可获取帮助):");
        String answer = ikun.next();

        // 判断
        switch (answer) {
            case "help":
                System.out.println("""
                        选项：
                            1.输入"叫声"
                            2.输入"自我介绍"
                            3.输入"rap"
                            4.输入"综合"
                        """);
                break;
            case "叫声":
                System.out.println("你干嘛~~~哎呦~~~你干嘛~~~");
                break;

            case "自我介绍":
                System.out.println("""
                        全名制作人员们，大家好，我是练习时长两年半的个人练习生，蔡徐坤。
                        我喜欢唱，跳，rap，篮球。
                        """);
                break;

            case "rap":
                System.out.println("鸡(只因)你太美~~~");
                break;

            case "综合":
                System.out.println("""
                        全名制作人员们，大家好，我是练习时长两年半的个人练习生，蔡徐坤。
                        我喜欢唱，跳，rap，篮球。
                        """);
                System.out.println("鸡(只因)你太美~~~");
                System.out.println("你干嘛~~~哎呦~~~你干嘛~~~");
                break;

            default:
                System.out.println("你别乱打，没有这个选项。");
                break;
        }

        }
    }
}
