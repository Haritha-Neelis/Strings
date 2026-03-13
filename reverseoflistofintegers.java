import java.util.*;

public class Main
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);

		Collections.reverse(list);

		System.out.println(list);
	}
}


public static void main(String[] args) {
		//With Streams
		int[] arr = {
				2,5,6,4,1,3
		};
		
		int outputArr[] = IntStream.range(0, arr.length).map(i -> arr[arr.length-i-1]).toArray();
		System.err.println(Arrays.toString(outputArr));
		
			//Without streams
		System.err.println(Arrays.toString(reverse(arr)));;
	}

	private static int[] reverse(int[] arr) {
		int left =0;
		int right = arr.length -1;
		while(left < right) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
		return arr;
		
	}
}



//with loop
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(23,45,55,32);
		List<Integer> reverseArr = new ArrayList<>();

		for(int i = arr.size()-1; i>=0; i--) {
			reverseArr.add(arr.get(i));
		}
		System.out.println(reverseArr);
	}
}

