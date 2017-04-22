package strategy;

public class DefendStrategy implements ITeamStrategy {

	@Override
	public void play(String team) {
		System.out.println(team + " is defending");
	}

}
