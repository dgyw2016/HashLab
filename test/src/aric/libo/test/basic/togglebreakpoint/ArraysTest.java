package aric.libo.test.basic.togglebreakpoint;

/**
 * @author shuos
 * �ĵ�ע�Ϳ�ݼ���Myeclipse������ĵ�ע�Ϳ�ݼ���shift+alt+j
 *
 */
public class ArraysTest {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub������
		int [] array=new int[] {5,6,8,0,10};
		/*Cannot define dimension(�ߴ磩 expressions when 	an array initializer 
		is provided��������������͸�ֵͬʱ����ʱ����ֵ�Ѿ�����������ߴ磬���Բ�����[]��
		�ٴζ������鳤�ȣ����򱨴�����
		����ע�Ϳ�ݼ���ctrl+shift+c(comment)��ctrl+/(ȡ������ע��ͬ����
		����ע�Ϳ�ݼ���ctrl+shift+/(forward slash)��ȡ���÷�б��\
		tips:ע������"/"and "\"ʱ��Ҫ��Ӣ�����뷨״̬��
*/		System.out.println(array.length);
	}

}
