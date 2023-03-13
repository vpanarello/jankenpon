package com.tyntec.jankenpon.elements;

import java.util.Random;

public class GameElementBuilder {

	private GameElement gameElement = null;

	public static GameElementBuilder getInstance() {
		return new GameElementBuilder();
	}

	public GameElementBuilder paper() {
		gameElement = new Paper();
		return this;
	}

	public GameElementBuilder rock() {
		gameElement = new Rock();
		return this;
	}

	public GameElementBuilder scissors() {
		gameElement = new Scissors();
		return this;
	}

	public GameElementBuilder random() {

		GameElement[] elements = { new Paper(), new Rock(), new Scissors() };

		gameElement = elements[(new Random()).nextInt(elements.length)];

		return this;
	}

	public GameElement build() {
		if (gameElement == null) {
			throw new RuntimeException("No game element type selected");
		}

		return gameElement;
	}

}
