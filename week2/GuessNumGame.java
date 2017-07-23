package week2;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumGame
{

	public static void main(String[] args)
	{
		GuessNumGame a=new GuessNumGame();
		int[] arryrank={999,999,999};//排行榜数组 只记录前三名
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
		//运行游戏
		public int run()
		{
			Scanner scanner = new Scanner(System.in);
			int x = (int)(Math.random()*100);
			int num;
			for(int j=1;1>0;j++)
			{
				System.out.print("请输入数字:");
				int y=scanner.nextInt();
				if(x==y)
				{
					System.out.println("答对了");
					System.out.println("所用次数"+j);
					num=j;
					break;
				}
				if(y<x)
				{
					System.out.println("小了");
				}
				if(y>x)
				{
					System.out.println("大了");
				}
			
			}
			
			return num;
		}
		public int jugement()//判断
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.开始游戏（再玩一次）、2.查看排行榜、3.结束游戏");
			int juge =scanner.nextInt();
			return juge;
		}
		public void rank(int[] arry,int j)//排行榜实现
		{
			if(arry[2]>j)
			{
				arry[2]=j;
			}
			Arrays.sort(arry);
		}
		public void printArry(int[] arry)//输出排行榜
		{
			for(int i= 0;i< arry.length;i++)
			{
				System.out.print(arry[i]+",");
			}
			System.out.print("\n");
		}

}

