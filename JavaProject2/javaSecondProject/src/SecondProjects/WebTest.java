package SecondProjects;

import SecondProjects.ChromeDriver;
import SecondProjects.FirefoxDriver;
import SecondProjects.SafariDriver;

public class WebTest {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        chromeDriver.getTitle();
        chromeDriver.close();

        System.out.println("--------------");

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.navigate();
        firefoxDriver.getTitle();
        firefoxDriver.close();

        System.out.println("---------------");

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.open();
        safariDriver.navigate();
        safariDriver.getTitle();
        safariDriver.close();
    }
}
