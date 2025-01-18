package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListSpliteratorExample {
	
	
	public static List<Integer> multiplyEachValue(ArrayList<Integer> inputList, int multiplyvalue , boolean isParallel){
		
		
		Stream<Integer> integerStream = inputList.stream();
		
		if(isParallel)
		    integerStream.parallel();
		
		List<Integer> resultList = integerStream.map(integer-> integer* multiplyvalue)
		.collect(Collectors.toList());
		
		return resultList;
		
	}
	
//	public static void main(String[] args) {
//		ArrayList<Integer> ar = new ArrayList<>();
////		ar.add(1);
////		ar.add(2);
////		ar.add(3);
////		ar.add(4);
//		IntStream.rangeClosed(1, 4)
//		.boxed()
//		.forEach(ar::add);
//		
//		int multiple = 2;
//	
//	System.out.println(multiplyEachValue(ar,multiple));
//		
//		
//	}

}
