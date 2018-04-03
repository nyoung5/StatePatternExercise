package edu.elon.subway;

public class Subway2 {
	private State state;
	public State locked;
	public State unlocked;
	
	public Subway2() {
		locked = new Locked(this);
		unlocked = new Unlocked(this);
		state = locked;
	}
	public void insertCoin() {
		state.insertCoin();
	}
	public void pass() {
		state.pass();
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state; 
	}
	public State getLockedState() {
		return locked;
	}
	public State getUnlockedState() {
		return unlocked;
	}
}
