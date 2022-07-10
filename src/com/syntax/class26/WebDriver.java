package com.syntax.class26;

import com.sun.media.jfxmediaimpl.HostUtils;

public interface WebDriver {
   void openBrowser();
    void closeBrowser();
    void maximizeWindow();
   void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("You can open Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can close Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You open the window in the full screen");
    }

    @Override
    public void findElement() {
        System.out.println("You can find an element ");
    }
}

class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("You can open FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can close FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You open the window in the full screen");
    }

    @Override
    public void findElement() {
        System.out.println("You can find an element ");
    }
}

class Test1{
    public static void main(String[] args) {
        /*WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        ((ChromeDriver)(webDriver)).findElement();*/

        WebDriver[]webDrivers={new ChromeDriver(),new FireFox()};
        for(WebDriver driver:webDrivers){
            driver.openBrowser();
            driver.closeBrowser();
            driver.findElement();
            driver.maximizeWindow();
        }
    }
}