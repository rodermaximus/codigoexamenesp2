public class Esclusa{
	public static void main(String[] args){
		VasoComunicante vc = new VasoComunicante(3,4);
		System.out.println("vc agrega 7:"vc.agrega(7));
		System.out.println("vc extrae 7:"vc.extrae(4));
		vc.estado();
	}
 }