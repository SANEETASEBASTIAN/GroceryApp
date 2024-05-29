package testscript;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups= {"smoke"})
  public void first() {
	  System.out.println("Hai");
  }
  @Test(groups= {"sanity"})
  public void second() {
	  System.out.println("Hai saneeta");
  }
  @Test(groups= {"regression"})
  public void third() {
	  System.out.println("Hai liza");
  }
}
