package week1.day2;

import javax.management.loading.PrivateClassLoader;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Browser {

	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully: " +browserName);
		
		return browserName;
}

	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser B= new Browser();
        String launchBrowser = B.launchBrowser("Chrome");
        B.loadUrl();
		
	}
	}