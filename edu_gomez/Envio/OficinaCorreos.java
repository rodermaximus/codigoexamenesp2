public class OficinaCorreos{
	private Envio[][] casillero;

	public OficinaCorreos(int fil, int col){
		int filas = 2;
		int columnas = 2;
		if( fil > 2){
			filas = fil;
		}
		if( col > 2){
			columnas = 2;
		}
		casillero = new Envio[filas][columnas];
	}

	public boolean almacena(Envio env){
		boolean res = false;
		for(int i=0 ; i<casillero.length ; i++){
			for(int j=0 ; j<casillero[i].length ; j++){
				if(casillero[i][j] == null){
					casillero[i][j] = env;
					res = true;
					break;
				}
			}
		}
		return res;
	}
	public double facturado(){
		double res = 0;
		for(int i=0 ; i<casillero.length ; i++){
			for(int j=0 ; j<casillero[i].length ; j++){
				if(casillero[i][j] != null){
					res = res + casillero[i][j].calculaImporte();
				}
			}
		}
		return res;
	}
	public int westerns(){
		int res = 0;
		for(int i=0 ; i<casillero.length ; i++){
			for(int j=0 ; j<casillero[i].length ; j++){
				if(casillero[i][j] != null && casillero[i][j] instanceof Western){
					res++;
				}
			}
		}
		return res;
	}
	public int paquetes(){
		int res = 0;
		for(int i=0 ; i<casillero.length ; i++){
			for(int j=0 ; j<casillero[i].length ; j++){
				if(casillero[i][j] != null && casillero[i][j] instanceof Paquete){
					res++;
				}
			}
		}
		return res;
	}
}