package demo;

public class ContinueTest {

	public static void main(String[] args) {
		// ���ѭ��
		outer:
		for (int i=0;i<3;i++)
		{
			System.out.println("i��ֵ��" +i);
			if (i==0)
			{
//				���Ա���ѭ��ʣ�����
				continue outer;
			}
			
			System.out.println("continue���������");
		}

	}

}
