package cn.itheima.demo1;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = s/100;
		int b = s/10%10;
		int c = s%10;
		System.out.println(s+"�ĸ�λ��"+c+",ʮλ��"+b+",��λ��"+a);

	}

}
