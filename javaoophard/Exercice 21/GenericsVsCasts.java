import java.util.ArrayList;

public class GenericsVsCasts {

	@SuppressWarnings("unchecked")
	public static void main( String [] args ) {
		ArrayList objarr = new ArrayList();

		objarr.add("one");
		objarr.add("two");

		Object aa = objarr.get(0);
		Object bb = objarr.get(1);

		// String qq = objarr.get(0);
		// String rr = objarr.get(1);

		String ss = (String)objarr.get(0);
		String tt = (String)objarr.get(1);

		System.out.println( objarr );

		// ------------------------------------------
		ArrayList<String> strarr = new ArrayList<String>();
		strarr.add("one");
		strarr.add("two");

		String s = strarr.get(0);
		String t = strarr.get(1);

		System.out.println( strarr );

		Object a = strarr.get(0); // this also work because Strings are objects
		Object b = strarr.get(1);

		// -----------------------------------------
		Integer i = new Integer(123);
		objarr.add(i);

		System.out.println(objarr); // ["one", "two", "123"] !!!

		// String uu = (String)objarr.get(2); // runtime ClassCastException

		// strarr.add(i); // won't compile
		Object ii = objarr.get(2);

		System.out.println( i );

		if ( s == ss )
			System.out.println( "True" );
		else
			System.out.println( "False" );
		}
}
