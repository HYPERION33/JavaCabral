package ArrayList_Vectores;

public class ArrayBidimencional {
	
	public static void main(String[] args){
		
		int [][] matrix = new int[4][5]; //dos dimensiones, dos []
		
		matrix[0][0]= 1; 
		matrix[0][1]= 2; 
		matrix[0][2]= 3; 
		matrix[0][3]= 4; 
		matrix[0][4]= 5; 
		
		matrix[1][0]= 10; 
		matrix[1][1]= 20; 
		matrix[1][2]= 30; 
		matrix[1][3]= 40; 
		matrix[1][4]= 50;
		
		matrix[2][0]= 100; 
		matrix[2][1]= 200; 
		matrix[2][2]= 300; 
		matrix[2][3]= 400; 
		matrix[1][4]= 500;
		
		matrix[3][0]= 1000; 
		matrix[3][1]= 2000; 
		matrix[3][2]= 3000; 
		matrix[3][3]= 4000;
		matrix[3][4]= 5000;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println();// para ordenar un poco
			
			for(int j = 0; j < 5; j++) {//cuando termina de recorrer j realiza el for de i
				
				System.out.print(matrix[i][j] + " ");
				
			}
		}
		
	}

}



















