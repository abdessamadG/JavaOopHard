public class TVActorDriver {
	public static void main( String [] args ) {
		TVActor a = new TVActor();
		a.name = "Thomas Middleditch";
		a.role = "Richard Hendricks";
		a.age = 42;

		TVActor b = new TVActor();
		b.name = "Martin Starr";
		b.role = "Bertram Gilfoyle";
		b.age = 42;

		TVActor c = new TVActor();
		c.name = "Kumail Nanjiani";
		c.role = "Dinesh Chugtai";
		c.age = 46;

		System.out.println( a.name + " played " + a.role + " " + a.age + "years old" );
		System.out.println( b.name + " played " + b.role  + " " + b.age + "years old" );
		System.out.println( c.name + " played " + c.role + " " + c.age + "years ols" );
	}
}
