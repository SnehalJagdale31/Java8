package multi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ArrayListSpliteratorExampleTest {
	ArrayListSpliteratorExample arrayListSpliteratorExample = new ArrayListSpliteratorExample();

	@RepeatedTest(5)
	void ArrayListSpliteratorExample() {
		int size = 1000000;
		ArrayList<Integer> inputList = DataSet.generateArrayList(size);
		
		List<Integer> resultList =arrayListSpliteratorExample.multiplyEachValue(inputList, 2 ,true);
		
		assertEquals(size, resultList);
		
	}

}
