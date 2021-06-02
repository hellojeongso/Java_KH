package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		
		URI uri = new URI("http://localhost:8787/Dynamic_Web_Project/");
				System.out.println(uri.getScheme());
				System.out.println(uri.getHost());
				System.out.println(uri.getPort());
				System.out.println(uri.getPath());
				System.out.println(uri.getQuery());
	}
}
