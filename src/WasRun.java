
public class WasRun extends TestCase{
	public boolean wasRun = false;
	public boolean wasSetUp;
	
	
	public WasRun(String methodName){
		super(methodName);
	}
	
	
	public void testMethod(){
		wasRun = true;
	}
	
	public void setUp(){
		wasRun = false;
		wasSetUp = true;
	}
	
	

}
