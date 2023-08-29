package com.PasswordGenerator;

import java.security.SecureRandom;
import java.util.Scanner;
public class PasswordGenerator 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	// get password from user
	System.out.println("Enter the passsword length:");
	int length=sc.nextInt();
	// Genrate password
	String pswd=genpswd(length);;
	System.out.println("Genarated Password:"+pswd);
  }
  public static String genpswd(int length)
  {
	  // set of character
	  String character="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
	  //Initialize secure random genrator
	  SecureRandom rd=new SecureRandom();
	  StringBuilder pswd=new StringBuilder(length);
	  for(int i=0;i<length;i++)
	  {
		  int rdIndex=rd.nextInt(character.length());
				  pswd.append(character.charAt(rdIndex));
	  }
	  return pswd.toString();
  }
}

