package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Java�ĳɼ���");
		int Java = sc.nextInt();
		System.out.print("������SQL�ĳɼ���");
		int SQL = sc.nextInt();
		System.out.print("������Web�ĳɼ���");
		int Web = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Java	SQL	Web");
		System.out.println(Java+"	"+SQL+"	"+Web);
		System.out.println("--------------------");
		int min = Java-SQL;
		int pjf = (Java+SQL+Web)/3;
		System.out.println("Java��SQL�ĳɼ��"+min);
		System.out.println("���ſε�ƽ�����ǣ�"+pjf);


	}

}
