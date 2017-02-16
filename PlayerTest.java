import static org.junit.Assert.*;
import org.junit.*;


public class PlayerTest {

  Player player;

  @Before
  public void before(){
    player = new Player("Steve");
  }

  @Test
  public void hasName(){
    assertEquals("Steve", player.getName());
  }

  @Test
  public void hasLives(){
    assertEquals(6, player.getLives());
  }

  @Test
  public void canLoseLife(){
    player.removeLife();
    assertEquals(5,player.getLives());
  }

}