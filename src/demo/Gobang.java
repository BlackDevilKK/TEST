package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang 
{
	//定义棋盘的大小
	private static int BOARD_SIZE = 15;
	//定义一个二维数组充当棋盘
	private String[][] board;
	public void initBoard()
	{
		//初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//把每个元素符为“+”，用于在控制台画出棋盘
		for (int i=0 ; i<BOARD_SIZE;i++)
		{
			for (int j=0 ; j<BOARD_SIZE;j++)
			{
				board[i][j] = "+";
			}
		}
	}
	//在控制台输出棋牌的方法
	public void printBoard()
	{
		//打印每个数组元素
		for (int i=0 ; i<BOARD_SIZE;i++)
		{
			for (int j=0 ; j<BOARD_SIZE;j++)
			{
				//打印数组元素后不换行
				System.out.print(board[i][j]);
			}
			//每打印完一行数组元素后输出一个换行符
			System.out.print("\n");
		}
}
public static void main(String[] args) throws Exception
{
	Gobang gb = new Gobang();
	gb.initBoard();
	gb.printBoard();
	//获取键盘输入的方法
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String inputStr = null;
	//br.readLine();每当在键盘上输入一行内容后按回车键，刚输入的内容将被br读取到
	while ((inputStr=br.readLine())!=null)
	{
		String[] posStrArr = inputStr.split(",");
		int xPos = Integer.parseInt(posStrArr[0]);
		int yPos = Integer.parseInt(posStrArr[1]);
		gb.board[yPos - 1][xPos - 1]="o";
		gb.printBoard();
		System.out.println("请输入您下棋的坐标，应以x，y的格式：");
	}
	}
}