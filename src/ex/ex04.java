package ex;

import java.util.Scanner;

/*���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
 * Date: 2016/11/14
 * Author: 105021056 ���a��
 */
public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static int fun(int n1) {
		if (n1 == 1) {
			return 1;
		} else {
			return n1 * fun(n1 - 1);
		}
	}

}

