package solutions;

import java.util.Scanner;

/**
 * Created by aswath-4574 on 26/08/18.
 */
public class BotCleanStochastic
{
	static void nextMove(int r, int c, String[] grid){
		int pr = -1; int pc= -1;
		for(int i=0; i<grid.length; i++)
		{
			String row = grid[i];
			for(int j=0; j<row.length(); j++)
			{
				if(row.charAt(j) == 'd')
				{
					pr = i; pc = j;
				}
			}
		}
		String nextMove = null;
		if(pr == r && pc == c) nextMove = "CLEAN";
		else if(pr < r) nextMove = "UP";
		else if(pr == r && pc < c) nextMove = "LEFT";
		else if(pr == r && pc > c) nextMove = "RIGHT";
		else if(pr > r) nextMove = "DOWN";
		System.out.println(nextMove);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] pos = new int[2];
		String board[] = new String[5];
		for(int i=0;i<2;i++) pos[i] = in.nextInt();
		for(int i=0;i<5;i++) board[i] = in.next();
		nextMove(pos[0], pos[1], board);
	}
}
