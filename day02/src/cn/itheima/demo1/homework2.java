package cn.itheima.demo1;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		//键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,
		//如果成绩小于60输出”不及格”
		Scanner sc =new Scanner(System.in);
		int cj = sc.nextInt();
		boolean s = (cj >= 60)?true:false;
		System.out.println(s);
		
	}
}
