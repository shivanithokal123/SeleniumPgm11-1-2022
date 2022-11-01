package selenium_demo;

public class MainBrowserLaunch extends NavigateTo{
	public static void main (String args[]) throws InterruptedException {
		NavigateTo t = new NavigateTo();
		Thread.sleep(1000);
		t.chrome();
		
		Thread.sleep(1000);
		t.firefox();
		
		
	}

}
