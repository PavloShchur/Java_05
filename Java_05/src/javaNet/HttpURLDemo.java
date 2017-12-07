package javaNet;

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

		System.out.println("����� ������: " + hpCon.getRequestMethod());
		System.out.println("��� ������: " + hpCon.getResponseCode());
		System.out.println("³������: " + hpCon.getResponseMessage());

		Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		System.out.println("/n��� ��� ���������: ");
		for (String k : hdrField) {
			System.out.println("����: " + k + " ��������: " + hdrMap.get(k));
		}

	}

}
