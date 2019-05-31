public class Hotel{
	private Habitacion[] estancias;

	public Hotel(int n1, int n2){
		estancias = new Habitacion[3];
		if(n1 > 3){
			estancias = new Habitacion[n1];
		}
		if(n2 > 1){
			for(int i=0 ; i<estancias.length ; i++){
				estancias[i] = new Habitacion(n2,false);
			}
		}
	}
	public boolean aloja(int num){
		boolean res = false;
		if(num >= 0 && num < estancias.length && estancias[num] != null){
			if(estancias[num].entra()){
				res = true;
			}
		}
		return res;
	}
	public boolean desaloja(int num){
		boolean res = false;
		if(num >= 0 && num < estancias.length && estancias[num] != null){
			if(estancias[num].sale()){
				res = true;
			}
		}
		return res;
	}
	public boolean reforma(int num){
		boolean res = false;
		if(num >= 0 && num < estancias.length && estancias[num] != null){
			if(estancias[num] != null && !(estancias[num] instanceof Suite)){
				estancias[num] = new Suite();
				res = true;
			}
		}
		return res;
	}
	public int getReformas(){
		int cont = 0;
		for(int i=0 ; i<estancias.length ; i++){
			if(estancias[i] instanceof Suite){
				cont++;
			}
		}
		return cont;
	}
	public int getHabitaciones(){
		int cont = 0;
		for(int i=0 ; i<estancias.length ; i++){
			if(!(estancias[i] instanceof Suite)){
				cont++;
			}
		}
		return cont;
	}
}