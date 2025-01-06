import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Zomato");
        
        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your mobile.No");
        String mobileNumber = sc.nextLine();
        
        int length = String.valueOf(mobileNumber).length();
        
        if (length == 10) {
            System.out.println("Enter OTP");
            int otp = sc.nextInt();
            
        System.out.println("Food details");
        System.out.println("1.Chapathi");
        System.out.println("2.Dosa");
        System.out.println("3.Pizza");
        System.out.println("4.Burger");
        System.out.println("5.Biriyani");
        System.out.println("6.Sandwich");
        System.out.println("7.Fried Rice"); 
        
        System.out.println("Please select your Food item");
        int foodItem = sc.nextInt();

        switch(foodItem) {
            case 1:
                System.out.println("You are choosing Chapathi");
                break;
            case 2:
                System.out.println("You are choosing Dosa");
                break;
            case 3:
                System.out.println("You are choosing Pizza");
                break;
            case 4:
                System.out.println("You are choosing Burger");
                break;
            case 5:
                System.out.println("You are choosing Biriyani");
                break;
            case 6:
                System.out.println("You are choosing Sandwich");
                break;
            case 7:
                System.out.println("You are choosing Fried Rice");
                break;
        }

        System.out.println("Please select the Hotel");
        System.out.println("1.Golden Spoon Bistro");
        System.out.println("2.Spice Haven");
        System.out.println("3.Green Bowl Cafe");
        System.out.println("4.Ocean’s Delight");

        int hotelChoice = sc.nextInt();

        switch(hotelChoice) {
            case 1:
                System.out.println("Review: Golden Spoon’s dishes are a true culinary delight! Every bite bursts with flavor, and the ingredients taste incredibly fresh. The presentation is top-notch. Their signature pasta was a standout. Definitely a treat for food lovers. Highly recommended for a premium dining experience!");
                break;
            case 2:
                System.out.println("Review: The food at Spice Haven is a flavor explosion! Perfectly balanced spices and rich, aromatic dishes impressed us. The biryani and curries were authentic and delicious. Service was prompt, and portions were generous. A must-visit for spice enthusiasts!");
                break;
            case 3:
                System.out.println("Review: Green Bowl Cafe offers healthy and flavorful meals without compromise. The salads were fresh, and the smoothies were refreshing. Loved the quinoa bowls with unique dressings. Perfect for health-conscious diners who don’t want to sacrifice taste. Highly recommended!");
                break;
            case 4:
                System.out.println("Review: The seafood at Ocean’s Delight is exceptional. Everything tasted fresh, with the grilled salmon and lobster being the stars of the menu. The chef’s attention to detail in seasoning and presentation was remarkable. A paradise for seafood lovers!");
                break;
        }

        if (foodItem == 1) {
            int ChapathiPrice = 12;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 12Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                ChapathiPrice = 12;
                System.out.println("Your Total bill is: " + (quantity * ChapathiPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Set = 10Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                ChapathiPrice = 10;
                System.out.println("Your Total bill is: " + (quantity * ChapathiPrice) + "Rs");
                System.out.println("Thank you for your Order");

            }
        }
        else if (foodItem == 2) {
            int dosaPrice = 35;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 35Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                dosaPrice = 35;
                System.out.println("Your Total bill is: " + (quantity * dosaPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Set = 32Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                dosaPrice = 32;
                System.out.println("Your Total bill is: " + (quantity * dosaPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
        }
        else if (foodItem == 3) {
            int pizzaPrice = 150;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Pizza = 150Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                pizzaPrice = 150;
                System.out.println("Your Total bill is: " + (quantity * pizzaPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Pizza = 130Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                pizzaPrice = 130;
                System.out.println("Your Total bill is: " + (quantity * pizzaPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
        }
        else if (foodItem == 4) {
            int burgerPrice = 80;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 80Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                burgerPrice = 80;
                System.out.println("Your Total bill is: " + (quantity * burgerPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Set = 75Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                burgerPrice = 75;
                System.out.println("Your Total bill is: " + (quantity * burgerPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
        }
        else if (foodItem == 5) {
            int biriyaniPrice = 100;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Parcel = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                biriyaniPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * biriyaniPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Parcel = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                biriyaniPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * biriyaniPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
        }
        else if (foodItem == 6) {
            int SandwichPrice = 100;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Quantity = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                SandwichPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * SandwichPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Quantity = 85Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                SandwichPrice = 85;
                System.out.println("Your Total bill is: " + (quantity * SandwichPrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
        }
        else {
            int friedRicePrice = 85;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Quantity = 85Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                friedRicePrice = 85;
                System.out.println("Your Total bill is: " + (quantity * friedRicePrice) + "Rs");
                System.out.println("Thank you for your Order");
            }
            else {
                System.out.println("1 Quantity = 80Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                friedRicePrice = 80;
                System.out.println("Your Total bill is: " + (quantity * friedRicePrice) + "Rs");
                System.out.println("Thank you for your Order");
            }        
            
        }
        




        }
        else {
            System.out.println("Enter correct Mobile No.");
        }

        sc.close();

    }
}