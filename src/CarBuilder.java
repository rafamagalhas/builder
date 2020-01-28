public abstract class CarBuilder {
	protected CarProduct car;
	
	public CarBuilder() {
		car = new CarProduct();
	}
	
	public abstract void buildPrice();
	public abstract void buildMotorDescription();
	public abstract void buildFactoryYear();
	public abstract void buildModel();
	public abstract void buildMount();
	
	public CarProduct getCar() {
		return car;
	}
}
