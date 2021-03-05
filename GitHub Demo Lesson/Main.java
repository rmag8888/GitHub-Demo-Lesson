/*
* CRACK THE CODE COLLABORATIVELY
* Using the power of git we should crack this message in no time!
*
* message: imihjezglhzjifwzhqmoziaxifghhbmoehj8i0sjf
*/

import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(charles(ilan(robert(mati(gauri(josh(leah("imihjezglhzjifwzhqmoziaxifghhbmoehj8i0sjf"))))))));
	}

	public static String leah(String str)
	{
		//remove every third character
		String s = "";
		for(int i=0;i<str.length();i++)
			if((i+1)%3!=0) s+=str.charAt(i);
		return s;
	}

	public static String josh(String str)
	{
		//change all 'z' characters to 'k' characters
		//don't worry about uppercase
		String s = "";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='z') s+='k';
			else s+= str.charAt(i);
		return s;
	}

	public static String gauri(String str)
	{
		//substitute letters to their numeric position in the alphabet (A = 1, B = 2, etc. and represent position in hex)
		//if the character is a digit then the digit will remain as it was
		//so for example if you received the String "feedb4ack123" this method should return "65542413b123"
		//the ascii value of 'a' is 97
		//Character.isDigit(char c) and/or Character.isLetter(char c) and/or Integer.toHexString(int n) may help
		//don't worry about uppercase
		String s = "";
		for(int i=0;i<str.length();i++)
			if(Character.isDigit(str.charAt(i)))s+=str.charAt(i);
			else s+=Integer.toHexString((int)str.charAt(i)-96);
		return s;
	}

	public static String mati(String str)
	{
		//Convert Hexadecimal String to Binary String
		//the hexadecimal value being passed in here is most likely going to be insanely large
		//so I recommend you use BigInteger here.
		//You can initialise a BigInteger with a String and specify that it's base 2 using BigInteger(str,2)
		//BigInteger has a toString method and you can specify the radix (base system) as a parameter.
		//For example: new BigInteger(str,2).toString(10) converts a binary string to a decimal string of the same value
		return new BigInteger(str,16).toString(2);
	}

	public static String robert(String str)
	{
		//switch the 1s and 0s in this string consisting of 1s and 0s
		//you can assume the only characters in the string being passed in are either '1' or '0'
		String s = "";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='0') s+='1';
			else s+='0';
		return s;
	}

	public static String ilan(String str)
	{
		//convert binary string to alphanumeric string
		//remember that each character is one byte, 8 bits
		//so you'll need to loop through this String one byte at a time
		//Integer has a method called parseInt which will retrieve all kinds of numbers from Strings
		//you can specify the radix (base of a system of numeration) of the string as well.
		//For example int n = Integer.parseInt("4A",16) will evaluate to 74 in decimal
		//and the value stored in n will be 74
		String s = "";
		for(int i=0;i<str.length();i+=8)
			s+=(char)Integer.parseInt(str.substring(i,i+8),2);
		return s;
	}

	public static String charles(String str)
	{
		//reverse the String being passed in
		String s = "";
		for(int i=str.length()-1;i>=0;i--)
			s+=str.charAt(i);
		return s;
	}

}
