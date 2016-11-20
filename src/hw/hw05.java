package hw;
/*寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。
 * 例如:輸入 1234 回傳 4321
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        
        fun(n);
        
	}
	public static void fun(long n){
		if(n==0){
			
			return ;
		}else{
			System.out.print(n%10);
			 fun(n/10);
			
		}
	}

}
