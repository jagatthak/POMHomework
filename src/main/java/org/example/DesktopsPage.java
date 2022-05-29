package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DesktopsPage extends Utils{
    private By _AddToCartButtonForBuildYourOwnComputer =By.xpath("//div[@class='product-grid']//div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _SelectProcessor = By.id("product_attribute_1");
    private By _SelectRAM = By.id("product_attribute_2");
    private By _SelectRadioButtonHDD = By.id("product_attribute_3_6");
    private By _SelectRadioButtonOS = By.id("product_attribute_4_9");
    private By _SelectAcrobatReaderOnSoftware = By.id("product_attribute_5_11");
    private By _SelectTotalCommanderOnSoftware = By.id("product_attribute_5_12");
    private By _SelectAddToCartButton = By.id("add-to-cart-button-1");
    private By _selectShoppingCart = By.xpath("//p[1]/a[@href=\"/cart\"]");

    public void UserShouldClickOnAddToCartForBuildYourOwnComputer(){
        ClickElement(_AddToCartButtonForBuildYourOwnComputer);
    }
    public void UserShouldSelectProcessor(){
        Select Processor = new Select(driver.findElement(_SelectProcessor));
        Processor.selectByValue("1");
    }
    public void UserShouldSelectRAM(){
        Select RAM = new Select(driver.findElement(_SelectRAM));
        RAM.selectByValue("3");

    }
    public void UserShouldSelectRadioButton320GBOnHDD(){
        SelectRadioButton(_SelectRadioButtonHDD);
    }
    public void UserShouldSelectRadioButtonVistapremiumOnOS(){
        SelectRadioButton(_SelectRadioButtonOS);
    }
    public void UserShouldClickOnAcrobatReaderAndTotalCommanderOnSoftware(){
        SelectCheckBox(_SelectAcrobatReaderOnSoftware);
        SelectCheckBox(_SelectTotalCommanderOnSoftware);
    }
    public void UserShouldClickOnAddToCart(){
        ClickElement(_SelectAddToCartButton);
    }
    public void UserShouldClickOnShoppingCart(){
        ClickElement(_selectShoppingCart);
    }
}
