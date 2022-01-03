package com.undostres.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.undostres.pageObjects.RechargePage;

public class TC_Recharge_001 extends BaseClass
{

	@Test
	public void recTest()
	{
		driver.get(baseURL);
		
		RechargePage rc=new RechargePage(driver);
		rc.setOperatorDrop(operatorDrop);
		rc.setmobileno(mobile);
		rc.setamount(amount);
		rc.clickSubmit();
	
		if (driver.getTitle().equals("undostres.com.mx - Recargas en línea Telcel, Movistar, Iusacell, Unefon, Nextel, Virgin, Cierto, Weex, TeleVía, PASE Urbano, IAVE, Viapass"));
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	
	
	}
	
	
	
	
}
