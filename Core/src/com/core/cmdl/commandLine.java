package com.core.cmdl;

public class commandLine {
public static void main(String[] args) {
	int length=args.length;
	
	if(length==0) {
		System.out.println("no output provided");
	}  else  {
		System.out.println("List of Argument");
		for (int i = 0; i < length; i++) {
			System.out.println(args[i]);
		}
	}
}
}
