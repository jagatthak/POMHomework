package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils{
    private By _RadioButtonForMale = By.id("gender-male");
    private By _TextForFirstName = By.xpath("//input[@name='FirstName']");
    private By _TextForLastName = By.id("LastName");
    private By _DayOfBirth = By.name("DateOfBirthDay");
    private By _MonthOfBirth = By.name("DateOfBirthMonth");
    private By _YearOfBirth = By.name("DateOfBirthYear");
    private By _Email = By.id("Email");
    private By _Password = By.name("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _RegisterButton = By.name("register-button");

    //verify register page url
    public void UserShouldVerifyRegisterUrl(){
        urltobe(10,"https://demo.nopcommerce.com/register?returnUrl=%2F");
    }
    //select Radio Button for Male or Female
    public void UserShouldSelectRadioButton(){
        SelectRadioButton(_RadioButtonForMale);
    }
    //Enter Text for First Name
    public void UserShouldTypeTextForFirstName(){
        TypeText((_TextForFirstName),"joy");
    }
    //Enter Text for Last Name
    public void UserShouldTypeTextForLastName(){
        TypeText((_TextForLastName),"Tomer");
    }
    // select BirthDay
    public void UserShouldSelectDayOfBirth(){
        Select Birthday = new Select(driver.findElement(_DayOfBirth));
        Birthday.selectByIndex(3);
    }
    // select BirthMonth
    public void UserShouldSelectMonthOfBirth(){
        Select BirthMonth = new Select(driver.findElement(_MonthOfBirth));
        BirthMonth.selectByValue("2");
    }
    //select BirthYear
    public void UserShouldSlectYearOfBirth(){
        Select BirthYear = new Select(driver.findElement(_YearOfBirth));
        BirthYear.selectByValue("1977");
    }
    //Enter Email
    public void UserShouldEnterEmail(){
        TypeText(_Email,"joy123"+RandomDate()+"@gmail.com");
    }
    //Enter Password
    public void UserShouldEnterPassword(){
        TypeText(_Password,"Joy123");
    }
    //Confirm Password
    public void UserShouldConfirmPassword() {
        TypeText(_ConfirmPassword,"Joy123");
    }
    //Click on Register button
    public void UserShouldClickOnRegisterButton(){
        ClickElement(_RegisterButton);
    }

}
