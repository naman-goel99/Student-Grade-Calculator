package main;
import service.StudentReport;
import service.StudentService;
import bean.Student;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;

public class StudentMain {
	static Student[] data=new Student[10];
	StudentMain()
	{
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
		data[0]=new Student("A1",new int[] {72,73,74});
		data[1]=new Student("B1",new int[] {75,76,77});
		data[2]=new Student("C1",new int[] {99,99,99});
		data[3]=null;
		data[4]=new Student("B2",new int[] {13,88,13});
		data[5]=new Student("C3",new int[] {14,14,99});
		data[6]=new Student(null,new int[] {13,88,13});
		data[7]=new Student("A2",new int[] {77,55,12});
		data[8]=new Student("A2",null);
		data[9]=new Student("C3",new int[] {100,100,99});
	}
	public static void main(String[] args)
	{
		System.out.println(".....................................Welcome to the Students Grade Calculator............................");
		StudentReport sr=new StudentReport();
		StudentMain sm=new StudentMain();
		for(int i=0;i<data.length;i++)
		{
			try {
				String s1=sr.validate(data[i]);
				if(s1=="VALID")
				{
					String g=sr.findGrades(data[i]);
					System.out.print(data[i].getname()+":");
					System.out.println(g);
				}
			}catch(NullNameException e)
			{
				System.out.println(e);
			}catch(NullMarksArrayException e)
			{
				System.out.println(e);
			}catch(NullStudentObjectException e)
			{
				System.out.println(e);
			}
		}
		StudentService ss=new StudentService();
		System.out.println("--------------------------Summary---------------------");
		System.out.println("Number of Null Marks Array : "+ss.findNumberOfNullMarksArray(data));
		System.out.println("Number of Null Name : "+ss.findNumberOfNullName(data));
		System.out.println("Number of Null Objects : "+ss.findNumberOfNullObjects(data));
		
		
	}
	

}
