package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入4位会员卡号：");
		int s = sc.nextInt();
		int a = s/1000;
		int b = s/100%10;
		int c = s/10%10;
		int d = s%10;
		int sum1=a+b+c+d;
		System.out.println("会员卡号"+s+"各位之和："+sum1);
		String e=(sum1>20)?"是":"不是";
		System.out.println("会员卡号"+s+e+"幸运客户");
		System.out.println();
		System.out.println();
		System.out.print("请输入4位会员卡号：");
		int y = sc.nextInt();
		int a1 = y/1000;
		int b1 = y/100%10;
		
		int c1 = y/10%10;
		int d1= y%10;
		int sum2=a1+b1+c1+d1;
		String e1=(sum2>20)?"是":"不是";
		System.out.println("会员卡号"+y+"各位之和："+sum2);
		System.out.println("会员卡号"+y+e1+"幸运客户");

	}

}
