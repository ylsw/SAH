package week3;
abstract class person  //������  ��
{
	public abstract void mission();
}
class adult extends person //��������  �̳�����
{
	public void mission()
	{
		System.out.println("working");
	}
}
class children extends person //С����   �̳�����
{
	public void mission()
	{
		System.out.println("study");
	}
}
class oldMan extends person // ������  �̳�����
{
	public void mission()
	{
		System.out.println("happy");
	}
}
public class MuchTai {

	public static void main(String[] args) {
		person child1 = new children();
		person adult1 = new adult();
		person oldman1 = new oldMan();
		printMission(adult1);
		printMission(child1);
		printMission(oldman1);
	}

	public static void printMission(person a)
	{
		a.mission();
	}
}
