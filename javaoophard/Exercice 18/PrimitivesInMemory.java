public class PrimitivesInMemory {
  public static void main( String [] args ) {

    int age = 26;
    double btc = 0.11307678;
    boolean veracity = true;

    short month = 11;
    byte day = 31;
    long debt = 18153890112907L;
    float mass = 78.971F;

    short num = 30451;
    byte ag = 100;
    long km = 5021321232123202L;

    System.out.println( btc );
    System.out.println( debt );
    System.out.println();
    // long and short values didn't work it says lossy conversion from int to short or byte
    String name = "Gosling";
  }
}
