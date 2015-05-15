/*		This a a IEEE problem number 2
*
*		Author: Jonathan Valencia
*		Date: 5/7/2015
*
*
*/

import java.util.*;
import java.io.*;

public class IEEE{
			
			int n = 0, x1 = 0, y1 = 0, z1 = 0, x2 = 0, y2 = 0, z2 = 0;	//declare variables
			double c1= 0.0,c2 = 0.0, distance= 0.0;

	public static void main(String[] argv) throws FileNotFoundException{

		File file = new File(argv[0]);		//this is my file that is cmd line

		try{

			Scanner scan = new Scanner(file);  	//scanner
			int k = scan.nextInt();		//gets our count variable
			

			IEEE ie = new IEEE();	//instantiation
			

			
			
			//this is going to loop the same numbe of times as our
			//loop count which is the first number in the txt file.

			for(int i = 0; i < k; ++i){
				
				ie.n = scan.nextInt();
				ie.x1 = scan.nextInt();
				ie.y1 = scan.nextInt();
				ie.z1 = scan.nextInt();
				ie.x2 = scan.nextInt();
				ie.y2 = scan.nextInt();
				ie.z2 = scan.nextInt();
					
				//check to see if the blocks are the same if so return 0
				if( ie.x1 == ie.x2 && ie.y1 == ie.y2 && ie.z1 == ie.y2){
					ie.c1 = 0;
					ie.c2 = 0;
					System.out.println("This is the same block. The distance is: " + ie.c1 + "With blocked paths. " + ie.c2 + " With out paths ");
					break;
				}

				
			}
			scan.close();
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}//end of main

	//finds the distance between two points in space.
	public double findDist(int x1, int y1, int z1, int x2, int y2, int z2)
	{
		return Math.sqrt( (x1 * x1) - (2 * (x1 * x2)) + (x2 * x2) +
					      (y1 * y1) - (2 * (y1 * y2)) + (y2 * y2) +
					      (z1 * z1) - (2 * (z1 * z2)) + (z2 * z2) );
		
	}//end of findDist

	//checks if block is blocked
	public boolean isBlocked(int x1, int y1, int z1)
	{
		//check to see if x,y,z are odd
		if(x1 % 2 == 1 && y1 % 2 == 1 && z1 % 2 == 1){
			System.out.println("The next block you are trying to reach is blocked.");
			return true;
		}else{
			return false;
		}
	}//end of isBlocked

	public void moveUp(int x, int y, int z)
	{
		++z;
		
	}



}//end of IEEE





