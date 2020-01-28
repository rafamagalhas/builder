public class Builder {

	public static void main(String[] args) {
		ConcessionaryDirector concessionary = new ConcessionaryDirector(new FiatBuilder());
		
		concessionary.carContruct();
		CarProduct car = concessionary.getCar();
		System.out.println("Carro: " + car.model);

	}

}
