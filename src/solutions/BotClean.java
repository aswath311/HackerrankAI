package solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotClean {

	static void next_move(int posr, int posc, String[] board){
		MatrixPostition nearestPos = findNearestPosition(posr, posc, board);
		if(nearestPos.posr == posr)
		{
			if(nearestPos.posc == posc)
			{
				System.out.println("CLEAN");
			}
			else if(nearestPos.posc < posc)
			{
				System.out.println("LEFT");
			}
			else
			{
				System.out.println("RIGHT");
			}
		}
		else if(nearestPos.posr < posr)
			System.out.println("UP");
		else
			System.out.println("DOWN");
	}

	static MatrixPostition findNearestPosition(int posr, int posc, String[] board)
	{
		int noOfMoves = 0;
		while(noOfMoves < 8)
		{
			for(int r=0; r<=noOfMoves; r++)
			{
				int c = noOfMoves - r;
				try
				{
					if(board[posr + r].charAt(posc + c) == 'd')
					{
						return new MatrixPostition(posr+r, posc + c);
					}
				}
				catch(IndexOutOfBoundsException e){}
				try
				{
					if(board[posr + r].charAt(posc - c) == 'd')
					{
						return new MatrixPostition(posr + r, posc - c);
					}
				}
				catch(IndexOutOfBoundsException e){}
				try
				{
					if(board[posr - r].charAt(posc + c) == 'd')
					{
						return new MatrixPostition(posr - r, posc + c);
					}
				}
				catch(IndexOutOfBoundsException e){}
				try
				{
					if(board[posr - r].charAt(posc - c) == 'd')
					{
						return new MatrixPostition(posr - r, posc - c);
					}
				}
				catch(IndexOutOfBoundsException e){}
			}
			noOfMoves++;
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] pos = new int[2];
		String board[] = new String[5];
		for(int i=0;i<2;i++) pos[i] = in.nextInt();
		for(int i=0;i<5;i++) board[i] = in.next();
		next_move(pos[0], pos[1], board);
	}

	static class MatrixPostition
	{
		int posc = -1;
		int posr = -1;

		MatrixPostition(int r, int c)
		{
			posr = r;
			posc = c;
		}
	}
}

