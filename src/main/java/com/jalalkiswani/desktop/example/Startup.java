package com.jalalkiswani.desktop.example;

import com.jk.desktop.JKDesktopApplication;
import com.jk.util.JK;

public class Startup {
	public static void main(String[] args) {
		System.out.println(JK.getAppName());
		JKDesktopApplication.start();
	}
}
