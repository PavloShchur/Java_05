package printing;

public class Machine implements MachineInterface {

	protected boolean isOn;

	public Machine(boolean isOn) {
		super();
		this.isOn = isOn;
	}

	public void turnOn() {
		isOn = true;
		System.out.println("Machine is on!");
	}

	public void turnOff() {
		isOn = false;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

}
