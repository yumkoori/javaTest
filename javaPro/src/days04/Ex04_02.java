package days04;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");	//����ǥ����(regular expression)
	     //				\s ����
	     // 			*�ݺ� Ƚ�� 0 ~ ������
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();

	}

}
