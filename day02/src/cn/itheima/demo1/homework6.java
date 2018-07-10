package cn.itheima.demo1;

import java.util.Scanner;

public class homework6 {
	
	public static void main(String[] args) {
		//定义int类型的变量a,定义int类型的变量b
		//使用三元运算符判断如果a大于b返回a与b的和
		//否则返回a与b的乘积,打印结果
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a>b)?a+b:a*b;
		System.out.println(c);
	
	}

}
