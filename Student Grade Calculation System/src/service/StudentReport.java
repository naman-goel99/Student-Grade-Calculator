package service;

import bean.Student;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student stuobj)
	{
		int[] student_marks=stuobj.getmarks();
		int sum=0;
		String grade="";
		int flag=0;
		for(int i=0;i<student_marks.length;i++)
		{
			if(student_marks[i]<35)
			{
				grade="F";
				flag=1;
				break;
			}
			else
			{
				sum+=student_marks[i];
			}
		}
		if(flag==0)
		{
			if(sum<150)
				grade="C";
			else if(sum>=150 && sum<200)
				grade="B";
			else if(sum>=200 && sum<250)
				grade="A";
			else
				grade="A+";
		}
		return grade;
	}
	public String validate(Student s) throws NullMarksArrayException,NullNameException,NullStudentObjectException
	{
		if(s==null)
			throw new NullStudentObjectException();
		else if(s.getname()==null)
			throw new NullNameException();
		else if(s.getmarks()==null)
			throw new NullMarksArrayException();
		else
			return "VALID";
			
	}

}
