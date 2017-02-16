import static org.junit.Assert.*;
import org.junit.*;


public class GameTest {

  Game game;
  Player player;
  Word word;

  @Before
  public void before(){
    player = new Player("Steve");
    word = new Word("Bollocks");
    game = new Game(player, word);
  }

  @Test
  public void playerHasName(){
    assertEquals("Steve", game.getPlayerName());
  }

  @Test
  public void playerHasLives(){
    assertEquals(6, game.getPlayerLives());
  }

  // @Test
  // public void canLoseLife(){
  //   player.removeLife();
  //   assertEquals(5,player.getLives());
  // }

}