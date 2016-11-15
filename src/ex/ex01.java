package ex;

import java.util.Scanner;

/*請寫一個程式，用陣列儲存使用者輸入的 n 個整數，
 * 透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int data[] = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scn.nextInt();

		}
		System.out.println(fun(data, N));
	}

	public static float fun(int data[], int N) {
		float sum = 0;
		float m = 0;
		for (int x = 0; x < data.length; x++) {
			sum += data[x];
		}
		for (int j = 0; j < data.length; j++) {
			m = (float) (m + (Math.pow(data[j] - sum / N, 2)));
		}
		float y = m / N;
		return y;
	}
}
