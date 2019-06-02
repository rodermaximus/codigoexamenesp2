public class CuatroEnRaya{

    private Ficha[][] tablero;

    public class CuatroEnRaya(int n1, int n2){
        int fil = 8;
        int col = 6;
       
        if(n1 > fil){
            fil = n1;
        } 
        if(n2 > col){
            col = n2;
        }
        tablero = new Ficha[fil][col];
    }
    public void iniciaTablero(){
        for (int i=0;i<tablero.length;i++ ){
            for(int j=0 ; j<tablero[i].length;j++){


            }        
        } 
    }

    public void ponFicha(){

    }


}
