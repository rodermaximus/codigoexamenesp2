public class auxs{

	public static void impArray(int[] a){
		
		if(a!=null){
			for(int i=0 ; i<a.length ; i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		else{
			System.out.println(a);
		}
	}
	public static void impArrayCad(String[] a){
		
		if(a!=null){
			for(int i=0 ; i<a.length ; i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		else{
			System.out.println(a);
		}
	}
	public static void impMatrixCad(String[][] mat){
		
		if(mat!=null){
			for(int i=0 ; i<mat.length ; i++){
				for(int j=0 ; j<mat[i].length ; j++){
					
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println(mat);
		}
	}
	public static void impMatrix(int[][] mat){
		
		if(mat!=null){
			for(int i=0 ; i<mat.length ; i++){
				for(int j=0 ; j<mat[i].length ; j++){
					
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println(mat);
		}
	}
	public static void main(String[] args){}

	
	








}