package launcher;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ABC {

	public static void main(String[] args) {
		System.out.println(pingUrl("smtp.gmail.com"));
	}

	public static boolean pingUrl(final String address) {
		try {
			final URL url = new URL("http://" + address);
			final HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			urlConn.setConnectTimeout(1000 * 10); // mTimeout is in seconds
			final long startTime = System.currentTimeMillis();
			urlConn.connect();
			final long endTime = System.currentTimeMillis();
			if (urlConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
				System.out.println("Time (ms) : " + (endTime - startTime));
				System.out.println("Ping to "+address +" was success");
				return true;
			}
		} catch (final MalformedURLException e1) {
			e1.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
