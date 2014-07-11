package com.test;

import java.util.List;

public class HelloWorld {
	public static void main(String[] args) {
		String str ="abcdef";
		 char[] c= str.toCharArray();
		 for(int i=c.length-1;i>=0;i--){
			 System.out.println(c[i]);
		 }
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}
}

