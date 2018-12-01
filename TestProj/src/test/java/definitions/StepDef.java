package definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	private FormPageFactory fact;
	private WebDriver driver;


	@Given("^check user name$")
	public void check_user_name() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		
	}

	@When("^enter empty value in user name text box$")
	public void enter_empty_value_in_user_name_text_box() throws Throwable {
		fact.setUname("");
		fact.setButton();

		
			}

	@Then("^print error message for name field$")
	public void print_error_message_for_name_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user password$")
	public void check_user_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		
			}

	@When("^enter empty value in password text box$")
	public void enter_empty_value_in_password_text_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("");
		fact.setButton();
	
	}

	@Then("^print error message for password field$")
	public void print_error_message_for_password_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
		}

	@Given("^check user age$")
	public void check_user_age() throws Throwable {	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

			}

	@When("^enter empty value in age text box$")
	public void enter_empty_value_in_age_text_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge(" ");
		fact.setButton();

	}

	@Then("^print error message for age field$")
	public void print_error_message_for_age_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user mailid$")
	public void check_user_mailid() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in mailid text box$")
	public void enter_empty_value_in_mailid_text_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("");
		fact.setButton();

		
	}

	@Then("^print error message for mailid field$")
	public void print_error_message_for_mailid_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user joining date$")
	public void check_user_joining_date() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in joining date box$")
	public void enter_empty_value_in_joining_date_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate(" ");
		fact.setButton();

	}
	

	@Then("^print error message for joining date field$")
	public void print_error_message_for_joining_date_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user address$")
	public void check_user_address() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in address box$")
	public void enter_empty_value_in_address_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate("10-19-2018 ");
		
		fact.setAddress(" ");
		fact.setButton();

	}

	@Then("^print error message for address field$")
	public void print_error_message_for_address_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	
	}

	@Given("^check user company$")
	public void check_user_company() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in company box$")
	public void enter_empty_value_in_company_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate("10-19-2018 ");
		fact.setAddress("Civil Lines Bareilly ");
			
	
		fact.setCompany(" ");
		fact.setButton();

	}

	@Then("^print error message for company field$")
	public void print_error_message_for_company_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	
	}

	@Given("^check user skills$")
	public void check_user_skills() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in skills box$")
	public void enter_empty_value_in_skills_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate("10-19-2018 ");
		fact.setAddress("Civil Lines Bareilly ");	
		fact.setCompany("Capgemini ");	
		fact.setSkill("");
		fact.setButton();

	}

	@Then("^print error message for skills field$")
	public void print_error_message_for_skills_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user zone$")
	public void check_user_zone() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in zone box$")
	public void enter_empty_value_in_zone_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate("10-19-2018");
		fact.setAddress("Civil Lines Bareilly ");	
		fact.setCompany("Capgemini ");	
		fact.setSkill("HTML");
		fact.setZone(" ");
		fact.setButton();

	}

	@Then("^print error message for zone field$")
	public void print_error_message_for_zone_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}

	@Given("^check user city$")
	public void check_user_city() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sarkulsh\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fact = new FormPageFactory(driver);
		driver.get("file://D:/bdd/Demo1.html");

		}

	@When("^enter empty value in city box$")
	public void enter_empty_value_in_city_box() throws Throwable {
		fact.setUname("Saransh");
		fact.setPassword("saru");
		fact.setAge("22");
		fact.setMailid("saransh@gmail.com");
		fact.setJdate("10-19-2018 ");
		fact.setAddress("Civil Lines Bareilly ");	
		fact.setCompany("Capgemini ");	
		fact.setSkill("HTML");
		fact.setZone("North Zone");
		fact.setCity(" ");
		fact.setButton();

	}

	@Then("^print error message for city field$")
	public void print_error_message_for_city_field() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(60*60);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(60*60);
		driver.close();
	}


	
}
