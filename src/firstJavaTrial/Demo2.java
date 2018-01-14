package firstJavaTrial;

public class Demo2 implements MyInterface {

	@Override
	public void method1() {
		System.out.println("implementation of method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("implementation of method 2");
		
	}
	public static void main (String args[]){
		MyInterface obj = new Demo2();
		obj.method1();
		obj.method2();
	}
}
