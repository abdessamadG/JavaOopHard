public class Fish {
  private String name;
  private String color;
  private int id;
  private static int count = 0;
  private static String lastColor = "red";

  public Fish( String name ) {
    this.name = name;
    count++;
    id = count;

    if ( lastColor.equals("red")) {
      this.color = "blue";
      lastColor = "blue";
    } else {
      this.color = "red";
      lastColor = "red";
    }
  }

  public String toString() {
    return name + ", fish #" + id + " of " + count + ", color: " + color;
  }

  public static int numCreated() {
    return count;
  }
}
