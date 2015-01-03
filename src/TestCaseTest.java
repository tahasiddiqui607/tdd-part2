
public class TestCaseTest  extends TestCase{
	
	public TestCaseTest(String methodName){
		super(methodName);
	}
	
	private static void testWasMethodRun(){
		WasRun wasRun = new WasRun("testMethod");
		System.out.println("testWasMethodRun --> Result: " + wasRun.wasRun);
		wasRun.run();
		System.out.println("testWasMethodRun --> Result: " + wasRun.wasRun);
		
	}
	public static void main(String[] args){
		testWasMethodRun();
	}
}
