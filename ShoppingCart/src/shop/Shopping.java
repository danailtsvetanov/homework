package shop;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shopping {
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		Item item1 = new Product ("Iphone 5", "Mobile Device", 1000.09, "Apple", "23.09.2013");
		Item item2 = new Product ("Nokia Lumia", "Mobile Device", 800.19, "Nokia", "13.01.2014");
		Item item3 = new Product ("Samsung S3 Mini", "Mobile Device", 200.49, "Samsung", "09.09.2012");
		Item item4 = new Product ("Samsung S3", "Mobile Device", 300.69, "Samsung", "09.06.2012");
		Item item5 = new Product ("Iphone 6", "Mobile Device", 1500.99, "Apple", "09.09.2014");
		Item item6 = new Product ("Iphone 4s", "Mobile Device", 400.49, "Apple", "19.09.2013");
		Item item7 = new Service ("Replace Mobile Screen", "Change LCD Display", 30.00, "luìp sum");
		Item item8 = new Service ("Replace mobile motherboard", "Change device motherboard", 50.20, "lump sum");
		Item item9 = new Service ("Replace phone battery", "Change internal phone's battery", 56.09, "lump sum");
		
		HashMap<Integer, Item> shop = new HashMap<Integer, Item>();
		shop.put(1,item1);
		shop.put(2, item2);
		shop.put(3, item3);
		shop.put(4, item4);
		shop.put(5, item5);
		shop.put(6, item6);
		shop.put(7, item7);
		shop.put(8, item8);
		shop.put(9, item9);
		
		HashMap<Item, Integer> shoppingCart = new HashMap<Item, Integer>();
		
		
		boolean keepGoing = true;
		int choice = 0;
		int input = 0;
		
		while(keepGoing)
		{
			System.out.println("\n         Menu");
			System.out.println("1 Add an item to your cart");
			System.out.println("2 Remove an item from the shopping cart");
			System.out.println("3 View the items in the shopping cart");
			System.out.println("4 View the items in the shop");
			System.out.println("5 Exit");
			System.out.println("Select a menu option");
			choice = scan.nextInt();
			if (choice <1 || choice >5)
			{
				System.out.println("Enter a value between 1 and 5:");
			}
			else
			{
				switch (choice)
				{
				case 1:
					
					System.out.println("Enter an item ID between 1 to 9: ");
					input = scan.nextInt();
					if((input > 0) & (input < 10)){
					if(shoppingCart.containsKey(shop.get(input))){
					int value = shoppingCart.get(shop.get(input));
					value++;
						shoppingCart.put(shop.get(input), value);
					}else{
						shoppingCart.put(shop.get(input), 1);
					}
					}else{
						System.out.printf("Item with ID %d is not found in the Shop\n", input);
						System.out.println("Please, enter item ID between 1 to 9");
					}
							
					break;
				case 2:
					
					System.out.println("Enter an item to remove between 1 to 9: ");
					input = scan.nextInt();
					if((input > 0) & (input < 10)){
						
					if(shoppingCart.containsKey(shop.get(input))){
						int value = shoppingCart.get(shop.get(input));
						if (value > 1){
						value--;
						shoppingCart.put(shop.get(input), value);
						}else{
						shoppingCart.remove(shop.get(input));
						}
						}else{
							System.out.printf("Item with ID: %d is not found \n", input);
							
						}
					}else{
						System.out.println("Please, enter item ID between 1 to 9");
					}
					
							
					
					break;
				case 3:
					
					System.out.println("      Shopping Cart Content \n");
					double priceCart = 0.0;	
					int cartValue = 0;
					for (Map.Entry<Item, Integer> shopitem : shoppingCart.entrySet())
						{
							
							
							System.out.printf("Item: %s Price: %s  Count: %d %n", shopitem.getKey().getName(), shopitem.getKey().getPrice(), shopitem.getValue());
							priceCart = priceCart + shopitem.getKey().getPrice();
							cartValue = cartValue + shopitem.getValue();
						}
					System.out.println(" \nTotal Price: " + priceCart);
					System.out.println("\nTotal Count: " + cartValue);
					break;
				
				case 4:
					
					
					System.out.println("Shop Content \n");
					
					for (Map.Entry<Integer, Item> shopitem : shop.entrySet())
					{
						
						System.out.printf("ID: %d. Item: %s Description: %s Price: %s %n", shopitem.getKey(), shopitem.getValue().getName(), shopitem.getValue().getDescription(), shopitem.getValue().getPrice());
						
					}
					
					break;
					
				case 5:
					
					keepGoing = false;
					System.out.println("Goodbye My Friend");
					break;
 
				}
			}
		}
	}
	


}
