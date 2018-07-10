package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		System.out.println(left+"     "+right);
		int a = left;
		left = right;
		right = a;
		System.out.println("±ä»»ºóÎª:"+left+"     "+right);
	}

}
