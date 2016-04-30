package connect.four.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import connect.four.board.*;
import connect.four.player.*;

public class ComputerPlayerTest {

	@Test
	public void testGetName() {
		Player aPlayer = new ComputerPlayer(3);
		assertTrue(aPlayer.getName().equals("Computer"));	}

	@Test
	public void testPerformPlay() {
		Board aBoard = new Board(6,7);
		Player aPlayer = new ConsolePlayer("John");
		Player bPlayer = new ComputerPlayer();
		
		aBoard.play(1, aPlayer);
		bPlayer.performPlay(aBoard);
		
		assertTrue(aBoard.getMoveCount() == 2);
		
		aBoard.clear();
		bPlayer.performPlay(aBoard);
		assertTrue(aBoard.getMoveCount() == 1);	}

}
