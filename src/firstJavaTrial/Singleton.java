package firstJavaTrial;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	/* A private Constructor prevents any other 
	   class from instantiating.
	*/
	private Singleton(){}
	
	/*Static 'instance' method*/
	public static synchronized Singleton getInstance(){ // if sync then only one threas can execute this method
		return singleton;
	}
	/* Other methods protected by singleton-ness */
	protected static void demoMethod(){
		System.out.println("demoMethod for singleton");
	}
}
