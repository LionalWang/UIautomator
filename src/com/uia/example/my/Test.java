package com.uia.example.my;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Test extends UiAutomatorTestCase{
    public void testDemo() throws UiObjectNotFoundException {
        UiDevice.getInstance().pressHome();
        UiObject browser = new UiObject(new UiSelector().text("Browser"));
        browser.clickAndWaitForNewWindow();
        UiObject edit = new UiObject(new UiSelector().className("android.widget.EditText"));
        edit.click();
        UiDevice.getInstance().pressDelete();
        edit.setText("www.baidu.com");
        UiDevice.getInstance().pressEnter();
    }
}