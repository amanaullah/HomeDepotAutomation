package Runner;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BootCamp.PageObjectModelHomeDepot.Base;
import Pages.CreatingHomeDepoAcc;
import Pages.HomeP;

public class HomeDepotAcc extends Base{
	
  
  @Test(priority=1)
  public void Register() {
	  HomeP home=new HomeP(driver);
	  home.MyAccountClick();
	  home.RegisterButtonClick();
	 
  }

  @Test(priority=2)
  public void CreatingHomeDepoAccInfo() {
	  CreatingHomeDepoAcc info=new CreatingHomeDepoAcc(driver);
	  info.SelectContiClick();
	  info.Eamil();
	  info.Password();
	  info.Zipcode();
	  info.Phone();
	  info.ChechkBoxClick();
	  info.CreateAccButton();
  }
  
  
}

