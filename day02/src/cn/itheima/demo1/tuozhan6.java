package cn.itheima.demo1;

public class tuozhan6 {
	public static void main(String[] args) {
		int x = 4;
		int y = (--x) + (x--) + (x * 10);// 2
		System.out.println("x = " + x + ",y = " + y);// x=2,y=26
	}

}
