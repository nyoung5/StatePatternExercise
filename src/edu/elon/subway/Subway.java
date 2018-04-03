package edu.elon.subway;

public class Subway {
	public enum SubwayState {LOCKED, UNLOCKED};
	private SubwayState state;
	
	public Subway() {
		state = SubwayState.LOCKED;
	}
	public void insertCoin() {
		if(state==SubwayState.UNLOCKED) {
			System.out.println("thanks for the extra coin, sucker! >:)");
		}else {
			state = SubwayState.UNLOCKED;
			System.out.println("you insert a coin");
		}
		
	}
	public void pass() {
		if(state==SubwayState.LOCKED){
			System.out.println("Alarm sounded");
		}else {
			System.out.println("Thank you for passing through");	
		}
	}
	public SubwayState getState() {
		return state;
	}
}
