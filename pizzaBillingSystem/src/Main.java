import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        System.out.print("Welcome to Sharma's Pizza Hub!\n");
        System.out.print("Do you want to enjoy our pizza ?\n");
        System.out.print("Press 1 for yes or 0 for No\n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 0){
            System.out.print("Thankyou for visiting.Please come again to enjoy our pizza!\n");
        }else{
            System.out.println("How many pizza you want?");
            int numberOfPizza = sc.nextInt();
            ArrayList<Pizza> oderList = new ArrayList<>();
            for(int i=0; i<numberOfPizza; i++){

                System.out.println("Do you Looking for a veg pizza? Press 1:Yes or 0:NO");
                int pizzaType = sc.nextInt();
                Boolean isVeg = true;
                if(pizzaType == 0){
                    isVeg = false;
                }
                System.out.println("What is your prefered pizza size? Press\n 0:small\n 1:medium \n 2:large");
                int size = sc.nextInt();

                Pizza pizza = new Pizza(isVeg , size);

                System.out.println("Do you want extra cheese? Press 1:Yes or 0:No");
                int extraCheese = sc.nextInt();
                if(extraCheese == 1){
                    pizza.addExtraCheese();
                }
                
                System.out.println("Do you want extra Toppings? Press 1:Yes or 0:No");
                int extraTopings= sc.nextInt();
                if(extraTopings== 1){
                    pizza.addExtraTopping();
                }

                System.out.println("Are Do you want take away bag? Press 1:Yes or 0:No");
                int takeAwayBag = sc.nextInt();
                if(takeAwayBag == 1){
                    pizza.takeAwayRequired();
                }

                oderList.add(pizza);

            }

            String bill = "";
            int total = 0;
            for(int i=0; i<numberOfPizza; i++){
                Pizza localPizza = oderList.get(i);
                bill += localPizza.getBill();
                total += localPizza.getTotal();
             }
             bill += "Your grand total for this oder "+total+"/-"+"\n";
             System.out.print(bill);
        }
    }
    
}
