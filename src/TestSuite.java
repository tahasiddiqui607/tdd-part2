import java.lang.reflect.Method;
import java.util.ArrayList;


public class TestSuite {

	ArrayList<TestCase> altestCase = new ArrayList<TestCase>();
	public void add(TestCase testCase) {
		altestCase.add(testCase);
		
	}
	public TestResult run(TestResult testResult){
		try {
			
			Class cls = this.getClass();
			for( TestCase testCase :  altestCase){
				testCase.run(testResult);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testResult;
	}
	

}
