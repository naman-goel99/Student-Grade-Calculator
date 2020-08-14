package main;
import service.StudentReport;
import service.StudentService;
import bean.Student;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;
import java.util.*;
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
		//data[4]=new Student("B2",new int[] {13,88,13});
		data[4]=null;
		data[5]=new Student("C3",new int[] {14,14,99});
		data[6]=new Student(null,new int[] {13,88,13});
		data[7]=new Student("A2",new int[] {77,55,12});
		data[8]=new Student("A2",null);
		data[9]=new Student("C3",new int[] {100,100,99});
	}
	StudentMain(int n)
	{
	}
	public Student[] usertestcases(int n)
	{
		Scanner sc=new Scanner(System.in);
		Student[] data2=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Do you have record to enter?");
			System.out.println("Press 1:To enter record");
			System.out.println("Press 2:To continue");
			int c1=sc.nextInt();
			sc.nextLine();
			if(c1==1)
			{
				System.out.println("Enter name if present otherwise enter null:");
				String name=sc.nextLine();
				System.out.println("Press 1:Marks are present");
				System.out.println("Press 2:Marks are not present");
				int c2=sc.nextInt();
				if(c2==1)
				{
					int[] marksarray=new int[3];
					int l=0;
					while(l<3)
					{
						try
						{
							System.out.println("Enter marks:");
							int j=sc.nextInt();
							sc.nextLine();
							marksarray[l]=j;
							l++;
						}
						catch(Exception e)
						{
							sc.nextLine();
							System.out.println("Please,enter marks in integer!!");
						}
					}
					data2[i]=new Student(name,marksarray);
					
				}
				else
				{
					data2[i]=new Student(name,null);
				}
			}
			else
			{
				data2[i]=null;
			}
			
		}
		return data2;
	}
	public static void main(String[] args)
	{
		System.out.println(".....................................Welcome to the Students Grade Calculator............................");
		StudentReport sr=new StudentReport();
		System.out.println("Sample Test Case");
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
		System.out.println("-------------------------------------------------Summary----------------------------------------");
		System.out.println("Number of Null Marks Array : "+ss.findNumberOfNullMarksArray(data));
		System.out.println("Number of Null Name : "+ss.findNumberOfNullName(data));
		System.out.println("Number of Null Objects : "+ss.findNumberOfNullObjects(data));
		System.out.println("------------------------------------------------------------------------------------------------");
		Scanner sc2=new Scanner(System.in);
		System.out.println("Do you want to enter the records,type Yes or No:");
		String response=sc2.nextLine();
		if(response.equals("Yes"))
		{
			System.out.println("Enter the number of records:");
			int n=sc2.nextInt();
			sc2.nextLine();
			Student[] data3=new Student[n];
			StudentMain sm2=new StudentMain(n);
			data3=sm2.usertestcases(n);
			StudentReport sr2=new StudentReport();
			for(int i=0;i<data3.length;i++)
			{
				try {
					String s1=sr2.validate(data3[i]);
					if(s1=="VALID")
					{
						String g=sr2.findGrades(data3[i]);
						System.out.print(data3[i].getname()+":");
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
			StudentService ss2=new StudentService();
			System.out.println("-------------------------------------------------Summary----------------------------------------");
			System.out.println("Number of Null Marks Array : "+ss2.findNumberOfNullMarksArray(data3));
			System.out.println("Number of Null Name : "+ss2.findNumberOfNullName(data3));
			System.out.println("Number of Null Objects : "+ss2.findNumberOfNullObjects(data3));
			System.out.println("------------------------------------------------------------------------------------------------");
			
		}
		else
			System.out.println("Thank  you");
	}
	

}
