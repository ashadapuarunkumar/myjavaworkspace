package com.edubridge.myapp;

public class MyMap {
	public boolean isEven(int num) {
		return num%2==0;
	}
	public boolean authenticate(String uname,String password) {
		if(uname.equals(uname)&& password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
