public class Main{

	public static void main(String []args){

		Paquete paquetito = new Paquete(5,4,3,2.5);
		Western westernito = new Western("Otto cabron",50);
		System.out.println("EL envio de western cuesta "+westernito.calculaImporte());
		System.out.println("EL envio de paquete cuesta "+paquetito.calculaImporte());
		System.out.println(paquetito.toString());
		System.out.println(westernito.toString());

	}
}
