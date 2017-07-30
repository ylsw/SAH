package week3;
abstract class person  //抽象类  人
{
	public abstract void mission();
}
class adult extends person //成年人类  继承自人
{
	public void mission()
	{
		System.out.println("working");
	}
}
class children extends person //小孩类   继承自人
{
	public void mission()
	{
		System.out.println("study");
	}
}
class oldMan extends person // 老人类  继承自人
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
