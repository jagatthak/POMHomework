package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void UserShouldBeAbleToRegisterSuccessfullyAndVerifyRegistrationMessage() {

        //Click on register
        homepage.ClickOnRegisterButton();
        //user should verify Register Page Url
        registrationPage.UserShouldVerifyRegisterUrl();
        //select Radio Button for Male or Female
        registrationPage.UserShouldSelectRadioButton();
        //Enter Text for First Name
        registrationPage.UserShouldTypeTextForFirstName();
        //Enter Text for Last Name
        registrationPage.UserShouldTypeTextForLastName();
        // select BirthDay
        registrationPage.UserShouldSelectDayOfBirth();
        // select BirthMonth
        registrationPage.UserShouldSelectMonthOfBirth();
        //select BirthYear
        registrationPage.UserShouldSlectYearOfBirth();
        //Enter Email
        registrationPage.UserShouldEnterEmail();
        //Enter Password
        registrationPage.UserShouldEnterPassword();
        //Confirm Password
        registrationPage.UserShouldConfirmPassword();
        //Click on Register button
        registrationPage.UserShouldClickOnRegisterButton();
        //Verify on next page Actual Message is Same as Expected Message
        registrationSuccessPage.UserShouldRegisterSuccessfully();
    }

    @Test
    public void UserShouldBeAbleToAddToCartForBuildYourOwnComputerAndVerifyInShoppingCart() {
        //Click on Computers
        homepage.UserShouldClickOnComputers();
        //Click on Desktops
        computersPage.UserShouldClickOnDesktops();
        //Click on Add to cart for Build your own computer
        desktopsPage.UserShouldClickOnAddToCartForBuildYourOwnComputer();
        //Select Processor to 2.2 GHz
        desktopsPage.UserShouldSelectProcessor();
        //Select RAM to 2 G
        desktopsPage.UserShouldSelectRAM();
        //Select HDD Radio button 320 GB
        desktopsPage.UserShouldSelectRadioButton320GBOnHDD();
        //Select OS Radio button vista premium
        desktopsPage.UserShouldSelectRadioButtonVistapremiumOnOS();
        //Select all Checkbox for Software
        desktopsPage.UserShouldClickOnAcrobatReaderAndTotalCommanderOnSoftware();
        //Click on Add to cart
        desktopsPage.UserShouldClickOnAddToCart();
        //Click on Shopping cart
        desktopsPage.UserShouldClickOnShoppingCart();
        //Keeping wait for loading to other page
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Verify Shopping cart and Build your own computer in Shopping cart
        shoppingCartPage.UserShouldVerifyShoppingCartAndBuildYourOwnComputer();
    }

    @Test
    public void UserShouldBeAbleToSeeUSDollarOREuroSignOnPriceForBuildYourOwnComputerWhenSelectedInDropdownMenu() {
        //Selecting Euro
        homepage.UserShouldSelectEuroAsCurrency();
        //Verify if the Price for Build your own computer is changed to Euro
        homepage.UserShouldVerifyBuildYOurOwnComputerPriceChangedToEuro();
        //Selecting USDollar
        homepage.UserShouldSelectUSDollarAsCurrency();
        //verify if the Price for Build your own computer is changed to USDollar
        homepage.UserShouldVerifyBuildYourOwnComputerPriceChangedToUSDollar();
    }

    @Test
    public void UserShouldBeAbleToReferAFriendForBuildYouOwnComputerAndVerifyYourMessageHasBeenSent() {
        //Click on register
        homepage.ClickOnRegisterButton();
        //user should verify Register Page Url
        registrationPage.UserShouldVerifyRegisterUrl();
        //select Radio Button for Male or Female
        registrationPage.UserShouldSelectRadioButton();
        //Enter Text for First Name
        registrationPage.UserShouldTypeTextForFirstName();
        //Enter Text for Last Name
        registrationPage.UserShouldTypeTextForLastName();
        // select BirthDay
        registrationPage.UserShouldSelectDayOfBirth();
        // select BirthMonth
        registrationPage.UserShouldSelectMonthOfBirth();
        //select BirthYear
        registrationPage.UserShouldSlectYearOfBirth();
        //Enter Email
        registrationPage.UserShouldEnterEmail();
        //Enter Password
        registrationPage.UserShouldEnterPassword();
        //Confirm Password
        registrationPage.UserShouldConfirmPassword();
        //Click on Register button
        registrationPage.UserShouldClickOnRegisterButton();
        //Verify on next page Actual Message is Same as Expected Message
        registrationSuccessPage.UserShouldRegisterSuccessfully();
        //Click on Continue
        registrationSuccessPage.UserShouldClickOnContinueButton();
        //Click on Build your own computer
        homepage.UserShouldClickOnBuildYourOwnComputer();
        //Click on Email a Friend
        buildYourOwnComputerPage.UsershouldClickOnEmailAFriendButton();
        //Enter Friend's Email
        emailAFriendPage.UserShouldEnterFriendEmail();
        // Enter comment in Personal message
        emailAFriendPage.UserShouldEnterPersonalMessage();
        //Click on Send Email
        emailAFriendPage.UserShouldClickOnSendEmail();
        //Verify Actual Message is Same as Expected Message
        emailAFriendPage.UserShouldVerifyTheMessage();
    }

    @Test
    public void UserShouldBeAbleToVoteAndVerifyVotes(){

        //click on Good radio button below Community poll
        homepage.UserShouldClickGoodRadioButtonForCommunityPoll();
        //click on Vote
        homepage.UserShouldClickOnVoteButton();
        //Verify Only registered user can vote
        homepage.UserShouldVerifyMessageAfterClickingVoteButton();
        //Click on register
        homepage.ClickOnRegisterButton();
        //user should verify Register Page Url
        registrationPage.UserShouldVerifyRegisterUrl();
        //select Radio Button for Male or Female
        registrationPage.UserShouldSelectRadioButton();
        //Enter Text for First Name
        registrationPage.UserShouldTypeTextForFirstName();
        //Enter Text for Last Name
        registrationPage.UserShouldTypeTextForLastName();
        // select BirthDay
        registrationPage.UserShouldSelectDayOfBirth();
        // select BirthMonth
        registrationPage.UserShouldSelectMonthOfBirth();
        //select BirthYear
        registrationPage.UserShouldSlectYearOfBirth();
        //Enter Email
        registrationPage.UserShouldEnterEmail();
        //Enter Password
        registrationPage.UserShouldEnterPassword();
        //Confirm Password
        registrationPage.UserShouldConfirmPassword();
        //Click on Register button
        registrationPage.UserShouldClickOnRegisterButton();
        //Click on Continue
        registrationSuccessPage.UserShouldClickOnContinueButton();
        //click on Good Radio button below Community poll
        homepage.UserShouldClickGoodRadioButtonForCommunityPoll();
        //click on Vote
        homepage.UserShouldClickOnVoteButton();
        //Verify Votes
        homepage.UserShouldBeAbleTOVoteAfterRegistering();


    }
}
