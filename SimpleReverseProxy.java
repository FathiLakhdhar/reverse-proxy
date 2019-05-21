package com.flk.servlets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleReverseProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "/rest/ii/accounts?name=Alex";
		String regex = "^/rest/(.+)/accounts(\\?.*)$";
		
		String target = "/plugins/$1/IIAccount$2";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);
        
		System.out.println(matcher.matches());
		System.out.println(matcher.groupCount());
		String update = url.replaceAll(regex, target); 
		System.out.println(update);
		
		/*
		response.setContentType("text/html");
		InputStream in = getServletContext().getResourceAsStream(
				getInitParameter("distFolder") + "/index.html");
		OutputStream out = response.getOutputStream();
		byte[] buffer = new byte[ARBITARY_SIZE];
		int numBytesRead;
		while ((numBytesRead = in.read(buffer)) > 0) {
			out.write(buffer, 0, numBytesRead);
		}
		*/
	}

}
