package ex;

/*�мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C
 * Date: 2016/11/14
 * Author: 105021056 ���a��
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
