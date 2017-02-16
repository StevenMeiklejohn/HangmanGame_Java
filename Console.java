import java.util.Scanner;

public class Console {

  Scanner sc;
  String data;
  // Game game;

  public void start(){
    System.out.println("Please enter the word: ");
    sc = new Scanner(System.in);
    data = sc.nextLine();
    System.out.println(data);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Word hiddenWord = new Word(data);
    System.out.println(hiddenWord.hide());

    // Game game = new Game(hiddenWord);

  }

}