package ex;


/*承上題，除了var() 函數之外，再用建立一個 std() 函數，
 * 程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，
 * 特別注意，不要只用 std() 函數算結果，
 * 必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，
 * 主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int data[] = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scn.nextInt();

		}
		System.out.println(std(data, N));
	}

	public static float var(int data[], int N) {
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

	public static float std(int data[], int N) {
		double a = var(data, N);
		return (float) Math.sqrt(a);

	}
}