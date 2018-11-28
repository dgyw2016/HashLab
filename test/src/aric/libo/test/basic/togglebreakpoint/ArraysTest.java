package aric.libo.test.basic.togglebreakpoint;

/**
 * @author shuos
 * 文档注释快捷键：Myeclipse中添加文档注释快捷键：shift+alt+j
 *
 */
public class ArraysTest {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub（方法
		int [] array=new int[] {5,6,8,0,10};
		/*Cannot define dimension(尺寸） expressions when 	an array initializer 
		is provided：在数组的声明和赋值同时进行时，赋值已经决定了数组尺寸，所以不能在[]中
		再次定义数组长度，否则报错如上
		单行注释快捷键：ctrl+shift+c(comment)或ctrl+/(取消单行注释同样）
		多行注释快捷键：ctrl+shift+/(forward slash)，取消用反斜杠\
		tips:注意输入"/"and "\"时，要在英文输入法状态下
*/		System.out.println(array.length);
	}

}
