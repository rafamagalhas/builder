public class FiatBuilder extends CarBuilder {

	@Override
	public void buildPrice() {
		car.price = 25000.00;
	}

	@Override
	public void buildMotorDescription() {
		car.motorDescription = "Fire Flex 1.0";
	}

	@Override
	public void buildFactoryYear() {
		car.factoryYear = 2011;
	}

	@Override
	public void buildModel() {
		car.model = "Palio";
	}

	@Override
	public void buildMount() {
		car.mount = "Fiat";
	}
	
}
