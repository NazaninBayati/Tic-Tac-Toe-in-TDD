package tic;

public class Tic {

	static String[][] def_Board = new String[3][3];

	public static String[][] emptyboard(int row, int col)
	{
		// defining the empty board

		String[][] board = new String[row][col];
		for (int i = 0; i< row; i++)
		{
			for (int j =0; j< col; j++)
			{
				board[i][j] = "_";
			}
		}
		return board;
	}

	public static int boardSize(int row, int col)
	{
		// returning the size of the board
		return row*col;
	}


	public static String[][] default_Board()
	{
		//creating the default board

		for (int i = 0; i< 3; i++)
		{
			for (int j =0; j< 3; j++)
			{
				Tic.def_Board[i][j] = "_";
			}
		} 
		return Tic.def_Board;
	}

	public static String positions(boolean player,int row,int col) 
	{
		//play the game by selecting each position

		String sign = "_";
		if(player) 
		{
			sign = "X";
		}
		else
		{
			sign = "O";
		}
		if(Tic.def_Board[row][col] == "X" || Tic.def_Board[row][col] == "O") {

			return "N";

		}
		else 
		{
			Tic.def_Board[row][col] = sign;

		}

		return def_Board[row][col];
	}


	public static boolean winner()
	{
		/// define the winner of the game
		// write your code to find the winner

		if (Tic.def_Board[0][0]=="X" && Tic.def_Board[0][1]=="X" && Tic.def_Board[0][2]=="X" )
		{
			return true;
		}
		else {
			return false;
		}
	}
}
