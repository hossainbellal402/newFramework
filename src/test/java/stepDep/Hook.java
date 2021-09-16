package stepDep;

import Base.Config;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {
    // url and browser setup
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    // default env and browser
    public static String defaultBrowser = "ch";
    public static String defaultEnv = "qa";

    // open browser
    @Before
    public void openBrowser() {
        // default code
        if (Strings.isNullOrEmpty(browserType)) {
            browserType = defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)) {
            baseURL = defaultEnv;
        }
        // main setup
        driver = initDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "https://www.expedia.com/";
                break;
            case "stage":
                url = "https://www.expedia.com/";
                break;
            case "prod":
                url = "https://www.expedia.com/";
                break;
        }
        driver.get(url);

    }
}