package com.dagurasu.patterns.builder;

public class Test {

	public static void main(String[] args) {

		// without builder pattern
		HttpClient client = new HttpClient("POST", "http://test.com", "user", "pass", null, "{}");
		System.out.println(client);

		// with builder pattern
		HttpClient httpClient = new HttpClient.HttpClientBuilder()
				.method("POST")
				.body("http://test.com")
				.body("{}")
				.secure("user", "pass")
				.build();
		System.out.println(httpClient);

	}
}
