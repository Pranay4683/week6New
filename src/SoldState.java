
public class SoldState implements State{
	LawnMower lawnMower;
	public SoldState(LawnMower lawnMower) {
		this.lawnMower = lawnMower;
	}
	@Override
	public void standState() {
		// TODO Auto-generated method stub
		System.out.println("Stand State");
	}

	@Override
	public void offState() {
		// TODO Auto-generated method stub
		System.out.println("Off State");
	}

	@Override
	public void highSpeedState() {
		// TODO Auto-generated method stub
		System.out.println("High speed State");
	}

	@Override
	public void lowSpeedState() {
		// TODO Auto-generated method stub
		System.out.println("Low speed State");
	}

	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		System.out.println("Sold State");
	}
	

}
