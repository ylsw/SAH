package week2;
//面向对象：三个特征：封装，继承，多态


//以后开发：其实就是找对象使用，如果没有对象，就创建一个对象。

//找对象、建立对象、使用对象、维护对象的关系

/*
 * 类和对象的关系：
 * 
 * 
 * 现实生活中的对象：张三李四
 *     想要描述：提取对象中共性内容，对具体的抽象
 *     描述时：这些对象的共性有：姓名、年龄、性别、学习Java功能
 *     
 *     映射到Java中，描述就是class定义的类
 *     具体对象就是对应Java在堆内存中有new建立实体
 *     
 *     
 * 类：就是对现实生活中事物的描述
 * 对象：就是这类事物，实实在在存在的个体
 *     
 * 
 */
class Car
{
	//描述颜色
	String color = "红色";
	//描述轮胎数
	int num = 4;
	
	//运行行为
	void run()
	{
		System.out.println(color+".."+num);
	}
}

public class Object1 {

	public static void main(String[] args) {
	//生产汽车 在Java中通过new操作符来完成
	//其实就是在堆内存中产生一个实体
	Car c = new Car();//c就是一个类 类型变量 （Car类型）  记住：类类型变量指向对象
    
	//需求： 将已有车的颜色改成蓝色，指挥该对象完成 格式： 对象.对象成员
	c.color = "blue";
	
	c.run();
	
	
	}

}
