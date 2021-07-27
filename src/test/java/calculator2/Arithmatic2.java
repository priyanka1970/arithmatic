package calculator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Arithmatic2 {

	public static void main(String[] args) {
		//select operation to perform
				String operation="addition";
				//opening browser
						WebDriverManager.chromedriver().setup();
						ChromeDriver driver=new ChromeDriver();
						driver.get("https://www.calculator.net/");	
				//find all webelements
						WebElement zero=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]"));
						WebElement two=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
						WebElement three=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]"));
						WebElement four=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]"));
						WebElement five=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]"));
						WebElement eight=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
						WebElement nine=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]"));
						WebElement minus=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[1]"));
						WebElement equals=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));	
						WebElement addition=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
						WebElement subtraction=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
						WebElement multiplication=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
						WebElement division=driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]"));
						WebElement result=driver.findElement(By.xpath("//div[@id=\"sciOutPut\"]"));

					if (operation.equals("addition"))
					{
						String expected=" 111111";
						minus.click();
						two.click();
						three.click();
						four.click();
						two.click();
						three.click();
						four.click();
						addition.click();
						three.click();
						four.click();
						five.click();
						three.click();
						four.click();
						five.click();
						equals.click();
						System.out.println("Expected result= "+expected+"\nActuel Result= "+result.getText());
							if (expected.equals(result.getText())) {
								System.out.println("Addition test is pass ");
							}else {
								System.out.println("Addition test is fail ");
							}
					}
					else if (operation.equals("subtraction")) 
					{	String expected=" 23329646";
						two.click();
						three.click();
						four.click();
						eight.click();
						two.click();
						three.click();
						subtraction.click();
						two.click();
						three.click();
						zero.click();
						nine.click();
						four.click();
						eight.click();
						two.click();
						three.click();
						minus.click();
						equals.click();
						System.out.println("Expected result= "+expected+"\nActuel Result= "+result.getText());
							if (expected.equals(result.getText())) {
								System.out.println("subtraction test is pass ");
							}	 else{
								System.out.println("subtraction test is fail ");
							}
					}
					else if (operation.equals("multiplication")) 
					{	String expected=" 222075";
						four.click();
						two.click();
						three.click();
						multiplication.click();
						five.click();
						two.click();
						five.click();
						equals.click();
						System.out.println("Expected result= "+expected+"\nActuel Result= "+result.getText());
							if (expected.equals(result.getText())) {
								System.out.println("multiplication test is pass ");
							} else{
								System.out.println("multiplication test is fail ");
							}
					}
					else if (operation.equals("division"))
					{	String expected=" 20";
						four.click();
						zero.click();
						zero.click();
						zero.click();
						division.click();
						two.click();
						zero.click();
						zero.click();
						equals.click();
						System.out.println("Expected result= "+expected+"\nActuel Result= "+result.getText());
							if (expected.equals(result.getText())) {
								System.out.println("division test is pass ");
							} else{
								System.out.println("division test is fail ");
							}
					}

	}

}
