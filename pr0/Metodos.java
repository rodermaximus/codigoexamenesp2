//DNI 72838014 GOMEZ SALDIAS, EDUARDO DAVID

import java.util.Arrays;
import java.util.Comparator;

public class Metodos{
	
	public static int[] nomultiplos(int num, int n1, int n2){
		
		int[] res=null;
		res = new int[num];
		int[] sol=null;
		int cont=0;
		if(n1>0 && n2>0){
			for(int i=0 ; i<num ; i++){
				if((i%n1 != 0 && i%n2 != 0)&& num!=0){
					res[i]=i;
					cont++;
				}
			}
			sol = new int[cont];
			cont=0;
			for(int i=0 ; i<res.length ; i++){
				if(res[i] != 0){
					sol[cont]=res[i];
					cont++;
				}
			}
		}
		return sol;
	}
	public static String[] sufijos(String cad){

		String[] suf=null;

		suf = new String[cad.length()];
		
		for(int i=0 ; i<cad.length() ; i++){
			suf[i]=cad.substring((cad.length())-(i+1),cad.length());
		}
		return suf;
	}
	
	public static String[] prefijos(String cad){
		
		String[] pre=null;

		pre = new String[cad.length()];
		
		for(int i=0 ; i<cad.length() ; i++){
			pre[i]=cad.substring(0,i+1);
		}
		return pre;
	}
	
	public static String IMC(double altura, double peso, int edad){
		
		double imc;
		String sol=null;
		if(peso<=0 || altura<=0 || edad<=0){
			sol = "error en entrada";
		}
		else{
			imc = peso/(altura*altura);
			if(imc < 22 && edad < 45)
				sol = "bajo";
			else if(imc < 22 && edad >= 45)
				sol= "medio";
			else if(imc >= 22 && edad < 45)
				sol = "medio";
			else if(imc >= 22 && edad >= 45)
				sol = "alto";
		}
			return sol;
	}
	
	public static int[] comunes(int[] v1, int[] v2){
		int[] sol=null;
		if(v1 != null && v2 != null){
			Arrays.sort(v1);
			Arrays.sort(v2);
			int cont=0;		
			for(int i=0 ; i<v1.length ; i++){
				for(int j=0 ; j<v2.length; j++){
					if(v1[i]==v2[j]){
						cont++;
					}
				}			
			}

			sol = new int[cont];
			cont=0;
			for(int i=0 ; i<v1.length ; i++){
				for(int j=0 ; j<v2.length; j++){
					if(v1[i]==v2[j]){
						
						sol[cont]=v2[j];
						cont++;
					}
				}			
			}
		}
		return sol;
	}	
	
	public static void secCollatz(int num){
            
        int cont=0;
        int aux=0;
        for(int i=1 ; i<=num ; i++){
            cont=0;
            aux=i;
            if(aux==1)
                cont=1;
            
            else{
                do{
                    if(aux%2 == 0)
                            aux=aux/2;
                    else
                            aux=aux*3+1;
                    cont++;
                }while(aux>1);
                cont++;
            }
            System.out.println(i+" "+cont);
        }
	}
	
	public static int[] Collatz(int i){
		int[] a=null;
		int aux=i;
		if(i>0){
			int k=1;
			do{
				if(i%2 == 0)
					i=i/2;
				else
					i=i*3+1;
				k++;
			}while(i>1);
			a = new int[k];
			i=aux;
			a[0]=i;
			k=1;
			do{
				if(i%2 == 0){
					a[k]=i/2;
					i=i/2;
				}
				else{
					a[k]=i*3+1;
					i=i*3+1;
				}
				k++;
			}while(i>1);
		}
		return a;
	}
		
	public static void caballo(int cor1, int cor2){
		
		int cont=0;
		if(cor1 > 8 || cor2 > 8){
			System.out.println("posicion incorrecta");
		}
		else{
			
			if(cor1+2 <= 8 && cor2+1 <= 8){
				cont++;
			}
			if(cor1-2 >= 1 && cor2+1 <= 8){
				cont++;
			}
			if(cor1+2 <= 8 && cor2-1 >= 1){
				cont++;
			}
			if(cor1-2 >= 1 && cor2+1 >= 1){
				cont++;
			}
			if(cor1+1 <= 8 && cor2+2 <= 8){
				cont++;
			}
			if(cor1-1 >= 1 && cor2+2 <= 8){
				cont++;
			}
			if(cor1+1 <= 8 && cor2-2 >= 1){
				cont++;
			}
			if(cor1-1 >= 1 && cor2+2 >= 1){
				cont++;
			}

			int[] matx=null;
			matx = new int[cont];
			cont=0;
			if(cor1+2 <= 8 && cor2+1 <= 8){

				matx[cont]=(cor1+2)*10 + cor2+1;
				cont++;
			}
			if(cor1-2 >= 1 && cor2+1 <= 8){

				matx[cont]=(cor1-2)*10 + cor2+1;
				cont++;
			}
			if(cor1+2 <= 8 && cor2-1 >= 1){

				matx[cont]=(cor1+2)*10 + cor2-1;
				cont++;
			}
			if(cor1-2 >= 1 && cor2+1 >= 1){

				matx[cont]=(cor1-2)*10 + cor2-1;
				cont++;
			}
			if(cor1+1 <= 8 && cor2+2 <= 8){

				matx[cont]=(cor1+1)*10 + cor2+2;
				cont++;
			}
			if(cor1-1 >= 1 && cor2+2 <= 8){

				matx[cont]=(cor1-1)*10 + cor2+2;
				cont++;
			}
			if(cor1+1 <= 8 && cor2-2 >= 1){

				matx[cont]=(cor1+1)*10 + cor2-2;
				cont++;
			}
			if(cor1-1 >= 1 && cor2+2 >= 1){

				matx[cont]=(cor1-1)*10 + cor2-2;
				cont++;
			}
			Arrays.sort(matx);
			for(int i=0 ; i<matx.length ; i++)
				System.out.println(matx[i]/10+" "+matx[i]%10);
		}
	}
	
	public static int[] multrusa(int andor, int ando){
				
		int res[]=null;
		int cont=0;
		int[] ares=null;
		int aux=andor;
		do{
			if(andor%2 != 0){
				cont++;
				andor = andor/2;
			}
			else{
				andor = andor/2;
			}
		}while(andor>=1);

		andor=aux;
		ares = new int[cont];
		cont=0;
		if(ando<=0 || andor<=0){
			return res;
		}
		else{
			do{
				if(andor%2 != 0){
					ares[cont]=ando;
					cont++;
					andor = andor/2;
				}
				else
					andor=andor/2;
				ando = ando*2;
				
			}while(andor>=1);
			
		}
		return ares;
	}
	
	public static String[][] histograma(String cad, int kk){

		String a[] = cad.split(" ");
		int cont[]=null;
		cont = new int[a.length];
		int cont2=0;
		Arrays.sort(a);
		Arrays.sort(a, Comparator.comparingInt(String::length));

		for(int j=0 ; j<a.length ; j++){
			cont2=0;
			for(int i=0 ; i<a.length ; i++){
				if(a[j].equals(a[i])==true){
					cont2++;
				}
			}
			for(int i=0 ; i<a.length ; i++){
				if(a[j].equals(a[i])==true){
						cont[i]=cont2;
				}
			}
		}
		int anums[]=cont;
		cont2 = 0;
		for (int i=0 ; i<a.length ; i = i + anums[i]){
			for (int j=i ; j<i+anums[i] ; j++){
				if(a[i].equals(a[j])==true ){
					cont2++;
				}
			}
		}
		int men1[];
		men1 = new int[cont2];

		for (int i=0 ; i<a.length ; i = i + anums[i]){
			for (int j=i ; j<i+anums[i] ; j++){
				if(a[i].equals(a[j])==true ){
					men1[i]=anums[i];
				}
			}
		}

		cont2=0;
		for(int i=0 ; i<men1.length ; i++){
			if(men1[i] != 0  )
				cont2++;
		}

		int mena[] = new int[cont2];
		String menb[] = new String[cont2];

		cont2=0;
		for(int i=0 ; i<men1.length ; i++){
			if(men1[i] != 0  ){
				mena[cont2]=men1[i];
				menb[cont2]=a[i];
				cont2++;
			}
		}
		cont2=0;
		String b[] = cad.split(" ");
		String c[] = new String[menb.length];
		int cc[] = new int[mena.length];
		int sew[] = new int[a.length];

		for(int j=0 ; j<b.length ; j++){
			cont2=0;
			for(int i=0 ; i<b.length ; i++){
				if(b[j].equals(b[i])==true){
					cont2++;
				}
			}
			for(int i=0 ; i<b.length ; i++){
				if(b[j].equals(b[i])==true){
						sew[i]=cont2;
				}
			}
		}

		cont2=0;
		for(int j=0 ; j<b.length ; j++){		
				if(Arrays.asList(menb).contains(b[j]) && Arrays.asList(c).contains(b[j])==false ){
					c[cont2]=b[j];
					cc[cont2]=sew[j];
					cont2++;
				}
		}		
		cont2=0;
		for(int i=0 ; i<cc.length ; i++){
			if(kk <= cc[i]){	
				cont2++;
			}
		}

		int numers[] = new int[cont2];
		String tortuga[] = new String[cont2];
		cont2=0;
		for(int i=0 ; i<cc.length ; i++){
			if(kk <= cc[i]){
				numers[cont2]=cc[i];
				tortuga[cont2]=c[i];
				cont2++;
			}
		}
		int mayor=0;
		for(int i=0 ; i<numers.length ; i++){

			if(numers[i] > mayor)
				mayor = numers[i];
		}
		cont2=0;
		String numEnCad[] = new String[numers.length];
		for(int i=0 ; i<numEnCad.length ; i++)
			numEnCad[i]=String.valueOf(numers[i]);

		String res[][]=null;
		if(kk<mayor){
			res = new String[numers.length][2];	
			cont2=0; 
			for(int i=0; i<numers.length ; i++){
					res[cont2][0]=tortuga[i];
					res[cont2][1]=numEnCad[i];
					cont2++;

			}	
		}
		return res;
	}
}
