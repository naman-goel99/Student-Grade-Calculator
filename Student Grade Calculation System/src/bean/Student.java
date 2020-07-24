package bean;

public class Student {

	String name=null;
	int[] marks=null;
	String grade=null;
	public Student()
	{}
	/*public Student(String grade,int[] marks,String name)
	{
		this.name=name;
		this.marks=marks;
		this.grade=grade;
	}*/
	public Student(String name,int[] marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void  setname(String n)
	{
		this.name=n;
	}
	public String getname()
	{
		return this.name;
	}
	public void setmarks(int[] m)
	{
		this.marks=m;
	}
	public int[] getmarks()
	{
		return this.marks;
	}
	public void setgrade(String g)
	{
		this.grade=g;
	}
	public String getgrade()
	{
		return this.grade;
	}
}
