package days04;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println( 15 >> 2);
		System.out.println( 15 >>> 2);
		System.out.println( 15 << 2);
		
		System.out.printf("%08d", Integer.parseInt(Integer.toBinaryString(15)));	//2���� ���·� ��ȯ 
		
		System.out.println(Integer.toOctalString(15)); //8���� ���ڿ�
		System.out.println(Integer.toHexString(15));  //16���� ���ڿ� 
	}

}
