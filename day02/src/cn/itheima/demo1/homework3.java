package cn.itheima.demo1;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		//键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中,
		//输出结果如:我的姓名是张三,年龄25岁,身高180CM
		//(提示姓名是String类型,需要使用Scanner的next()方法.)
		Scanner sc = new Scanner(System.in);
		String xm = sc.next();
		int nl = sc.nextInt();
		int sg = sc.nextInt();
		System.out.println("我的姓名是" + xm +","+ "年龄" + nl + "岁," + "身高" + sg + "cm");
	
	}

}
