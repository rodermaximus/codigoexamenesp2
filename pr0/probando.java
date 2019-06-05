//Ok Ok Ok Ok Ok -- Ok -- Ok -- -- Ok Ok -- Ok -- Ok Ok -- --
// 1  2  3  4  5  6  7  8  8 10 11 12 13 14 15 16 17 18 19 20

public class probando{

	public static void main(String[] args){

		int opcion=10;
		switch(opcion){
			case 6:
				auxs.impArray(Metodos.Collatz(1));
				auxs.impArray(Metodos.Collatz(2));
				auxs.impArray(Metodos.Collatz(3));
				auxs.impArray(Metodos.Collatz(4));
				auxs.impArray(Metodos.Collatz(5));
				auxs.impArray(Metodos.Collatz(11));
				auxs.impArray(Metodos.Collatz(31));
				auxs.impArray(Metodos.Collatz(73));
				break;
			case 8://no esta caballo(cord1,cord2)
				Metodos.caballo(4,4);
				Metodos.caballo(3,4);
				Metodos.caballo(4,3);
				break;

			case 10:
				auxs.impMatrixCad(Metodos.histograma("t a v a a t t w w g t g", 2));
				System.out.println();
				auxs.impMatrixCad(Metodos.histograma("t a v a a w g t g",2 ));
				System.out.println();
				auxs.impMatrixCad(Metodos.histograma("t a v a a t t w w g t g", 0));
				System.out.println();
				auxs.impMatrixCad(Metodos.histograma("t a v a a t t w w g t g", 8));
				System.out.println();
				break;

			case 11://HAY FALLO
				int v1[]={1,4,7};
				int v2[]={5,3,1};
				auxs.impArray(Metodos.comunes(v1,v2));
				int v3[]={2,4,7};
				int v4[]={5,3,1};
				auxs.impArray(Metodos.comunes(v3,v4));
				int v5[]={1,4,7,6,9};
				int v6[]={5,9,1,3};
				auxs.impArray(Metodos.comunes(v5,v6));
				int v7[]={1,4,7,6,9};
				int v8[]=null;
				auxs.impArray(Metodos.comunes(v7,v8));
				break;
			case 14:
				Metodos.caballo(1,1);System.out.println();
				Metodos.caballo(8,8);System.out.println();
				Metodos.caballo(1,8);System.out.println();
				Metodos.caballo(8,1);System.out.println();
				Metodos.caballo(1,2);System.out.println();

				break;

			case 16://no entiendo?
				// auxs.impMatrixCad(Metodos.histograma("t a v a a t t w w g t g",null));
				break;
			case 19://HAY FALLO
				Metodos.caballo(-7,1);System.out.println();
				Metodos.caballo(1,54);System.out.println();
				break;
			case 20://HAY FALLO

				break;
		}


	}




}