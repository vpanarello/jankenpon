package com.tyntec.jankenpon;

/**
 * @author vpanarello
 *
 */
public interface GameElement {
	
	
	
	/**
	 * Check if this element will win the passed element or get a draw.
	 * 
	 * @param GameElement
	 * @return Boolean: true: winner, false: loser, null pointer: draw
	 */
	MatchResult match(GameElement element);

}
