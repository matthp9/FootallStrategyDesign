package model;

import strategy.AttackStrategy;
import strategy.DefendStrategy;
import strategy.ITeamStrategy;

public class FootballTest {

	public static void main(String[] args) {
		Team teamGermany = new TeamGermany();
		Team teamArgentina = new TeamArgentina();
		
		ITeamStrategy attack = new AttackStrategy();
		ITeamStrategy defend = new DefendStrategy();
		
		teamGermany.setMyTeamStrategy(attack);
		teamArgentina.setMyTeamStrategy(defend);
		
		teamGermany.setMyTeamName("GER");
		teamArgentina.setMyTeamName("ARG");
		
		teamGermany.description();
		teamGermany.playGame();
		
		teamArgentina.description();
		teamArgentina.playGame();
		
		teamGermany.setMyTeamStrategy(defend);
		teamArgentina.setMyTeamStrategy(attack);
		
		teamGermany.description();
		teamGermany.playGame();
		
		teamArgentina.description();
		teamArgentina.playGame();
	}
}
