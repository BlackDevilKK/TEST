package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang 
{
	//�������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	//����һ����ά����䵱����
	private String[][] board;
	public void initBoard()
	{
		//��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��ÿ��Ԫ�ط�Ϊ��+���������ڿ���̨��������
		for (int i=0 ; i<BOARD_SIZE;i++)
		{
			for (int j=0 ; j<BOARD_SIZE;j++)
			{
				board[i][j] = "+";
			}
		}
	}
	//�ڿ���̨������Ƶķ���
	public void printBoard()
	{
		//��ӡÿ������Ԫ��
		for (int i=0 ; i<BOARD_SIZE;i++)
		{
			for (int j=0 ; j<BOARD_SIZE;j++)
			{
				//��ӡ����Ԫ�غ󲻻���
				System.out.print(board[i][j]);
			}
			//ÿ��ӡ��һ������Ԫ�غ����һ�����з�
			System.out.print("\n");
		}
}
public static void main(String[] args) throws Exception
{
	Gobang gb = new Gobang();
	gb.initBoard();
	gb.printBoard();
	//��ȡ��������ķ���
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String inputStr = null;
	//br.readLine();ÿ���ڼ���������һ�����ݺ󰴻س���������������ݽ���br��ȡ��
	while ((inputStr=br.readLine())!=null)
	{
		String[] posStrArr = inputStr.split(",");
		int xPos = Integer.parseInt(posStrArr[0]);
		int yPos = Integer.parseInt(posStrArr[1]);
		gb.board[yPos - 1][xPos - 1]="o";
		gb.printBoard();
		System.out.println("����������������꣬Ӧ��x��y�ĸ�ʽ��");
	}
	}
}