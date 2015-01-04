
public class TestCaseTest extends TestCase {
	
	/*public TestCaseTest(String methodName){
		super(methodName);
		
	}*/
	
	TestResult testResult;
	
	public TestCaseTest(String methodName) {
		super(methodName);
		setUp();
	}
	public  void testTemplateMethod(){
		WasRun wasRunObj = new WasRun("testMethod");
		wasRunObj.run(testResult);
		assertEquals("setUp testMethod tearDown", wasRunObj.log.toString());
		
		
	}
	public  void testResult(){
		WasRun wasRunObj= new WasRun("testMethod");
		wasRunObj.run(testResult);
		assertEquals("1 run, 0 failed",  testResult.summary());
		
	}
	
	public  void testBrokenMethodResult(){
		WasRun wasRunObj= new WasRun("testBrokenMethod");
		wasRunObj.run(testResult);
		assertEquals("1 run, 1 failed",  testResult.summary());
		
	}
	
	public void testSuite(){
		TestSuite suite= new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		
		suite.add(new TestCaseTest("testBrokenMethodResult"));
		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		TestResult result = suite.run(this.testResult);
		System.out.println(result.summary());

	}

	public static void main(String[] args){
		TestCaseTest testSuite = new TestCaseTest("testSuite");
		testSuite.run(testSuite.testResult);
		//System.out.println(result.summary());
	}
	@Override
	public void setUp() {
		testResult = new TestResult();
		
	}
	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		
	}
	
	public static void assertEquals( Object obj1, Object obj2 ){
		if( !obj1.equals(obj2) ){
			throw new RuntimeException("Expected: "+ String.valueOf(obj1)+ " Result:"+String.valueOf(obj2));
		}
	}
	
	
}
