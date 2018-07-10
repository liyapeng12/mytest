package cn.itheima.demo1;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		//键盘录入一个长方形的长和宽(长和宽为int类型)
		//计算长方形的面积和周长
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int k = sc.nextInt();
		int mj = c*k;
		int zc = 2*(c+k);
		System.out.println("长方形的面积是"+mj+"m^2,周长是"+zc+"m");
	}

}
