package solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavesPrincess2 {

	static void nextMove(int n, int r, int c, String [] grid){
		int pr = -1; int pc= -1;
		for(int i=0; i<grid.length; i++)
		{
			String row = grid[i];
			for(int j=0; j<row.length(); j++)
			{
				if(row.charAt(j) == 'p')
				{
					pr = i; pc = j;
				}
			}
		}
		String nextMove = null;
		if(pr < r) nextMove = "UP";
		else if(pr == r && pc < c) nextMove = "LEFT";
		else if(pr == r && pc > c) nextMove = "RIGHT";
		else if(pr > r) nextMove = "DOWN";
		System.out.println(nextMove);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,r,c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];


		for(int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n,r,c,grid);

	}
}
