package com.tyntec.jankenpon.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.tyntec.jankenpon.elements.GameElementBuilder;
import com.tyntec.jankenpon.managers.GameSummary;
import com.tyntec.jankenpon.managers.TyntecRulesGameSummary;
import com.tyntec.jankenpon.players.GamePlayer;

@TestInstance(Lifecycle.PER_CLASS)
public class TyntecGameSummaryTest {

	GamePlayer playerA;
	GamePlayer playerB;

	@BeforeAll
	void executeSomeMatches() {

		playerA = new GamePlayer("Test Player A");
		playerB = new GamePlayer("Test Player B");

		playerA.setChoose(GameElementBuilder.getInstance().paper().build());
		playerB.setChoose(GameElementBuilder.getInstance().rock().build());
		playerA.match(playerB);

		playerA.setChoose(GameElementBuilder.getInstance().paper().build());
		playerB.setChoose(GameElementBuilder.getInstance().scissors().build());
		playerA.match(playerB);

		playerA.setChoose(GameElementBuilder.getInstance().rock().build());
		playerB.setChoose(GameElementBuilder.getInstance().rock().build());
		playerA.match(playerB);

	}

	@Test
	void summaryContentTest() {

		GameSummary summary = new TyntecRulesGameSummary(playerA, playerB);

		final String message = "Summary text seems not as expected";

		assertTrue(summary.toString().contains("Test Player A: wins 1 of 3 games"), message);
		assertTrue(summary.toString().contains("Test Player B: wins 1 of 3 games"), message);
		assertTrue(summary.toString().contains("Tie: 1 of 3 games"), message);

	}

}
