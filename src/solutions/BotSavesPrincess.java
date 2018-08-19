package solutions;

import java.util.*;

public class BotSavesPrincess {

	static void displayPathtoPrincess(int n, String [] grid){
		if(grid[0].charAt(0) == 'p')
		{
			for( int i =0; i < n/2; i++)
				System.out.println("LEFT");
			for( int i =0; i < n/2; i++)
				System.out.println("UP");
		}
		else if(grid[0].charAt(n-1) == 'p')
		{
			for( int i =0; i < n/2; i++)
				System.out.println("RIGHT");
			for( int i =0; i < n/2; i++)
				System.out.println("UP");
		}
		else if(grid[n-1].charAt(0) == 'p')
		{
			for( int i =0; i < n/2; i++)
				System.out.println("LEFT");
			for( int i =0; i < n/2; i++)
				System.out.println("DOWN");
		}
		else
		{
			for( int i =0; i < n/2; i++)
				System.out.println("RIGHT");
			for( int i =0; i < n/2; i++)
				System.out.println("DOWN");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for(int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m,grid);
	}
}