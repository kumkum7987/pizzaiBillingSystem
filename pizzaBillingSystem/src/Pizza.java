public class Pizza{
    
    public int basePrice;
    public int extraCheese;
    public int extraToppings;
    public int pizzaSize;
    public int takeAwayCharge;
    public Boolean isExtraCheese;
    public Boolean isExtraToppings;
    public Boolean isTakeAway;
    public Boolean isVeg;
    public int total;
    public String bill = "" ;

    public Pizza(Boolean isVeg , int pizzaSize){
        
        if(isVeg){
            this.pizzaSize = pizzaSize;
             switch (pizzaSize) {
                case 0: small(isVeg);
                    break;
                case 1: medium(isVeg);
                    break;
                case 2: large(isVeg);
                    break;
                default:
                    break;
            }
            this.extraToppings = 50;
        }else{ 
               this.pizzaSize = pizzaSize;
               switch (pizzaSize) {
                case 0: small(isVeg);
                    break;
                case 1: medium(isVeg);
                    break;
                case 2: large(isVeg);
                    break;
                default:
                    break;
            }
            
            this.extraToppings = 90;
        }
        this.isVeg = isVeg;
        this.extraCheese = 30;
        this.takeAwayCharge = 15;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isTakeAway = false;
    }


        private void small(Boolean isVeg){
            if(isVeg){
                this.basePrice = 200;
            }else {
                this.basePrice = 300;
            }
        }
        private void medium(Boolean isVeg){
            if(isVeg){
                this.basePrice = 300;
            }else {
                this.basePrice = 400;
            }
        }
        private void large(Boolean isVeg){
            if(isVeg){
                this.basePrice = 400;
            }else {
                this.basePrice = 500;
             }
        }
        public int getExtraCheese(){
            return extraCheese;
        }
        public void addExtraCheese(){
            if(!isExtraCheese){
                isExtraCheese = true;
            }
        }
        public int getExtraTopping(){
            return extraToppings;
        }
        public void addExtraTopping(){
            if(!isExtraToppings){
                isExtraToppings = true;
            }
        }
        public int getTakeAwayBag(){
            return takeAwayCharge;
        }
        public void takeAwayRequired(){
            if(!isTakeAway){
                isTakeAway = true;
            }
        }

        public String getBill(){

            if(isVeg){
                bill+="Your Veg ";
            }else{
                bill+="Your Non-Veg ";
            }
            switch(pizzaSize){
                case 0 : bill+= "small pizza price is "+this.basePrice+"/-"+"\n";
                break;
                case 1 : bill+= "medium pizza price is "+this.basePrice+"/-"+"\n";
                break;
                case 2 : bill+= "large pizza price is "+this.basePrice+"/-"+"\n";
                break;
            }
            total += this.basePrice;
            if(isExtraCheese){
                bill += "Your extra cheese price is "+this.extraCheese+"/-"+"\n";
                total += this.extraCheese;
            }
            if(isExtraToppings){
                bill += "Your extra topping price is "+this.extraToppings+"/-"+"\n";
                total+= this.extraToppings;
            }
            if(isTakeAway){
                bill += "Your take away bag price is "+this.takeAwayCharge+"/-"+"\n";
                total += this.takeAwayCharge;
            }
            bill += "Your Total price for this pizza is "+this.total+"/-"+"\n";
            return bill;

        }

        public int getTotal(){
            return total;
    
        }
}        

