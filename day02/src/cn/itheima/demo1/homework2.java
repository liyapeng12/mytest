package cn.itheima.demo1;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		//����¼��һ��ѧ���ɼ�(int����),����ɼ����ڵ���60���������,
		//����ɼ�С��60�����������
		Scanner sc =new Scanner(System.in);
		int cj = sc.nextInt();
		boolean s = (cj >= 60)?true:false;
		System.out.println(s);
		
	}
}
