package cogent.homework.assignment1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOps.isPrime(5));
		System.out.println(NumberOps.isPrime(4));
		System.out.println(NumberOps.isPalendrome(12321));
		System.out.println(NumberOps.isPalendrome(12345));
		System.out.println(NumberOps.swapDigits(39, 0, 1));
		NumberOps.getPrimeFactor(20);
		System.out.println(NumberOps.reverseInt(12345));
		System.out.println(StringOps.removeCharAt("abc", 0));
		System.out.println(StringOps.charTypeCount("abcab",'a'));
		System.out.println(StringOps.isAnagram("aba", "baa"));
		System.out.println(StringOps.isAnagram("aba", "baab"));
		System.out.println(StringOps.isAnagram("abaa", "baab"));
		System.out.println(StringOps.isPalandrome("anutforajaroftuna"));
		System.out.println(StringOps.vowelOrConsenant('a'));
		System.out.println(StringOps.vowelOrConsenant('b'));
		System.out.println(StringOps.vowelOrConsenant('1'));
		System.out.println(StringOps.isDigit('b'));
		System.out.println(StringOps.isDigit('1'));
		System.out.println(StringOps.deleteVowels("abc"));
		System.out.println(StringOps.letterCount("abc123"));
		System.out.println(StringOps.mostFrequentChar("aaabc"));
		System.out.println(StringOps.replaceFirstVowel("abcde"));
		System.out.println(StringOps.countNotBlank("a b 1 3"));
		System.out.println(StringOps.deleteBlank("a b 1 3"));
		System.out.println(StringOps.removeRepeatChar("a b 1 3"));
		System.out.println(StringOps.sortAscending("a b 1 3"));
		System.out.println(StringOps.sortDecending("a b 1 3"));
	}

}
