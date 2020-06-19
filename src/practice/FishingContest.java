package practice;

import java.util.HashMap;

public class FishingContest {
	HashMap<String, double[]> catches;
public FishingContest(HashMap<String, double[]> allCatches) {
	this.catches = allCatches;
}

public String findWinner() {
	String biggestCatch = "";
	for(int k = 0; k<catches.size()-1;k++) {
	for(String i : catches.keySet()){
		if(catches.get(i)[k]>catches.get(i)[k+1]) {
			biggestCatch = i;
		}
	}
	}
	
	System.out.println(biggestCatch);
	return biggestCatch;
	}

public double findBiggestFish(String string) {
	// TODO Auto-generated method stub
	
	return 0;
}


}
