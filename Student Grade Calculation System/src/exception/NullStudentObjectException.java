package exception;

public class NullStudentObjectException extends Exception { //inheriting exception class
	public String toString()
	{
		return "Object is null";             //return desired message
	}

}
