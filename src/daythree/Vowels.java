package daythree;

public class Vowels {
public static void main (String[] args) {
	String text ="EDUCATION";
	String vowel = " ";
			int vowelscount=0;
		text =	text.toLowerCase();
		for (int i=0; i<text.length();i++)
		{
			char c = text.charAt(i);
			if(c== 'a' || c== 'e' || c== 'i' || c== 'o' || c == 'u') {
				++vowelscount;
				vowel = vowel + c;
				
			}
			
			//System.out.println("Vowels : " + vowels);
		}
		System.out.println("Total Vowels in the word EDUCATION :"  + vowelscount);
		System.out.println("Vowels in the word are :" + vowel);

}
}
