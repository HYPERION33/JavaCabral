package ArrayList_Vectores;

public class ArrayBidimensional2 {
	
	public static void main(String[] args) {
		
		int [][] matrix = {
				{10,15,20,25,30},
				{1,2,3,4,5},
				{11,12,13,14,15},
				{30,31,32,33,34},	
		};
		
		//for each
		for(int[]fila:matrix) {
			
			System.out.println();
			
			// for each
			for(int z: fila){
				
				System.out.print(z + " ");
			}
		}
	}

}
