import java.lang.reflect.Method;


public class WasRun extends TestCase{
	public boolean wasRun = false;
	public boolean wasSetUp;
	public StringBuffer log = new StringBuffer();
	
	
	public WasRun(String methodName){
		super(methodName);
	}
	
	
	public void testMethod(){
		wasRun = true;
		log.append(" testMethod");
	}
	
	public void setUp(){
		wasRun = false;
		wasSetUp = true;
		log.append("setUp");
	}
	
	public void tearDown(){
		log.append(" tearDown");
	}
	
	public void testBrokenMethod(){
		throw new RuntimeException("this is broken method");
	}
	
	

}
