package JavaATM3;

public class JavaATM3 {

	public static void main(String[] args) {
		
		int amount =53;
		
		int[] billValues = {100, 50, 20, 10, 5, 2, 1};
		
		int[] numberOfBills = getBillDistribution(amount, billValues);
		printOUtput (amount, billValues, numberOfBills);

	}
	
	public static void printOUtput(int amount, int[] billValues, int[] numberOfBills) {
		System.out.println("Dividindo R$ " + amount + " em notas de R$ 100, "
				+"R$ 50, R$ 20, R$ 10, R$ 5, R$ 2, e R$ 1");
		
		
		for(int i = 0; i < numberOfBills.length;i++){
			System.out.println("Notas de R$ "+ billValues[i] + ": "
					+ numberOfBills[i]);
		}
		
	}
	
	public static int[] getBillDistribution(int amount, int[] billValues) {
		int [] numberOfBills = new int[billValues.length];
		
		for (int i = 0; i < numberOfBills.length; i++) {
			numberOfBills[i] = amount / billValues[i];
			amount %= billValues[i];
					}
		
		return numberOfBills;
	}

}
