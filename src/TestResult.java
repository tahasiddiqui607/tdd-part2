
public class TestResult {
	int runCounter;
	int failedCounter;
	public String summary(){
		return runCounter+" run, "+failedCounter+" failed";
	}
	
	public void testStarted(){
		runCounter++;
	}
}
