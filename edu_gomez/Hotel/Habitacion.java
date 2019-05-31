public class Habitacion{
	private int ocupantes;
	private int camas;
	private boolean aseo;

	public Habitacion(int num, boolean b){
		ocupantes = 0;
		camas = 1;
		aseo = false;
		if(num > 1)
			camas = num;
		if(b)
			aseo = true;
	}
	// public int getOcupantes(){ return ocupantes;}
	// public int getCamas(){return camas;}
	// public boolean getAseo(){return aseo;}
	public boolean entra(){
		boolean res = false;
		if(ocupantes < camas){
			res = true;
		}
		return res;
	}
	public boolean sale(){
		boolean res = false;
		if(ocupantes > 0){
			res = true;
		}
		return res;	
	}
}