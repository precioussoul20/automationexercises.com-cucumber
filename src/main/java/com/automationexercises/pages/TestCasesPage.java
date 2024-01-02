package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {

    private static final Logger log = LogManager.getLogger(TestCasesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[text()='Test Cases']")
    WebElement testCasesText;

    public String getTextFromTextCases(){
        log.info("Getting text from test cases " + testCasesText.toString());
        return getTextFromElement(testCasesText);
    }
}
