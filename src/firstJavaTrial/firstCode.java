package firstJavaTrial;
import java.util.Scanner;

public class firstCode {
	
	private static String str= "static class example";
	static class MyNestedClass{ // static class example
		public void disp(){
			System.out.println(str);
		}
	}
	
	String Myname;
	int age;
	static int num;
	static String mystr;
	firstCode(int number, String name){//this is a parameterized constructor
		this.Myname = name;
		this.age= number;
	}
	void info(){
		System.out.println("Age: " +age  +" Name: " +Myname);
	}
	static void myMethod(){
		System.out.println("MyMethod");
	}
	static { // a static block
		num=97;
		mystr="blabla";
	}
	public static void main(String[] args){
		
		myMethod();// static can be used without creating any objects
		
		firstCode.MyNestedClass obj = new firstCode.MyNestedClass();
		obj.disp();
		
		System.out.println("Value of num: "+num);
	    System.out.println("Value of mystr: "+mystr);
		
		firstCode obj1 = new firstCode(1,"Can Dupail");
		firstCode obj2 = new firstCode(27,"Hasan Can ÖZKAN");
		
		obj1.info();
		obj2.info();
		
		
		int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
	}
}
