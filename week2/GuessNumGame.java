package week2;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumGame
{

	public static void main(String[] args)
	{
		GuessNumGame a=new GuessNumGame();
		int[] arryrank={999,999,999};//���а����� ֻ��¼ǰ����
		for(int i = 1;1>0;i++)
		{
			int j=a.jugement();
				if(j==1)
				{
					int grade=a.run();
					a.rank(arryrank,grade);
				}
				else if(j==2)
				{
					 a.printArry(arryrank);
					
				}
				else if(j==3)
				{
					System.out.println("Game Over");
					break;
				}
				else 
				{
					System.out.println("error");
					System.out.println("Please input again");
				}
		}
		
	}
		//������Ϸ
		public int run()
		{
			Scanner scanner = new Scanner(System.in);
			int x = (int)(Math.random()*100);
			int num;
			for(int j=1;1>0;j++)
			{
				System.out.print("����������:");
				int y=scanner.nextInt();
				if(x==y)
				{
					System.out.println("�����");
					System.out.println("���ô���"+j);
					num=j;
					break;
				}
				if(y<x)
				{
					System.out.println("С��");
				}
				if(y>x)
				{
					System.out.println("����");
				}
			
			}
			
			return num;
		}
		public int jugement()//�ж�
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.��ʼ��Ϸ������һ�Σ���2.�鿴���а�3.������Ϸ");
			int juge =scanner.nextInt();
			return juge;
		}
		public void rank(int[] arry,int j)//���а�ʵ��
		{
			if(arry[2]>j)
			{
				arry[2]=j;
			}
			Arrays.sort(arry);
		}
		public void printArry(int[] arry)//������а�
		{
			for(int i= 0;i< arry.length;i++)
			{
				System.out.print(arry[i]+",");
			}
			System.out.print("\n");
		}

}

