package demo;

public class ForTest {

	public static void main(String[] args) {
		// ��ѭ��
		for (int count = 0 ; count < 10 ; count++)
		{
			System.out.println(count);
			count *= 0.1;
			//����ѭ��
			break;
		}
		System.out.println("ѭ��������");
		
	}

}
