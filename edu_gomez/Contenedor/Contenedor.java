public class Contenedor{
	
	private int[] contenido;

	public Contenedor(int num){
		int max = 5;
		if(num > 0){
			max = num;
		}
		contenido = new int[max];
	}
	public int agrega(int num){
		int res = 0;
		if(num > 0){
			for(int=0 ; i<contenido.length ; i++){
				if(contenido[i] == 0 && num>0){
					contenido[i] = 1;
					num--;
					res++;
				}
			}
		}
		return res;
	}
	public int extrae(int num){
		int res = 0;
		if(num > 0){
			for(int=contenido.length-1 ; i>=0 ; i--){
				if(contenido[i] == 1 && num>0){
					contenido[i] = 0;
					num--;
					res++;
				}
			}
		}
		return res;
	}
	public void estado(){
		for (int i=0;i<contenido.length ;i++ ) {
			if(contenido[i]==1){
				System.out.print(|);
			}
			if(contenido==0){
				System.out.println(-);
			}
			System.out.println(" ");
		}
	}
}