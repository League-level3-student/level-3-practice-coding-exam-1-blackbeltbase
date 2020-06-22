package practice;

import java.util.HashMap;

public class FishingContest {
	HashMap<String, double[]> catches;

	public FishingContest(HashMap<String, double[]> allCatches) {
		this.catches = allCatches;
	}

	public String findWinner() {
		String biggestCatcher = "|";
		double biggestFish =0;
			for (String i : catches.keySet()) {
				double[] fishCatches = catches.get(i);
				for (int k = 0; k < fishCatches.length; k++) {
				if (catches.get(i)[k] >= 3) {
					if (fishCatches[k] > biggestFish) {
						biggestCatcher = i;
						biggestFish = fishCatches[k];
					}
					System.out.println(fishCatches[k]);
				}
			}
			System.out.println(biggestCatcher);
		}
		return biggestCatcher;
	}

	public double findBiggestFish(String fishername) {
		// TODO Auto-generated method stub
		double biggestFish = 0;
		double[] fishCatches = catches.get(fishername);
		for (int j = 0; j < fishCatches.length; j++) {
			if (fishCatches[j] >= biggestFish) {
				biggestFish = fishCatches[j];
			}
		}
		return biggestFish;
	}

}
