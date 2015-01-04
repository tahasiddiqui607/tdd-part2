import static org.junit.Assert.*;
import org.junit.Test;


public class TestCaseTest {
	
	/*public TestCaseTest(String methodName){
		super(methodName);
		
	}*/
	
	@Test
	public  void testTemplateMethod(){
		WasRun wasRunObj = new WasRun("testMethod");
		wasRunObj.run();
		assertEquals("setUp testMethod tearDown", wasRunObj.log.toString());
		
	}
	@Test
	public  void testResult(){
		WasRun wasRunObj= new WasRun("testMethod");
		TestResult result= wasRunObj.run();
		assertEquals("1 run, 0 failed",  result.summary());
	}
	
	@Test
	public  void testBrokenMethodResult(){
		WasRun wasRunObj= new WasRun("testBrokenMethod");
		TestResult result= wasRunObj.run();
		assertEquals("1 run, 1 failed",  result.summary());
	}

	/*public static void main(String[] args){
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
	}*/
}
