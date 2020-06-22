package practice;

import java.util.ArrayList;

public class Finder {

	public Object lastIndexOf(ArrayList<String> arrayList, String string) {
		// TODO Auto-generated method stub
		ArrayList<String> realList = new ArrayList<String>();
		for(int i = 0; i<arrayList.size();i++) {
			String thatWord = "";
			
			for(int j = 0;j<arrayList.get(i).length();j++) {
				String letter = arrayList.get(i).charAt(j)+"";
			thatWord += letter.toLowerCase();
			}
			realList.add(thatWord);
		}
		for(int i = realList.size()-1; i>=0;i--) {
			if(realList.get(i).equals(string.toLowerCase())) {
				return i;
			}
		}
		return -1;
	}

}
