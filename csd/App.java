package csd;

class App {
	public static void main(String [] args)
	{
		IsPalindromeTest.run();		
	}
}

class IsPalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.nextLine();
			
			if ("quit".equals(str))
				break;
			
			System.out.println(StringUtil.isPalindrome(str) ? "Palindrom" : "Palindrom değil");	
		}
	}
}

class StringUtil {
	public static boolean isPalindrome(String s)
	{
		int firstidx = 0;
		int lastidx = s.length() - 1;		
		
		while (firstidx < lastidx) {
			
			if (!Character.isLetter(s.charAt(firstidx))) {
				++firstidx;
				continue;
			}			
		
			if (!Character.isLetter(s.charAt(lastidx))) {
				--lastidx;
				continue; 
			}	
			
			if (Character.toLowerCase(s.charAt(firstidx)) != Character.toLowerCase(s.charAt(lastidx)))
				return false;								
		
		++firstidx;
		--lastidx;
		
		}
		
		return true;
	}
}



