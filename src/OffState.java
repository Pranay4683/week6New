
public class OffState implements State{
	LawnMower lawnMower;
	public OffState(LawnMower lawnMower) {
		this.lawnMower = lawnMower;
	}
	@Override
	public void standState() {
		// TODO Auto-generated method stub
		System.out.println("Stand State not enabled");
	}

	@Override
	public void offState() {
		// TODO Auto-generated method stub
		System.out.println("You are in Off State");
	}

	@Override
	public void highSpeedState() {
		// TODO Auto-generated method stub
		System.out.println("High speed State not enabled");
	}

	@Override
	public void lowSpeedState() {
		// TODO Auto-generated method stub
		System.out.println("Low speed State not enabled");
	}

	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		System.out.println("Sold State not enabled");
	}

}
