package com.tyntec.jankenpon;

import com.tyntec.jankenpon.managers.GameManager;
import com.tyntec.jankenpon.managers.GameSummary;
import com.tyntec.jankenpon.managers.TyntecRulesGameManager;
import com.tyntec.jankenpon.players.GamePlayer;

public class Game {

	public static void main(String[] args) throws InterruptedException {

		System.out.printf("Playing...");
	
		GameManager manager = new TyntecRulesGameManager(
				new GamePlayer("Player A"),
				new GamePlayer("Player B")
				);

		GameSummary summary = manager.run();
		
		System.out.printf("%n%n");
		System.out.println(summary);

	}

}
