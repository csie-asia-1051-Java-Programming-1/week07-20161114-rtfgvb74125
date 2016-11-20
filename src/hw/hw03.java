package hw;
/*輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int sum = 1;
		for(int i = 0;i<n;i++){
			sum = sum*(m-i);
		}
		System.out.println(sum/fun(n));
	}
	public static int fun(int m){
		if(m==0){
			return 1;
		}else{
			return m*fun(m-1);
		}
	}
}
