package week3;
/*
 * 创建线程池 最多四个线程
 * 一共20个任务，每个人物完成后 总数count增加4 最后值为80
 * */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoorThread 
{
	public static void main(String[] args) 
	{
		ExecutorService Service = Executors.newFixedThreadPool(4);//创建线程池，最多4个线程
		System.out.println("加入20个任务");
		TestRunnable run = new TestRunnable();
		for(int i = 1;i <= 20;i++){
			Service.execute(run);
		}
		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		Service.shutdown();
		System.out.println("20个任务全部完成");
	}

}
class TestRunnable implements Runnable
{
	int count = 0;
	Object obj = new Object();//同步锁
	@Override
	public void run()
	{
		synchronized(obj)
		{
			System.out.println(Thread.currentThread().getName()+"线程启动,开始执行任务");
			for(int i = 0; i <=3; i++)
			{
				count++;
				if(i == 3)
				{
					System.out.println("任务完成，该次任务完成后参数值为"+count);
				}
			}
			System.out.println(Thread.currentThread().getName()+"任务结束");
		try
		{
			Thread.sleep(300);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
		}
	}
}