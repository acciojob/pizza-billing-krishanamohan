package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int  extraCheesePrice ;
    private int ExtraToppingsPrice;
    private int TakeAwayPrice ;
     boolean isTakeaway;
     boolean isCheeseAdded;
     boolean isToppingsAdded;
     boolean isBillGenerated=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        TakeAwayPrice=20;
        extraCheesePrice =80;
        if(isVeg==true){
            this.price=300;
            this.ExtraToppingsPrice=70;
        }
        else{
            this.price=400;
            this.ExtraToppingsPrice=120;
        }
        this.isTakeaway=false;
        this.isCheeseAdded=false;
        this.isToppingsAdded=false;

        this.bill="Base Price Of The Pizza:"+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice ;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price=this.price+this.ExtraToppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeaway==false){
            this.price=this.price+this.TakeAwayPrice;
            isTakeaway=true;
        }
    }

     public String getBill(){
        // your code goes here
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        if(isBillGenerated==false){

            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added:"+this.extraCheesePrice +"\n";
            }
            if(isToppingsAdded==true){
                this.bill=this.bill+"Extra Toppings Added:"+this.ExtraToppingsPrice+"\n";
            }
            if(isTakeaway==true){
                this.bill=this.bill+"Paperbag Added:"+this.TakeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total Price:"+this.price+"\n";
            isBillGenerated=true;
        }

        return this.bill;
    }
}
