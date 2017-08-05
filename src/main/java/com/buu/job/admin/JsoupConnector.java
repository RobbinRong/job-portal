package com.buu.job.admin;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

public class JsoupConnector{

	public static Document getDocumentByUrl(String url) {

		Document doc = null;

		while (true) {
			try {
				doc = Jsoup.connect(url).timeout(120* 1000).get();
				if (doc != null) {
					break;
					// return doc;
				}
			}
			catch (SocketTimeoutException e1) {
				System.err.println("SocketTimeoutException");
				continue;
			}
			catch (ConnectException e2) {
				System.err.println("ConnectException");
				continue;
			}
			catch (HttpStatusException e3) {
				System.err.println("HttpStatusException");
				try {
					Thread.sleep(30*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
			catch (IOException e4) {
				System.err.println("IOException");
				try {
					Thread.sleep(30*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
		}
		return doc;
	}
}
