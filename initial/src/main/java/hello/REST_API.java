package hello;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

public class REST_API {

	public String queryMACAddress(String APIKEY, String str) throws IOException {

		String url = "https://api.macaddress.io/v1?apiKey="+APIKEY+"&output=vendor&search="+str;
		//System.out.println(url);
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(url).get().build();
		Response response = client.newCall(request).execute();
		ResponseBody body = response.body();
		String json = response.body().string();
		int statusCode = response.code();
		Integer.toString(statusCode);
		// StatusLine status = response.code();
		// System.out.print(json + "\t\t");
		body.close();
		return json;
	}
	public boolean isValidMACAddress(String str) {
		String regex = "^([0-9A-Fa-f]{2}[:-])"
				+ "{5}([0-9A-Fa-f]{2})|"
				+ "([0-9a-fA-F]{4}\\."
				+ "[0-9a-fA-F]{4}\\."
				+ "[0-9a-fA-F]{4})$";
		Pattern p = Pattern.compile(regex);
		if (str == null) {
			return false;
		}
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
