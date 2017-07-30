package week3;
/*
 * �����̳߳� ����ĸ��߳�
 * һ��20������ÿ��������ɺ� ����count����4 ���ֵΪ80
 * */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoorThread 
{
	public static void main(String[] args) 
	{
		ExecutorService Service = Executors.newFixedThreadPool(4);//�����̳߳أ����4���߳�
		System.out.println("����20������");
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
		System.out.println("20������ȫ�����");
	}

}
class TestRunnable implements Runnable
{
	int count = 0;
	Object obj = new Object();//ͬ����
	@Override
	public void run()
	{
		synchronized(obj)
		{
			System.out.println(Thread.currentThread().getName()+"�߳�����,��ʼִ������");
			for(int i = 0; i <=3; i++)
			{
				count++;
				if(i == 3)
				{
					System.out.println("������ɣ��ô�������ɺ����ֵΪ"+count);
				}
			}
			System.out.println(Thread.currentThread().getName()+"�������");
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