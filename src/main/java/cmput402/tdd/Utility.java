package cmput402.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import cmput402.tdd.service.Search;

public class Utility {

	public HashMap<String, Float>  countAverageScore(Search search){
		HashMap<String, ArrayList<Integer>> results = search.returnAll();
		
		HashMap<String, Float> map = new HashMap<String, Float>();
		
		for(String player: results.keySet()){
			Float avg = (float)results.get(player).get(1) / (float)results.get(player).get(0);
			map.put(player, avg);
		}
		
		return map;
	}
	
	public HashMap<String, Integer>  findTopScorer(Search search){
		return null;
	}
	
}
