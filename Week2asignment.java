package week2notes;

public class Week2asignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = false;
		boolean isWeekDay = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2;
		double moneyInWallet = 100;
		int thirstLevel = 5;
		
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		
		System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekDay;
		
		System.out.println(willGoSwimming);
		
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekDay;
		
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && (costOfMilk <= (moneyInWallet * 2));
		
		System.out.println(willBuyMilk);
		

		
		
		//Loops
		
		int number = 0;
		while ((number += 2 ) < 100) {
			
			System.out.println(number);
		}
		
		while ((number -= 3) > 0 ) {
			
			System.out.println(number);
			
		}
	

		for (int i = 0; i < 100; i += 2) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
		for (int u = 0; u < 100; u++) {
			
			if ( u % 3 == 0) {
				
				System.out.println("Hello");
				
			}else if (u % 5 == 0) {
				
				System.out.println("World");
			}else if (u % 15 == 0) {
				
				System.out.println("Hello World");
			}
			
			System.out.println(u);
			
		}
	
	}

}
