package com.tyntec.jankenpon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.tyntec.jankenpon.players.GamePlayer;

@TestInstance(value = Lifecycle.PER_CLASS)
public class GamePlayerTest {

	GamePlayer player;

	final int WINS = 78;
	final int LOSES = 12;
	final int DRAWS = 37;

	@BeforeAll
	void initiatePlayer() {
		player = new GamePlayer("Test Player");

		for (int i = 0; i < WINS; i++) {
			player.win();
		}

		for (int i = 0; i < LOSES; i++) {
			player.lose();
		}

		for (int i = 0; i < DRAWS; i++) {
			player.draw();
		}
	}

	@Test
	void checkStatistics() {

		assertEquals(player.getRounds(), WINS + LOSES + DRAWS);
		assertEquals(player.getWins(), WINS);
		assertEquals(player.getDraws(), DRAWS);
		assertEquals(player.getLoses(), LOSES);

	}

	@Test
	void checkPlayerName() {
		assertEquals(player.getName(), "Test Player");
	}

	@AfterAll
	void checkClearStatus() {

		player.clearStats();

		assertEquals(player.getRounds(), 0);
		assertEquals(player.getWins(), 0);
		assertEquals(player.getDraws(), 0);
		assertEquals(player.getLoses(), 0);

	}

}
