package hello;


import java.io.IOException;

public class MacAddress {
	public static void main(String[] args) throws IOException {

		String APIKEY = System.getenv("APIKEY");
			System.out.println(APIKEY == null ? "Not Found APIKEY": "Found APIKEY");

		REST_API api = new REST_API();

			if (!api.isValidMACAddress(args[0]) && APIKEY == null) {
			System.out.println("Mac is invalid");
			System.exit(1);
		} else {
			System.out.println("Mac is valid. \nProceed with query to macaddress.io");
			System.out.println(api.queryMACAddress(APIKEY, args[0]));
		}
	}

}
