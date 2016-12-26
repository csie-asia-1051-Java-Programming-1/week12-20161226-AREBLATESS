package ex;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char c[]=scn.next().toCharArray();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ") ;
		}
		System.out.println();
	}

}
//String str=scn.nextInt();
//char v2=str.charAt(0);
//int v1=(int)v2;