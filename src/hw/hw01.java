package hw;

/*請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數
 * Date: 2016/11/14
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		int sum = 1;
		
		System.out.println(fun(x, y, z, sum));
	}

	public static int fun(int a, int b, int c, int sum) {
		for (int i = a; i > 1; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				sum = sum * i;
				a = a / i;
				b = b / i;
				c = c / i;
			}

		}
		for (int i = a; i > 1; i--) {
			if (a % i == 0 && b % i == 0 && c % i != 0) {
				sum = sum * i;
				a = a / i;
				b = b / i;
			} else if (a % i != 0 && b % i == 0 && c % i == 0) {
				sum = sum * i;
				b = b / i;
				c = c / i;
			} else if (a % i == 0 && b % i != 0 && c % i == 0) {
				sum = sum * i;
				a = a / i;
				c = c / i;
			}
		}
		return a * b * c * sum;
	}
}
