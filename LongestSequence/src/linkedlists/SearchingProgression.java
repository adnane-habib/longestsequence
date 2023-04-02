package linkedlists;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SearchingProgression {

	public static void main(String[] args) {
		
		int M = 100; //Array size
		int N = 100; // Array range
		//Generating array of 100 random elements between 0 and 100
		//From Stackoverflow
		int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(M)).limit(N).toArray();

		System.out.println(Arrays.toString(randomIntsArray));
		
		int count = 0;
		int index = 0;
		
		//int[] consectiveList = new int[100];
		int reference = randomIntsArray[0];
		boolean flag = true;
		
		SinglyLinkedList storeList = new SinglyLinkedList();
		int tempIndex = index;
		storeList.append(reference);
		
		for (int i =1; i<M; i++) {
			
			System.out.println(randomIntsArray[i]);		
			if (randomIntsArray[i]<randomIntsArray[i-1]) {
				if (count < storeList.getCount()) {
				count = storeList.getCount();
				index = i;}
				storeList.clearAll();
				
				
				storeList.append(randomIntsArray[i]);
				
			} else {
				storeList.append(randomIntsArray[i]);
			}
			
			
		}
		
		
		//System.out.println(Arrays.toString(consectiveList));
		
		// TODO Auto-generated method stub
		
		storeList.append(10);
		storeList.display();		
		
		storeList.prepend(20);
		storeList.display();	

	}

}
