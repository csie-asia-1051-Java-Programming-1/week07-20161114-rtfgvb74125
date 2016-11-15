package ex;


/*請寫一個程式，讓使用者輸入一個整數二維陣列，
 * 建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，
 * 並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int data[][] = new int[a][b];
		for (int i = 0;i<a;i++){	
		for(int j = 0;j<b;j++){
			data[i][j] = scn.nextInt();
		}
		}
	}

}
