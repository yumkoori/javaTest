package days06;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String -> char[] 변환
		String name = "admin";
		String name2 = "";
		char[] charArray = new char[name.length()];
		//1
		char[] toCh = name.toCharArray();
		
		
		//2
		for(int i = 0; i < name.length(); i++) {
			charArray[i] = name.charAt(i);
			System.out.println(charArray[i]);
		}
		
		// char[] -> String 변환
		//1
		String newChar = new String(charArray);
		//2
		newChar = String.valueOf(charArray);
		
		for(int i = 0; i < newChar.length(); i++) {
//			name += newChar[i];
		}
		
		name  = "";
		for (int i = 0; i < charArray.length; i++) {
			 name += charArray[i];
		}
	}

}
