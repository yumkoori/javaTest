package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		//���� Ű����� ���� �̸��� �Է¹޾Ƽ� ���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է�?:");
		//Unhandled exception type IOException
		String name = br.readLine();
		
		System.out.printf("�̸�=%s\n", name);
	}
}
