package SecondProjects;

public interface WebDriverInterface {

        void open();
        void close();
        String getTitle();

}

interface RemoteWebDriverInterface extends WebDriverInterface{
    void navigate();

}

interface TakesScreenshotInterface extends RemoteWebDriverInterface{
    void getScreeShot();
}

class ChromeDriver implements RemoteWebDriverInterface {


    @Override
    public void open() {
        System.out.println("Open Chrome Driver");

    }

    @Override
    public void close() {
        System.out.println("Close Chrome Driver");

    }

    @Override
    public String getTitle() {
        System.out.println("Get title Chrome Driver");

        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate chrome driver");

    }
}

class FirefoxDriver implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Open Firefox Driver");

    }

    @Override
    public void close() {
        System.out.println("Close Firefox Driver");

    }

    @Override
    public String getTitle() {
        System.out.println("Get Firefox title");
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate FireFox Driver ");

    }
}

class SafariDriver implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Open Safari Driver");

    }

    @Override
    public void close() {
        System.out.println("Close Safari Driver");

    }

    @Override
    public String getTitle() {
        System.out.println("Get Safari Driver");
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari Driver");

    }
}


