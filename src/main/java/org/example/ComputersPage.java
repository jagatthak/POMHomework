package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{
    private By _DesktopButton= By.xpath("//a[@title='Show products in category Desktops']/parent::h2");

    public void UserShouldClickOnDesktops(){
        ClickElement(_DesktopButton);
    }
}
