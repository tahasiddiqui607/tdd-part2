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
	
	
	

	/*public static void main(String[] args){
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
	}*/
}
