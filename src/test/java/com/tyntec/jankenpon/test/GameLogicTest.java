package com.tyntec.jankenpon.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tyntec.jankenpon.GameElement;
import com.tyntec.jankenpon.GameElementBuilder;
import com.tyntec.jankenpon.MatchResult;

class GameLogicTest {

	private GameElement paper;
	private GameElement rock;
	private GameElement scissors;

	@BeforeEach
	void prepareElements() {

		paper = GameElementBuilder.getInstance().paper().build();

		rock = GameElementBuilder.getInstance().rock().build();

		scissors = GameElementBuilder.getInstance().scissors().build();
	}

	@Test
	void testPaper() {
		assertTrue(paper.match(rock).equals(MatchResult.WIN), "expected to win");
		assertTrue(paper.match(scissors).equals(MatchResult.LOSE), "expected to lose");
		assertTrue(paper.match(paper).equals(MatchResult.DRAW), "expected to draw");
	}

	@Test
	void testRock() {
		assertTrue(rock.match(scissors).equals(MatchResult.WIN), "expected to win");
		assertTrue(rock.match(paper).equals(MatchResult.LOSE), "expected to lose");
		assertTrue(rock.match(rock).equals(MatchResult.DRAW), "expected to draw");
	}

	@Test
	void testScissors() {
		assertTrue(scissors.match(paper).equals(MatchResult.WIN), "expected to win");
		assertTrue(scissors.match(rock).equals(MatchResult.LOSE), "expected to lose");
		assertTrue(scissors.match(scissors).equals(MatchResult.DRAW), "expected to draw");
	}

}
