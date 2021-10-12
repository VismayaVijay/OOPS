/*5.Create classes Student and Sports. Create another class Result inherited from Student and 
Sports. Display the academic and sports score of a student.*/

import java.io.*;
class students
	{
	int rollno;
	String name;
	float marks;
	void getdata(int rollno,String name,float marks)
		{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		}
	}
interface sports
	{
	final int score=10;
	void show();
	}
class result extends students implements sports
	{
	public void show()
		{
		System.out.println("roll no:"+ rollno);
		System.out.println("name:"+ name);
		System.out.println("marks:"+ marks);
		System.out.println("score:"+ score);
		}
	}
class inter1
	{
	public static void main(String []args)
		{
		int rollno=0; 
		String name=""; 
		float marks=0;
		result r = new result();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("enter rollno,name,marks:");
			rollno=Integer.parseInt(br.readLine());
			name=br.readLine();
			marks=Float.parseFloat(br.readLine());
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		r.getdata(rollno,name,marks);
		r.show();
		}
	}