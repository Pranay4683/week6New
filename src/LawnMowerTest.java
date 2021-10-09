
public class LawnMowerTest {
	public static void main(String[] args) {
		LawnMower lawnMower = new LawnMower();
		
		StandState standState = new StandState(lawnMower);
		System.out.println("Stand State");
		standState.standState();
		standState.offState();
		standState.highSpeedState();
		standState.lowSpeedState();
		standState.soldState();
		
		OffState offState = new OffState(lawnMower);
		System.out.println("Off State");
		offState.standState();
		offState.offState();
		offState.highSpeedState();
		offState.lowSpeedState();
		offState.soldState();
		
		HighSpeedState highSpeedState = new HighSpeedState(lawnMower);
		System.out.println("high speed State");
		highSpeedState.standState();
		highSpeedState.offState();
		highSpeedState.highSpeedState();
		highSpeedState.lowSpeedState();
		highSpeedState.soldState();
		
		LowSpeedState lowSpeedState = new LowSpeedState(lawnMower);
		System.out.println("low speed State");
		lowSpeedState.standState();
		lowSpeedState.offState();
		lowSpeedState.highSpeedState();
		lowSpeedState.lowSpeedState();
		lowSpeedState.soldState();
		
		SoldState soldState = new SoldState(lawnMower);
		System.out.println("Sold State");
		soldState.standState();
		soldState.offState();
		soldState.highSpeedState();
		soldState.lowSpeedState();
		soldState.soldState();
		
		WinnerState winnerState = new WinnerState(lawnMower);
		System.out.println("Winner State");
		System.out.println(winnerState);
	}
}
