package com.tyntec.jankenpon;

/**
 * @author vpanarello
 *
 */
public interface GameElement {
	
	
	
	/**
	 * Execute a match between elements. The result can be win, lose or draw.
	 * 
	 * @param GameElement
	 * @return MatchResult
	 */
	MatchResult match(GameElement element);

}
