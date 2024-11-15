package week1.day2;

public class LearnMethodAndObject {

	public void startApp() {

		System.out.println("Testleaf");

	}
		
	private String launchBrowser() {
		
		return "Chrome";

	}
	
	void locateElement(int data, String name) {

		System.out.println("Total number: "+data+" Element name "+name);

	}
	
	protected void Click(boolean actionPerformed) {

		System.out.println(actionPerformed);

	}	
	
	public int value() {
		
		return 13;
		
	}
	
	public static void main(String[] args) {
		
		LearnMethodAndObject mo=new LearnMethodAndObject ();
		
		mo.Click(true);
		String launchBrowser = mo.launchBrowser();
		System.out.println(launchBrowser);
		mo.locateElement(3, "user");
		mo.startApp();
		int value = mo.value();
		System.out.println(value);
		
	}
	
	}