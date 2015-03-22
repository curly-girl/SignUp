package core.Selenium_SignUp;

//BEGIN
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_SignUp {
	public static void main(String[] args) {

		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-001.01";
		String text_case_id_02 = "TC-001.02";
		String text_case_id_03 = "TC-001.03";
		String text_case_id_04 = "TC-001.04";
		String text_case_id_05 = "TC-001.05";
		String text_case_id_06 = "TC-001.06";
		String text_case_id_07 = "TC-001.07";
		String text_case_id_08 = "TC-001.08";
		String text_case_id_09 = "TC-001.09";
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String title_sign_up_expected = "Welcome to Sign Up v1";
		String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
		String title_twitter_expected = "Welcome to Twitter - Login or Sign up";
		String title_flicker_expected = "Welcome to Flickr - Photo Sharing";
		String title_youtube_expected = "YouTube";
		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name";
		String fname = "Alex";
		String lname = "Moore";
		String email = "alexmoore@gmail.com";
		String phone = "415 555-1212";

		// TC-001.01

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.02

		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		}
		// TC-001.03
		driver.findElement(By.id("id_img_twitter")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allTabs = new ArrayList<String>(driver.getWindowHandles());
		// String tab = driver.getWindowHandle();
		driver.switchTo().window(allTabs.get(1));
		String title_twitter_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_twitter_expected.equals(title_twitter_actual)) {
			System.out.println("Test case ID: \t\t" + text_case_id_03
					+ "-PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("===========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		}
		// TC-001.04
		driver.findElement(
				By.xpath("/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a[3]/img"))
				.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allTabs = new ArrayList<String>(driver.getWindowHandles());
		// String tab = driver.getWindowHandle();
		driver.switchTo().window(allTabs.get(1));
		String title_flicker_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_flicker_expected.equals(title_flicker_actual)) {
			System.out.println("Test case ID: \t\t" + text_case_id_04
					+ "-PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flicker_expected + "/" + title_flicker_actual);
			System.out.println("===========================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_flicker_expected + "/" + title_flicker_actual);
			System.out.println("=======================================");
		}
		// TC-001.05
		driver.findElement(By.id("id_img_youtube")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs1 = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs1.get(1));
		String title_youtube_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs1.get(0));

		if (title_youtube_expected.equals(title_youtube_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out
					.println("===============================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out
					.println("===============================================");
		}

		// TC-001.06

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}

		// TC-001.07

		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		}
		
		//TC-001.08
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();
		
		if(error_lname_empty_expected.equals(error_lname_empty_actual)){
			System.out.println("Test Case ID: \t\t" + text_case_id_08 + "- PASSED");
			System.out.println("Error Expected/Actul: \t" + error_lname_empty_expected + "/" + error_lname_empty_actual);
			System.out.println("======================================");	
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_lname_empty_expected + "/"
					+ error_lname_empty_actual);
			System.out.println("=======================================");
			
		}

		// TC-001.09

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();

		String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - PASSED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - FAILED");
			System.out.println("First Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		}

		driver.quit();
	}
}
// END
