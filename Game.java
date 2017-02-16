public class Game{

  Player player;
  Word word;


  public Game(Player player, Word word) {

    this.player = player;
    this.word = word;

  }

  public String getPlayerName(){
    return this.player.getName();
  }

  public int getPlayerLives(){
    return this.player.getLives();
  }



  public Word getWord(){
    return this.word;
  }



}