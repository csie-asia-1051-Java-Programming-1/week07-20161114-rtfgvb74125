package hw;
/*寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(fun(a,b));
	}

	public static int fun(int a,int b){
		if(b==0){
			return a;
		}else{
			//System.out.print(a+"\t"+b);
			int c = fun(b,a%b);
			return c;
			
		}
	}
}
