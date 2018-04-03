package edu.elon.subway;

public class Locked implements State{
	private Subway2 subway;
	
	public Locked(Subway2 subway) {
		this.subway = subway;
	}
	@Override
	public void insertCoin() {
		subway.setState(subway.getUnlockedState());
		System.out.println("you insert a coin");
	}

	@Override
	public void pass() {
		System.out.println("Alarm sounded");
	}

}
