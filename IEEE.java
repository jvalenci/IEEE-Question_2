/*		This a a IEEE problem number 2
*
*		Author: Jonathan Valencia
*		Date: 5/7/2015
*
*
*/

import java.util.*;

public class IEEE{
	public static void main(String[] argv){

		Scanner scan = new Scanner(argv[0]);  	//scanner
		int k = scan.nextInt();		//gets our count variable
		
		for(int i = 0; i < k; ++i){
		
			int n, x1, y1, z1, x2, y2, z2;
			double c1,c2, distance;

			n = scan.nextInt();
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			z1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			z2 = scan.nextInt();

			//check to see if the blocks are the same if so return 0
			if( x1 == x2 && y1 == y2 && z1 == y2){
				c1 = 0;
				c2 = 0;
				System.out.println("This is the same block. The distance is: " + c1 + "With blocked paths. " + c2 + " With out paths ");
				break;
			}

			//while findDist has a value it will keep trying to move toward the end
			while (findDist()){

			}



		}

	}//end of main

	public findDist(int x1, int y1, int z1, int x2, int y2, int z2)
	{
		if(x2 % 2 == 1 && y2 % 2 == 1 && z2 % 2 == 1){
			System.out.println("The next block you are trying to reach is blocked")
		}else{
			Math.sqrt( (x1 * x1) - (2 * (x1 * x2)) + (x2 * x2) +
					   (y1 * y1) - (2 * (y1 * y2)) + (y2 * y2) +
					   (z1 * z1) - (2 * (z1 * z2)) + (z2 * z2) );
		}
	}


}//end of IEEE