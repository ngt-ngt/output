

public class Timer {
	public void waitTime(int milsec) {
		try {
			Thread.sleep(milsec);
		} catch (InterruptedException e) {
		}
	}

}
