public class VasoComunicante{
	private Contenedor[] vaso;

	public VasoComunicante(int n1, int n2){
		max = 2;
		if(n1 > 2){
			max = n1;
		}
		vaso = Contenedor[max];
		for(int i=0 ;i<vaso.length; i++){
			vaso[i].Contenedor(n2);
		}
	}

	public int agrega(int num){
		int res = 0;
		for(int i=0 ;i<vaso.length; i++){
			res = res + vaso[i].agrega(num);
		}
		return res;
	}

	public int extrae(int num){
		int res = 0;
		for(int i=0 ;i<vaso.length; i++){
			res = res + vaso[i].extrae(num);
		}
		return res;
	}
	public void estado(){
		for(int i=0 ;i<vaso.length; i++){
			vaso[i].estado();
			System.out.println();
		}
	}
}