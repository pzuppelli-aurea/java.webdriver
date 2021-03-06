package org.sayem.webdriver.browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sayem.webdriver.browsers.config.IBrowserThreads;

/**
 * Created by sayem on 10/05/15.
 */
public class HtmlUnitBrowser implements IBrowserThreads {

    @Override
    public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
        DesiredCapabilities capabilities = DesiredCapabilities.htmlUnit();
        capabilities.setCapability("screenResolution", "1280x1024");
        return addProxySettings(capabilities, proxySettings);
    }

    @Override
    public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
        return new HtmlUnitDriver(capabilities);
    }
}
