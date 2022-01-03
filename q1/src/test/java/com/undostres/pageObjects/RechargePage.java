package com.undostres.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class RechargePage {
	
	WebDriver ldriver;
	
	public RechargePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="operator")
	@CacheLookup
    WebElement operatorDrop;
	
	@FindBy(name="mobile")
	@CacheLookup
    WebElement numeric;
	
	@FindBy(name="amount")
	@CacheLookup
    WebElement planD;
	
	@FindBy(name="rbtn")
	@CacheLookup
	WebElement rbtn;
	
	@FindBy(name="card")
	@CacheLookup
	WebElement cd;
	
	@FindBy(name="cardno")
	@CacheLookup
	WebElement cno;
	
	@FindBy(name="cardm")
	@CacheLookup
	WebElement cm;
	
	@FindBy(name="cardy")
	@CacheLookup
	WebElement cy;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement cv;
	
	@FindBy(name="mail")
	@CacheLookup
	WebElement em;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement sb;
	
	@FindBy(name="usrname")
	@CacheLookup
	WebElement usr;
	
	@FindBy(name= "password")
	@CacheLookup
	WebElement pa;
	
	public void setOperatorDrop(String operator)
	{
		operatorDrop.findElement(By.xpath("//input[@id='suggested']"));
		List<WebElement> optionList=operatorDrop.findElements(By.xpath("//div[@class='suggestion']"));
		Select s=new Select(operatorDrop.findElement(By.xpath("//input[@id='suggested']")));
		s.selectByVisibleText("telcel");
		
	}
	
	public void setmobileno(String mobile)
	{
	numeric.sendKeys(mobile);
	}
	
	public void setamount(String amount)
	{
		Select s=new Select(planD.findElement(By.xpath("//input[@suggest='mobile-operator_amount' ]")));
		s.selectByVisibleText("$10");
	}
	
	public void clickSubmit()
	{
		rbtn.click();
	
	}
	
	public void setCard(String card)
	{
		cd.findElement(By.xpath("//div[@id='panel-title-card']"));
		cd.click();
		cd.findElement(By.xpath("//input[@id='radio-c']"));
	}
	public void setCardNo(String cardno)
	{
		cno.findElement(By.xpath("//input[@id='cardnumberunique']"));
		cno.sendKeys("cardno");
	}
	public void setmonth(String month)
	{
		cm.findElement(By.xpath("//input[@data-qa='mes-input']"));
		cm.sendKeys("cardm");
	}
	public void setyear(String year)
	{
		cy.findElement(By.xpath("//input[@data-qa='expyear-input']"));
		cy.sendKeys("cardy");
	}
	public void setcvv(String cvv)
	{
		cv.findElement(By.xpath("//input[@data-qa='cvv-input']"));
		cv.sendKeys("cvv");
	}
	public void setmail(String mail)
	{
		em.findElement(By.xpath("//input[@name='txtEmail']"));
		em.sendKeys("cname");
	}
	public void setsubmit(String sub)
	{
		sb.findElement(By.xpath("//button[@id='paylimit']"));
		sb.click();
	}
	public void setusrname(String usrname)
	{
		usr.findElement(By.xpath("//input[@id='usrname']"));
		usr.sendKeys("username");
	}
	public void setpassword(String password)
	{
		pa.findElement(By.xpath("//input[@id='psw']"));
		pa.sendKeys("password");
	}

}
