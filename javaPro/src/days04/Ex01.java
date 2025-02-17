package days04;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println( 15 >> 2);
		System.out.println( 15 >>> 2);
		System.out.println( 15 << 2);
		
		System.out.printf("%08d", Integer.parseInt(Integer.toBinaryString(15)));	//2진수 형태로 변환 
		
		System.out.println(Integer.toOctalString(15)); //8진수 문자열
		System.out.println(Integer.toHexString(15));  //16진수 문자열 
	}

}
