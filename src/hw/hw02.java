package hw;
/*以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
        int sum = 0;
		System.out.println(fun(n,sum)-1); 
	 }
     public static int fun(Long m,int sum1){
    	 if(m==0){
    		return 1;
    	 }else{
    		 m=m/10;
    		 return 1+fun(m,sum1++);
    	 }
     }
}
