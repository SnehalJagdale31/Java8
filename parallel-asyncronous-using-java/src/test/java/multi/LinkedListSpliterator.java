package multi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListSpliterator {
public static List<Integer> multiplyEachValue(LinkedList<Integer> inputList, int multiplyvalue , boolean isParallel){
		
		
		Stream<Integer> integerStream = inputList.stream();
		
		if(isParallel)
		    integerStream.parallel();
		
		List<Integer> resultList = integerStream.map(integer-> integer* multiplyvalue)
		.collect(Collectors.toList());
		
		return resultList;
		
	}
	

}
