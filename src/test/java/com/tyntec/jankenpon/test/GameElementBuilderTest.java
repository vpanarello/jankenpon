package com.tyntec.jankenpon.test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import com.tyntec.jankenpon.GameElement;
import com.tyntec.jankenpon.GameElementBuilder;
import com.tyntec.jankenpon.Paper;
import com.tyntec.jankenpon.Rock;
import com.tyntec.jankenpon.Scissors;

public class GameElementBuilderTest {

	@Test
	void paperBuildTest() {

		GameElement element = GameElementBuilder.getInstance().paper().build();

		assertInstanceOf(Paper.class, element, "the generated instance is not from class Paper");

	}

	@Test
	void rockBuildTest() {

		GameElement element = GameElementBuilder.getInstance().rock().build();

		assertInstanceOf(Rock.class, element, "the generated instance is not from class Rock");

	}

	@Test
	void scissorsBuildTest() {

		GameElement element = GameElementBuilder.getInstance().scissors().build();

		assertInstanceOf(Scissors.class, element, "the generated instance is not from class Scissors");

	}

	@Test
	void noSelectionBuildTest() {

		assertThrows(RuntimeException.class, () -> {
			GameElementBuilder.getInstance().build();
		});
	}

	@Test
	void randomSelectionBuildTest() {

		Map<String, Boolean> possibleElements = new HashMap<>();

		possibleElements.put(Paper.class.getSimpleName(), false);
		possibleElements.put(Rock.class.getSimpleName(), false);
		possibleElements.put(Scissors.class.getSimpleName(), false);

		boolean foundAll = false;

		for (int tries = 0; tries < 1000; tries++) {

			GameElement element = GameElementBuilder.getInstance().random().build();

			possibleElements.put(element.getClass().getSimpleName(), true);

			foundAll = true;

			for (Entry<String, Boolean> entry : possibleElements.entrySet()) {
				if (entry.getValue() == false) {
					foundAll = false;
					break;
				}
			}

			if (foundAll) {
				break;
			}
		}

		assertTrue(foundAll, "in 1000 tries the random builder did not generate all the possible Elements");

	}

}
