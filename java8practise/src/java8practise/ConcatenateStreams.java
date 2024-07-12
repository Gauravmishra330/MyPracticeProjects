package java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStreams {

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("java","8");
		List<String> list2=Arrays.asList("explained","through","programmes");
		
		Stream<String> concatStream=Stream.concat(list1.stream(),list2.stream());
		
		concatStream.forEach(str-> System.out.print(str +" "));
		
	}

}
