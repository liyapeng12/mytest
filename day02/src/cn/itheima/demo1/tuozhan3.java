package cn.itheima.demo1;

import java.util.Scanner;

public class tuozhan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入Java的成绩：");
		int Java = sc.nextInt();
		System.out.print("请输入SQL的成绩：");
		int SQL = sc.nextInt();
		System.out.print("请输入Web的成绩：");
		int Web = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("Java	SQL	Web");
		System.out.println(Java+"	"+SQL+"	"+Web);
		System.out.println("--------------------");
		int min = Java-SQL;
		int pjf = (Java+SQL+Web)/3;
		System.out.println("Java和SQL的成绩差："+min);
		System.out.println("三门课的平均分是："+pjf);


	}

}
