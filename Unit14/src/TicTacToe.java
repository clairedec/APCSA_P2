//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat= new char[3][3];

	}

	public TicTacToe(String game)
	{
		mat= new char[3][3];
		int counter=0;
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				mat[r][c] = game.charAt(counter);
				counter++;
			}
		}



	}

	public String getWinner()
	{
		
		for ( int r=0; r<3; r++)
		{
			if (mat[r][0]== 'O' && mat[r][1]== 'O' && mat[r][2]== 'O' )
			{
				return "O's won horizontally";
			}
			
			if (mat[r][0]== 'X' && mat[r][1]== 'X' && mat[r][2]== 'X' )
			{
				return "X's won horizontally";
			}

		}
		
		for ( int c=0; c<3; c++)
		{
			if (mat[0][c]== 'O' && mat[1][c]== 'O' && mat[2][c]== 'O' )
			{
				return "O's won horizontally";
			}
			
			if (mat[0][c]== 'X' && mat[1][c]== 'X' && mat[2][c]== 'X' )
			{
				return "X's won horizontally";
			}

		}
		
		if ( mat[0][0]=='X' && mat[1][1]=='X' && mat[2][2]=='X') {
			return "X's wins diagonally!";
		}
		
		if  (mat[0][0]=='0' && mat[1][1]=='0' && mat[2][2]=='0') {
			return "O's wins diagonally!";
		}
		
		if ( mat[0][2]=='O' && mat[1][1]=='O' && mat[2][0]=='O') {
			return "O's wins diagonally!";
		}
		
		if  (mat[0][2]=='X' && mat[1][1]=='X' && mat[2][0]=='X') {
			return "X's wins diagonally!";
		}
		
		else
		{
			return "cat's game - no winner!";

		}
		

	}

	public String toString()
	{
		String output="";
		for (int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output += mat[r][c];
			}
			output += "\n";
		}






		return output+ "\n" + getWinner() + "\n\n";
	}
}