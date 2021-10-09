
public class LawnMower {
	State standState;
	State offState;
	State highSpeedState;
	State lowSpeedState;
	State soldState;
	State winnerState;
	
	State state = standState;
	
	public LawnMower(){
		standState = new StandState(this);
		offState = new OffState(this);
		highSpeedState = new HighSpeedState(this);
		lowSpeedState = new LowSpeedState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
	}
	
	public void standState() {
		state.standState();
	}
	public void offState() {
		state.offState();
	}
	public void highSpeedState() {
		state.highSpeedState();
	}
	public void lowSpeedState() {
		state.lowSpeedState();
	}
	public void soldState() {
		state.soldState();
	}
	void setState() {
		this.state = state;
	}
	public State getState() {
		return state;
	}

	public State getStandState() {
		return standState;
	}

	public State getOffState() {
		return offState;
	}

	public State getHighSpeedState() {
		return highSpeedState;
	}

	public State getLowSpeedState() {
		return lowSpeedState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
}
