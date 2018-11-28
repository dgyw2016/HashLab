package aric.libo.test.basic.togglebreakpoint;
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner对象的hasNextInt()方法，可以判断用户从键盘输入的字符是
//		否是合法的数字
		System.out.println("输入一个数：");
		Scanner input=new Scanner(System.in);
		boolean a=input.hasNextInt();
		System.out.println(a);

	}

}
