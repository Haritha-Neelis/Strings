//using Stringbuilder

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}


// using for loop
public class Main
{
	public static void main(String[] args) {
		String str = "harjoakssn";
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--){
		    reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}


// using recursion
public class Main
{
	public static String reverse(String str) {
		if(str.isEmpty())
		return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(reverse("hahdi"));
	}
}



//Using streams
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
		  String str = "Haritha";

        String reversed = IntStream.range(0, str.length())
        .mapToObj(i -> str.charAt(str.length() -1 -i))
        .map(String::valueOf).collect(Collectors.joining());

        System.out.println(reversed);
	}
}
