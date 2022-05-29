package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends Utils{
    private By _registrationButton = By.className("ico-register");
    private By _addToCartForBuildYourOwnComputer = By.xpath("//div[@class='product-grid']//div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _BuildYourOwnComputerText = By.xpath("//a[contains(text(),'Build your own computer')]");
    private By _SelectCurrencyInDropdown = By.id("customerCurrency");
    private By _BuildYourOwnComputerPriceInEuro = By.xpath("//span[contains(text(),'€1032.00')]");
    private By _BuildYourOwnComputerPriceInUSDollar = By.xpath("//span[contains(text(),'$1,200.00')]");
    private By _ClickOnComputers = By.xpath("//ul[1]/li[1]/a[@href='/computers']");
    private By _SelectGoodRadioButton = By.id("pollanswers-2");
    private By _ClickOnVoteButton = By.id("vote-poll-1");
    private By _SelectVoteErrorMessage= By.className("poll-vote-error");
    private By _SelectTotalVotesMessage = By.className("poll-total-votes");


    //Click on register button
    public void ClickOnRegisterButton(){
        ClickElement(_registrationButton);
    }
    //Click on Build Your Own Computer
    public void UserShouldClickOnBuildYourOwnComputer(){
        ClickElement(_BuildYourOwnComputerText);
    }
    //Select Euro as Currency
    public void UserShouldSelectEuroAsCurrency(){
        Select CurrencyEuro = new Select(driver.findElement(_SelectCurrencyInDropdown));
        CurrencyEuro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    //Verify if Build Your Own Computer Price Changed to Euro
    public void UserShouldVerifyBuildYOurOwnComputerPriceChangedToEuro(){
        String actualPriceForBuildYourOwnComputerInEuro=driver.findElement(_BuildYourOwnComputerPriceInEuro).getText();
        String expectedPriceForBuildYourOwnComputerInEuro="€1032.00";
        Assert.assertEquals(actualPriceForBuildYourOwnComputerInEuro,expectedPriceForBuildYourOwnComputerInEuro,"Wrong currency");
    }
    //Select USDollar as Currency
    public void UserShouldSelectUSDollarAsCurrency(){
        Select CurrencyUSDollar = new Select(driver.findElement(_SelectCurrencyInDropdown));
        CurrencyUSDollar.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");
    }
    //Verify if Build Your Own Computer Price Changed to Euro
    public void UserShouldVerifyBuildYourOwnComputerPriceChangedToUSDollar(){
        String actualPriceForBuildYourOwnComputerInUSD=driver.findElement(_BuildYourOwnComputerPriceInUSDollar).getText();
        String expectedPriceForBuildYourOwnComputerInUSD="$1,200.00";
        Assert.assertEquals(actualPriceForBuildYourOwnComputerInUSD,expectedPriceForBuildYourOwnComputerInUSD,"Wrong currency");
    }

    //Click on Computers
    public void  UserShouldClickOnComputers(){
        ClickElement(_ClickOnComputers);
    }
    //Click on Good radio button
    public void UserShouldClickGoodRadioButtonForCommunityPoll(){
        ClickElement(_SelectGoodRadioButton);
    }
    //click on Vote
    public void UserShouldClickOnVoteButton(){
        ClickElement(_ClickOnVoteButton);
    }
    //Verify Only registered user can vote
    public void UserShouldVerifyMessageAfterClickingVoteButton(){
        String actualMessage=driver.findElement(_SelectVoteErrorMessage).getText();
        String expectedMessage="Only registered user can vote.";
        Assert.assertNotEquals(actualMessage,expectedMessage,"User is not registered");}
    //Verify After Registering User Should be able to vote
    public void UserShouldBeAbleTOVoteAfterRegistering(){
        String actualMessage1= driver.findElement(_SelectTotalVotesMessage).getText();
        String expectedMessage1=" vote";
        Assert.assertTrue(actualMessage1.contains("vote"),"User is not able to vote");}
}
