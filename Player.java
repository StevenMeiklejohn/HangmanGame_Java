

public class Player{

  private String name;
  private int lives;

  public Player(String name) {
    this.name = name;
    this.lives = 6;
  }

  public String getName(){
    return this.name;
  }


  public int getLives(){
    return this.lives;
  }

  public void removeLife(){
    this.lives -= 1;
  }



}