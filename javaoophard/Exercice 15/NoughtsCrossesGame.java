import java.util.Scanner;

public class NoughtsCrossesGame {
  public static void main( String [] args ) {
    Scanner keyboard = new Scanner(System.in);

    String p = "X";
    NoughtsCrossesObject ttt = new NoughtsCrossesObject();
    int r, c;

    while ( ! (ttt.isWinner("X")  || ttt.isWinner("O") || ttt.isFull() ) ) {
      System.out.println(ttt);
      System.out.print( "'" + p + "', choose your location (row column): " );
      r = keyboard.nextInt();
      c = keyboard.nextInt();

      while ( ! ttt.isValid(r,c) || ttt.isTaken(r,c) ) {
        if ( ttt.isValid(r,c) == false )
          System.out.println( "Not a valid location Try again." );
        else if ( ttt.isTaken(r,c) )
          System.out.println( "Location already full. Try again." );

        System.out.print( "Choose your location (row column): " );
        r = keyboard.nextInt();
        c = keyboard.nextInt();
      }
      ttt.playMove( p, r, c );

      if ( p.equals("X") )
        p = "O";
      else
        p = "X";
    }

    System.out.println(ttt);

    if ( ttt.isWinner("X") )
      System.out.println( "X is the winner!" );
    else if ( ttt.isWinner("O") )
      System.out.println( "O is the winner!" );
    else if ( ttt.isCat() )
      System.out.println( "The game is a tie." );
  }
}
