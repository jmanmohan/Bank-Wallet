package definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormPageFactory {

	WebDriver wd;

	// initiating Elements
	public FormPageFactory(WebDriver webdriver) {
		this.wd = webdriver;
		PageFactory.initElements(wd, this);
	}

	@FindBy(name = "uname")
	@CacheLookup
	WebElement uname;

	@FindBy(name = "pass")
	@CacheLookup
	WebElement password;

	@FindBy(name = "age")
	@CacheLookup
	WebElement age;

	@FindBy(name = "mailid")
	@CacheLookup
	WebElement mailid;

	@FindBy(name = "jdate")
	@CacheLookup
	WebElement jdate;

	@FindBy(xpath = "/html/body/form/textarea")
	@CacheLookup
	WebElement address;

	@FindBy(xpath = "/html/body/form/input[6]")
	@CacheLookup
	WebElement company;

	@FindBy(xpath = "/html/body/form/input[11]")
	@CacheLookup
	WebElement skill;

	@FindBy(xpath = "/html/body/form/select[1]")
	@CacheLookup
	WebElement zone;

	@FindBy(name = "city")
	@CacheLookup
	WebElement city;

	@FindBy(xpath = "/html/body/form/input[14]")
	@CacheLookup
	WebElement button;

	public WebElement getButton() {
		return button;
	}

	public void setButton() {
		button.click();
	}

	public WebElement getUname() {
		return uname;
	}

	public void setUname(String uname) {
		// this.uname = uname;
		this.uname.sendKeys(uname);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// this.password = password;
		this.password.sendKeys(password);
	}

	public WebElement getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age .sendKeys(age);
	}

	public WebElement getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid.sendKeys(mailid);
	}

	public WebElement getJdate() {
		return jdate;
	}

	public void setJdate(String jdate) {
		this.jdate.sendKeys(jdate);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company.sendKeys(company);
	}

	public WebElement getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill.sendKeys(skill); 
	}

	public WebElement getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone.sendKeys(zone);	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	
	
}
