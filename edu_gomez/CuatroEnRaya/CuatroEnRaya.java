//comentario innecesario

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
        tablero = new Ficha[fil][col];
    }
    public void iniciaTablero(){
        for (int i=0;i<tablero.length;i++ ){
            for(int j=0 ; j<tablero[i].length;j++){  
                tablero[i][j] = null;
        }
    }

    public void ponFicha(Ficha f, int col){
        boolean res = false;
        int cont = 0;
        if(f != null && f.getColor != null && col >= tablero.length && col <= tablero[]){
            for(int i=0;i<tablero.length[0];i++){
                for (int j=0;i<tablero.length[i] ; ) {
                    if(tablero[i] != null && i=col){

                    }
                }
                
            }

        }
    }

