package edu.elon.subway;

public class Unlocked implements State{

	private Subway2 subway;
	public Unlocked(Subway2 subway) {
		this.subway = subway;
	}
	@Override
	public void insertCoin() {
		System.out.println("thanks for the extra coin, sucker! >:)");
	}

	@Override
	public void pass() {
		System.out.println("Thank you for passing through");	
		subway.setState(subway.getLockedState());
		
	}

}
