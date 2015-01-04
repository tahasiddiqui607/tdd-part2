import java.lang.reflect.Method;


public abstract class TestCase {
	protected String methodName;
	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public abstract void setUp();
	public TestResult run(){
		TestResult testResult = new TestResult();
		try {
			testResult.testStarted();
			setUp();
			Class cls = this.getClass();
			Method method = cls.getDeclaredMethod(methodName, null);
			method.invoke(this);
			tearDown(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testResult;
	}
	
	public abstract void tearDown();
}
