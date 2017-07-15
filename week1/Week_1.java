package week1;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Week_1 {

	public static void main(String[] args) {
		int[] arry = {5,87,956,75,84,32,65,74,95};
		selectSort(arry);
		printArry(arry);
		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x>=1&x<=5)
			System.out.println("x在1-5之间");
		else
			System.out.println("x不在1-5之间");

	}
	//选择排序
	public static void selectSort(int[] arry)
	{
		
		for(int i =0;i<arry.length;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]>arry[j])
				{
					int temp= arry[i];
					arry[i]= arry[j];
					arry[j]= temp;
				}
			}
		}
	}
	//输出数组
	public static void printArry(int[] arry)
	{
		for(int i= 0;i< arry.length;i++)
		{
			System.out.print(arry[i]+",");
		}
		System.out.print("\n");
	}
}
