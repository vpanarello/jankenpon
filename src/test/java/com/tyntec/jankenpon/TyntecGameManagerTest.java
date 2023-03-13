package com.tyntec.jankenpon;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.tyntec.jankenpon.managers.GameManager;
import com.tyntec.jankenpon.managers.GameSummary;
import com.tyntec.jankenpon.managers.TyntecRulesGameManager;
import com.tyntec.jankenpon.players.GamePlayer;

public class TyntecGameManagerTest {

	@Test
	void testGameManagerTextOutput() {

		GameManager manager = new TyntecRulesGameManager(new GamePlayer("Test Player A"),
				new GamePlayer("Test Player B"));

		GameSummary summary = manager.run();

		assertTrue(summary.toString().contains("Test Player A: wins"));
		assertTrue(summary.toString().contains("Test Player B: wins"));
		assertTrue(summary.toString().contains("of 100 games"));

	}

}
