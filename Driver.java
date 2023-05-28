package GProjet2;


    /*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
*/
    public interface Driver {
        void open();
        void close();
        void navigate(String url);
        void click(String element);
        void type(String text);
    }

    class ChromeDriver implements Driver {
        @Override
        public void open() {
            System.out.println("ChromeDriver: Open");
        }

        @Override
        public void close() {
            System.out.println("ChromeDriver: Close");
        }

        @Override
        public void navigate(String url) {
            System.out.println("ChromeDriver: Navigate to " + url);
        }

        @Override
        public void click(String element) {
            System.out.println("ChromeDriver: Click on " + element);
        }

        @Override
        public void type(String text) {
            System.out.println("ChromeDriver: Type " + text);
        }
    }

    class FirefoxDriver implements Driver {
        @Override
        public void open() {
            System.out.println("FirefoxDriver: Open");
        }

        @Override
        public void close() {
            System.out.println("FirefoxDriver: Close");
        }

        @Override
        public void navigate(String url) {
            System.out.println("FirefoxDriver: Navigate to " + url);
        }

        @Override
        public void click(String element) {
            System.out.println("FirefoxDriver: Click on " + element);
        }

        @Override
        public void type(String text) {
            System.out.println("FirefoxDriver: Type " + text);
        }
    }

    class SafariDriver implements Driver {
        @Override
        public void open() {
            System.out.println("SafariDriver: Open");
        }

        @Override
        public void close() {
            System.out.println("SafariDriver: Close");
        }

        @Override
        public void navigate(String url) {
            System.out.println("SafariDriver: Navigate to " + url);
        }

        @Override
        public void click(String element) {
            System.out.println("SafariDriver: Click on " + element);
        }

        @Override
        public void type(String text) {
            System.out.println("SafariDriver: Type " + text);
        }
    }

    // Test class
    class DriverTest {
        public static void main(String[] args) {
            Driver chromeDriver = new ChromeDriver();
            chromeDriver.open();
            chromeDriver.navigate("https://www.example.com");
            chromeDriver.click("button");
            chromeDriver.type("Hello, world!");
            chromeDriver.close();

            System.out.println();

            Driver firefoxDriver = new FirefoxDriver();
            firefoxDriver.open();
            firefoxDriver.navigate("https://www.example.com");
            firefoxDriver.click("button");
            firefoxDriver.type("Hello, world!");
            firefoxDriver.close();

            System.out.println();

            Driver safariDriver = new SafariDriver();
            safariDriver.open();
            safariDriver.navigate("https://www.example.com");
            safariDriver.click("button");
            safariDriver.type("Hello, world!");
            safariDriver.close();
        }
    }






