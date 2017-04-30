package java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {

	public static void main(String[] args) throws IOException {
		URL hp = new URL("http://www.google.com");
		HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

		System.out.println("Метод запиту: " + hpCon.getRequestMethod());
		System.out.println("Код відповіді: " + hpCon.getResponseCode());
		System.out.println("Відповідь: " + hpCon.getResponseMessage());

		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		System.out.println("/nДалі іде заголовок: ");
		for (String k : hdrField) {
			System.out.println("Ключ: " + k + " Значення: " + hdrMap.get(k));
		}

	}

}
