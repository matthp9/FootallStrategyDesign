package model;

import strategy.ITeamStrategy;

public abstract class Team {
	private String myTeamName;
	private ITeamStrategy myTeamStrategy;

	public ITeamStrategy getMyTeamStrategy() {
		return myTeamStrategy;
	}

	public void setMyTeamStrategy(ITeamStrategy myTeamStrategy) {
		this.myTeamStrategy = myTeamStrategy;
	}

	public String getMyTeamName() {
		return myTeamName;
	}

	public void setMyTeamName(String myTeamName) {
		this.myTeamName = myTeamName;
	}
	
	public abstract void description();

	public void playGame() {
		myTeamStrategy.play(myTeamName);
	}
}
