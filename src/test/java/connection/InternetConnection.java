package connection;

import java.net.URL;
import java.net.URLConnection;

public class InternetConnection {
    public static void getInternetConnection() {

        try {
            URL url = new URL("https://connect-th.beinsports.com/en");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet Connected");
        }
        catch (Exception e) {
            System.out.println("No Internet Connection");
        }
    }

}
