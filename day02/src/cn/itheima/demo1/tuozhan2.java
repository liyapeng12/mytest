package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����뱾��");
		double bj = sc.nextInt();
		double a = bj*(1+0.0225);
		double b = bj*(1+0.027);
		double c = bj*(1+0.0324);
		double d = bj*(1+0.036);
		System.out.println("����Ϊ��"+bj);
		System.out.println("��ȡһ���ı�Ϣ�ǣ�"+a);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+b);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+c);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�"+d);
		



	}

}
