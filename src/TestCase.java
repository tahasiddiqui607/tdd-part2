import java.lang.reflect.Method;


public abstract class TestCase {
	protected String methodName;
	public TestCase(String methodName){
		this.methodName = methodName;
	}
	public void run(){
		
		try {
			Class cls = this.getClass();
			Method method = cls.getDeclaredMethod(methodName, null);
			method.invoke(this);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
