package cn.itheima.demo1;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		//����¼��һ�������εĳ��Ϳ�(���Ϳ�Ϊint����)
		//���㳤���ε�������ܳ�
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int k = sc.nextInt();
		int mj = c*k;
		int zc = 2*(c+k);
		System.out.println("�����ε������"+mj+"m^2,�ܳ���"+zc+"m");
	}

}
