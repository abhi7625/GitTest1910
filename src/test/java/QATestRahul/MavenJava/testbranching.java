package QATestRahul.MavenJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumTest {
@Test
public void browserAutomation() {	
	System.out.println("browserAutomation");
}
@Test
public void elementsUiCheck()
{
	Assert.assertEquals(0, 1);
	System.out.println("elementsUiCheck");
	System.out.println("elementsUiCheck");
}
}
