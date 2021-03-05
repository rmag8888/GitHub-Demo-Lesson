import java.math.BigInteger;

public class Main
{
	//Check my work
	// instance variables - replace the example below with your own
	//"You win GitHub"
	//reverse string: buHtiG niw uoY
	//convert from binary to string: 0110001001110101010010000111010001101001010001110010000001101110011010010111011100100000011101010110111101011001
	//switch 1 and 0s: 1001110110001010101101111000101110010110101110001101111110010001100101101000100011011111100010101001000010100110
	//hexadecimal to binary 9D8AB78B96B8DF919688DF8A90A6
	//substitute letters to their numeric position in the alphabet (A = 1, B = 2, etc. and represent values in hex) imhakghkifkhmoiaifhhmohaiaf
	//change z to a: imhzkghkifkhmoizifhhmohzizf
	//remove every third character beginning at character 2 (0, 1, 2 <-- remove) imshzdkgfhkjifpkhxmouizdiffhhtmoqhzfizpf

	public static void main(String[] args)
	{
		//System.out.println((char) Integer.parseInt("01001000", 2));
		System.out.println(charles(ilan(robert(mati(gauri(josh(leah("imshzdkgfhkjifpkhxmouizdiffhhtmoqhzfizpf"))))))));
	}

	public static String leah(String str)
	{
		//remove every third character

		//...

		return "";
	}

	public static String josh(String str)
	{
		//change all 'z' characters to 'a' characters

		//...

		return "";
	}

	public static String gauri(String str)
	{
		//substitute characters to their numeric position in the alphabet (A = 1, B = 2, etc. and represent position in hex)
		//so for example if you received the String "feedback" this method should return "6554213B"

		//...

		return "";
	}

	public static String mati(String str)
	{
		//Convert Hexadecimal String to Binary String
		//the hexadecimal value being passed in here is most likely going to be insanely large
		//so I recommend you use BigInteger here
		//you can initialise a BigInteger with a String and specifying that it's base 2 using BigInteger(str,2)
		//BigInteger has a toString method and you can specify the radix (base system) as a parameter.
		//For example new BigInteger(str,2).toString(10) converts a binary string to decimal string

		//...

		return "";
	}

	public static String robert(String str)
	{
		//switch the 1s and 0s in this string consisting of 1s and 0s

		//...

		return "";
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

		//...

		return "";
	}

	public static String charles(String str)
	{
		//reverse the String being passed in

		//...

		return "";
	}

}
