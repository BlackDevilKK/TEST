package demo;

public class ForTest {

	public static void main(String[] args) {
		// 死循环
		for (int count = 0 ; count < 10 ; count++)
		{
			System.out.println(count);
			count *= 0.1;
			//结束循环
			break;
		}
		System.out.println("循环结束！");
		
	}

}
