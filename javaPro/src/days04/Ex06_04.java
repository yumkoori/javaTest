package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - ���� 3:33:53
 * @subject 
 * @content
 */
public class Ex06_04 {
   
   public static void main(String[] args) {
      // [����] if�� ���,  if ~ else��
      // ���� ������ �Է¹޾Ƽ�
      // ��/��/��/��/��
      // ���
      // ��    90 �̻� ~ 100����
      // ��    80 �̻� ~ 90 �̸�(89����)
      // ��    70 �̻� ~ 80 �̸�(79����)
      // ��    60 �̻� ~ 70 �̸�(69����)
      // ��    0 �̻� ~ 60 �̸�(59����)
      int kor = -1 ;       
      Scanner scanner = new Scanner(System.in);
      System.out.print("> ���� ���� �Է� ? ");  // 0<=   <=100
      
      /*
      if ( scanner.hasNextInt() ) {
         // InputMismatchException
         kor = scanner.nextInt();  // 1a , 99.87 
      }else {
         System.out.println("[�˸�] ���� ���� 0~100 !!!");
         return ;
      }
      */
      
      if (!scanner.hasNextInt()) {
         System.out.println("[�˸�] ���� ���� 0~100 !!!");
         return ;
      } // if
    
      kor = scanner.nextInt();  // 1a , 99.87
      // The local variable kor may not have been initialized
      if ( 0 <= kor && kor <= 100 ) {
         // ��/��/��/��/��
         if ( 90 <= kor && kor <= 100 ) {
            System.out.println("��");
         } // if
         if ( 80 <= kor && kor <= 89 ) {
            System.out.println("��");
         } // if
         if ( 70 <= kor && kor <= 79  ) {
            System.out.println("��");
         } // if
         if ( 60 <= kor && kor <= 69 ) {
            System.out.println("��");
         } // if
         if ( 0 <= kor && kor <= 59 ) {
            System.out.println("��");
         } // if
      } else {
         System.out.println("[�˸�] ���� ���� 0~100 !!!");
      } // if
      
      
      
      
      System.out.println(" end ");
   } // main

} // class









