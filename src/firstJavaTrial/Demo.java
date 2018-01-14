package firstJavaTrial;

class Demo extends AbstractClassandMethods{
	// now we must implement all abstract methods
	public int sumOfTwo(int n1, int n2){
		return n1+n2;
	}
	public int sumOfThree(int n1, int n2, int n3){
		return n1+n2+n3;
	}
	
	public static void main(String args[]){
		AbstractClassandMethods obj = new Demo();
		System.out.println(obj.sumOfTwo(1, 2));
		System.out.println(obj.sumOfThree(1, 2,3));
		
		obj.disp();
		
	}	
}