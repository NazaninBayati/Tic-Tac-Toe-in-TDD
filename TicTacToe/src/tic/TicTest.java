package tic;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {
	Tic obj = new Tic();
	@Test
	public void test_emptyBoard() {
		//test empty board

		/*
		 _
		 */
		String[][] result = {{"_"}};
		assertEquals(result, obj.emptyboard(1,1));


		/*
		 _ _ 
		 _ _ 

		 */
		String[][] result2p2 = {{"_","_"},{"_","_"}};
		assertEquals(result2p2, obj.emptyboard(2,2));


		/*
		 _ _ _
		 _ _ _
		 _ _ _		 		

		 */
		String[][] result3p3 = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertEquals(result3p3, obj.emptyboard(3,3));


	}
	@Test
	public void test_sizeofBoard() {
		assertEquals(4, obj.boardSize(2,2));
		assertEquals(6, obj.boardSize(3,2));
		assertEquals(25, obj.boardSize(5,5));
		assertEquals(16, obj.boardSize(4,4));
		assertEquals(9, obj.boardSize(3,3));
	}

	@Test
	public void test_defaultBoard() {
		String[][] map = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		assertEquals(map, obj.default_Board());
	}

	@Test
	public void test_board_positions() 
	{
		/*

		 X X X
		 _ O _
		 O _ O


		 player 1 - X - trure
		 player 2- O - false

		 */
		assertEquals("X", obj.positions(true,0,1));
		assertEquals("O", obj.positions(false,2,0));
		assertEquals("X", obj.positions(true,0,0));
		assertEquals("O", obj.positions(false,1,1));
		assertEquals("X", obj.positions(true,0,2));
		assertEquals("O", obj.positions(false,2,2));
		assertEquals("N", obj.positions(true,2,2));	


		//assertEquals(true,obj.winner());

	}

	@Test
	public void test_winner() 
	{
		assertEquals(false,obj.winner());
	}

























}
