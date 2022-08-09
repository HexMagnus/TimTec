package JavaATM3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaATM3 {

	public static void main(String[] args) {
		
		int amount =53;
		
	    List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		
		List<Integer> numberOfBills = getBillDistribution(amount, billValues);
		printOUtput (amount, billValues, numberOfBills);

	}
	
	public static void printOUtput(int amount, List<Integer> billValues, List<Integer> numberOfBills) {
		System.out.println("Dividindo R$ " + amount + " em notas de R$ 100, "
				+"R$ 50, R$ 20, R$ 10, R$ 5, R$ 2, e R$ 1");
		
		
		for(int i = 0; i < numberOfBills.size();i++){
			System.out.println("Notas de R$ "+ billValues[i] + ": "
					+ numberOfBills[i]);
		}
		
	}
	
	public static List <Integer> getBillDistribution(int amount, List <Integer> billValues) {
		ArrayList<Integer> numberOfBills = new ArrayList<>();
		
		for (int i = 0; i < billValues.size(); i++) {
			numberOfBills.add(i,  amount / billValues.get(i));
			amount %= billValues.get(i);
					}
		
		return numberOfBills;
	}

}
