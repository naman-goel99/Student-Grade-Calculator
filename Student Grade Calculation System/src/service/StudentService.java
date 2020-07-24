package service;
import bean.Student;
public class StudentService {
	public int findNumberOfNullMarksArray(Student[] s)
	{
		int c1=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=null)
				{
					if(s[i].getmarks()==null)
						c1++;
				}
			}	
		}
		return c1;
	}
	public int findNumberOfNullName(Student[] s)
	{
		int c2=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=null)
				{
					if(s[i].getname()==null)
						c2++;
				}
			}
		}
		return c2; 
	}
	public int findNumberOfNullObjects(Student[] s)
	{
		int c3=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]==null)
					c3++;
			}
		}
		return c3;
	}

}
