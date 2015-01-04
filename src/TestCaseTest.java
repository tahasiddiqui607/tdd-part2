import org.junit.Assert;


public class TestCaseTest  extends TestCase{
	
	public TestCaseTest(String methodName){
		super(methodName);
		
	}
	
	
	public static void testSetUp(){
		WasRun wasRunObj = new WasRun("testMethod");
		wasRunObj.run();
		
		System.out.println("testSetUp --> Result: " + wasRunObj.wasSetUp);
	}
	
	public static void testRunning(){
		WasRun wasRunObj = new WasRun("testMethod");
		wasRunObj.run();
		System.out.println("testRunning --> Result: " + wasRunObj.wasRun);
	}
	
	

	public static void main(String[] args){
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
	}
}
