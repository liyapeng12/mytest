package cn.itheima.demo1;

import java.util.Scanner;

public class homework6 {
	
	public static void main(String[] args) {
		//����int���͵ı���a,����int���͵ı���b
		//ʹ����Ԫ������ж����a����b����a��b�ĺ�
		//���򷵻�a��b�ĳ˻�,��ӡ���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a>b)?a+b:a*b;
		System.out.println(c);
	
	}

}
