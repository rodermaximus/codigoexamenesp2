public class p010{
	
		public static void main(String[] args){
			
			String prob = "flores en el campo flores en el prado donde las amapolas abundan entre todas las flores q q q q a a a a a";

			String[][] cads = Metodos.histograma(prob, 3);
			if(cads != null)
				auxs.impMatrix(cads);
			else
				System.out.println("matriz vacia");
		}
}

	