public class ConcessionaryDirector {
	protected CarBuilder mount;
	
	public ConcessionaryDirector(CarBuilder mount) {
		this.mount = mount;
	}
	
	public void carContruct() {
		mount.buildPrice();
		mount.buildFactoryYear();
		mount.buildMotorDescription();
		mount.buildModel();
		mount.buildMount();
	}
	
	public CarProduct getCar() {
		return mount.getCar();
	}
}
