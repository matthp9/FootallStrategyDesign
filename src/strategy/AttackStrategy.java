package strategy;

public class AttackStrategy implements ITeamStrategy {

	@Override
	public void play(String team) {
		System.out.println(team + " is attacking.");
	}

}
