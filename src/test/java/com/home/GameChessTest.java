package com.home;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for GameChess.class.
 */
public class GameChessTest {
    GameChess game;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing begins");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("Testing completed");
    }

    @Before
    public void initTest() {
        game = new GameChess();
    }

    @After
    public void afterTest() {
        game = null;
    }

    @Test
    public void testIsShah1() {
        //  Shah from the Queen
        assertEquals(true, game.isShah("   KR    QP BN  "));
    }

    @Test
    public void testIsShah2() {
        //  Shah from the Rook
        assertEquals(true, game.isShah("B K      P  N RQ"));
    }

    @Test
    public void testIsShah3() {
        //  Shah from the Bishop
        assertEquals(true, game.isShah("K     P   BQ  NR"));
    }

    @Test
    public void testIsShah4() {
        //  Shah from the Knight
        assertEquals(true, game.isShah("R   BN   P KQ   "));
    }

    @Test
    public void testIsShah5() {
        //  Shah from the Pawn
        assertEquals(true, game.isShah("RN  B P    KQ   "));
    }

    @Test
    public void testIsShah6() {
        //  Is not Shah
        assertEquals(false, game.isShah("RN  B     PKQ   "));
    }
}
