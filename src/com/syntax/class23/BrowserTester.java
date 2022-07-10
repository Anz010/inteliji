package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        /*WebDriver chrome=new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();*/

    WebDriver [] browsers={new Chrome(),new Safari(),new IE(),new Firefox()};
   /* for(WebDriver driver:browers){
       driver.startBrowser();
       driver.openUrl("www.google.com");
       driver.testLoginPage();
       driver.closeBrowser();
    }*/
for (int i=0;i<browsers.length;i++){
    browsers[i].startBrowser();
    browsers[i].openUrl("www.google.com");
    browsers[i].testLoginPage();
    browsers[i].closeBrowser();
}

    }
}
