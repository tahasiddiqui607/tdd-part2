import java.lang.reflect.Method;


public abstract class TestCase {
	protected String methodName;
	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public abstract void setUp();
	public void run(){
		
		try {
			setUp();
			Class cls = this.getClass();
			Method method = cls.getDeclaredMethod(methodName, null);
			method.invoke(this);
			tearDown();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public abstract void tearDown();
}
