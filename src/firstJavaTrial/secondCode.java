package firstJavaTrial;

public class secondCode extends firstCode {//This is how inheritance works
	secondCode(String name,int number ) {
		super(number, name);
		// you need to use super because I have a constructor in parent
		super.age=number;
		super.Myname=name;
	}

	public static void main(String args[]){
		 secondCode obj1 = new secondCode("Hasan",1);
		 secondCode obj2 = new secondCode("Can",2);
		 obj1.info();// other methods can easily be called
		 obj2.info();
	}

}
