package demo;

public class ContinueTest {

	public static void main(String[] args) {
		// 外层循环
		outer:
		for (int i=0;i<3;i++)
		{
			System.out.println("i的值是" +i);
			if (i==0)
			{
//				忽略本次循环剩下语句
				continue outer;
			}
			
			System.out.println("continue后的输出语句");
		}

	}

}
