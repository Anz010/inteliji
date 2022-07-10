package com.syntax.class23;

import java.sql.SQLOutput;

public class WebDriver {
    public  void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openUrl(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println("checking if login page is visible ");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Google Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting a Fire fox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on firefox Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting a safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on safari Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the safari");
    }
}
class IE extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting a EI");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL "+url+" on EI Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on EI");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the EI");
    }
}