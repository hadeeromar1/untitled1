package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver) {this.driver=driver;}

    private final By checkBox1 = By.xpath("//form[@id= 'checkboxes'][1]");

    private final By checkBox2 = By.xpath("//form[@id= 'checkboxes'][2]");

    public void clickCheckBox1 () {driver.findElement(checkBox1).click();}

    public void clickCheckBox2 (){driver.findElement(checkBox2).click();}
}
