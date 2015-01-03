
public class WasRun extends TestCase{
	boolean wasRun = false;
	
	
	public WasRun(String methodName){
		super(methodName);
	}
	
	
	public void testMethod(){
		wasRun = true;
	}
	
	

}
