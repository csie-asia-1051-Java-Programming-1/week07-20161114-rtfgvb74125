package ex;

/*�ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA�{���b�������ϥΪ̿�J���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A�S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A�D�{���A�⵲�G�L�X�C
 * Date: 2016/11/14
 * Author: 105021056 ���a��
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