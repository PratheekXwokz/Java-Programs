package com.xworkz.coffee;

import java.util.Scanner;

public class ReverseStringByWord {

	public static String reverse(String in){
		String[] word=in.split("//s");
		String out=" ";
		for(int i=word.length-1;i>=0;i--){
			out=out+word[i]+" ";
		}
		return out;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input String:");
		String in=sc.nextLine();
		String out=reverse(in);
		System.out.println(out);
		sc.close();
		}

}
