package selStepDefinitions;

import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;

//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class selnStepDefins {
	
	
	
	  @Given("^User is on HomePage$")
	    public void user_is_on_homepage() throws Throwable {
		  
		  open("https://aws.amazon.com/console/");
		  $(By.xpath("//a[text()=' Already have an account? Sign in']")).click();
		   
	    }

	    @When("^User Navigate to Login page$")
	    public void user_navigate_to_login_page() throws Throwable {
	    	System.out.println("success1");
	    	
	    	$(By.xpath("//input[@id='resolving_input']")).sendKeys("akhil.akhilreddy123@gmail.com");
	    	
	    	$(By.xpath("//button[@id='next_button']")).click();
	    	
	    	 String captcha = JOptionPane.showInputDialog("Enter your captcha");
		        
		        WebElement element = $(By.xpath("//input[@id='captchaGuess']"));
		        element.sendKeys(captcha);
	        
	    }

	  

		@Then("^Message displayed Login Successfully$")
	    public void message_displayed_login_successfully() throws Throwable {
	        System.out.println("success2");
	        
	        $(By.xpath("//button[@id='submit_captcha']")).click();
		    $(By.xpath("//input[@id='password']")).sendKeys("Akhil818#");
		    $(By.xpath("//button[@id='signin_button']")).click();
	    }

	   
		
		//MATHMATICAL CAPTCHA
		
		/*String str;
		Integer i1,i2;
		int i;
		WebElement element;
	
		  @Given("^User is on HomePage$")
		    public void user_is_on_homepage() throws Throwable {
			  
			  
			  
			  open("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
			  element = $(By.xpath("//label[@id='ebcaptchatext']"));
			  str =element.getText();
			  
			   
		    }

		    @When("^User Navigate to Login page$")
		    public void user_navigate_to_login_page() throws Throwable {
		    	System.out.println("success1");
		    	
		    	//W h a t   i s   4    +    4
				  //0 1 2 3 4 5 6 7 8 9 10 11 12
				  String s1 = str.substring(8, 9);
				  String s2 = str.substring(8, 9);
				  
				   i1 = Integer.valueOf(s1);
				   i2 = Integer.valueOf(s2);
				  
				  System.out.println("No1:" + i1 +"No2" + i2);
		    
		        
		    }

		  

			@Then("^Message displayed Login Successfully$")
		    public void message_displayed_login_successfully() throws Throwable {
		        System.out.println("success2");
		        
		         i=i1 + i2;
				  String ans = String.valueOf(i);
				  
				  element =$(By.xpath("//input[@id='ebcaptchainput']"));
				  element.sendKeys(ans); // This method will always expect in string format*/
		        
		       
		    }

		
		


