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
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				data[i][j] = scn.nextInt();
			}
		}
		System.out.println(var(data));
		System.out.println(std(data));

	}

	public static float var(int data[][]) {
		float sum = 0;
		float m = 0;
		for (int x = 0; x < data.length; x++) {
			for(int y = 0;y<data[0].length;y++){
				sum+=data[x][y];
			}
		}
		int N = data.length*data[0].length;
		for (int j = 0; j < data.length; j++) {
			for(int i = 0;i< data[0].length;i++){
				m = (float) (m + (Math.pow(data[j][i] - sum / N, 2)));
			}
			
		}
		float y = m / N;
		return y;//y 回傳到Ssytem.out.println(var(data));
	}

	public static float std(int data[][]) {
		double a = var(data);//呼叫上方算完的var(data);
		return (float) Math.sqrt(a);//回傳至System.out.println(std(data));
	}

}
