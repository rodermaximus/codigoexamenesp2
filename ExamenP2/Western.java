public class Western extends Envio{
	private String mensaje;
	private double cantidad;

	public Western(String mens,double cant){
		super(Envio.destinatario,Envio.remitente);
		if(cant<50){
			cant = 50;
		}
		cantidad = 50;
		mensaje = mens;
	}

	public double calculaImporte(){
		return cantidad*0.03;
	}

	public void toString(){
		System.out.println("MENS: " + mensaje + "\n");
		System.out.println("CANT " + cantidad + "\n");
	}

}