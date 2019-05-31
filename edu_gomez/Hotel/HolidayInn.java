public class HolidayInn{

	//Falta lo de hacer que el 0 sea 1 y esa movida
	public static void main(String[] args){
		Hotel hotel = new Hotel(5,5);
		System.out.println("Reforma:"+hotel.reforma(5));
		System.out.println("Reforma:"+hotel.reforma(3));
		System.out.println("Reforma:"+hotel.reforma(0));

		int longitud = hotel.getHabitaciones() + hotel.getReformas();
		for(int i=0 ; i<longitud ; i++){
			System.out.println("Se aloja en Habitacion "+i+":"+hotel.aloja(i));
		}
		System.out.println("getReformas "+hotel.getReformas());
		System.out.println("getHabitaciones "+hotel.getHabitaciones());
	}
}		