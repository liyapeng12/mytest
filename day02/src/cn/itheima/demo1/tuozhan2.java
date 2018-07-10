package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入本金：");
		double bj = sc.nextInt();
		double a = bj*(1+0.0225);
		double b = bj*(1+0.027);
		double c = bj*(1+0.0324);
		double d = bj*(1+0.036);
		System.out.println("本金为："+bj);
		System.out.println("存取一年后的本息是："+a);
		System.out.println("存取两年后的本息是："+b);
		System.out.println("存取三年后的本息是："+c);
		System.out.println("存取五年后的本息是："+d);
		



	}

}
