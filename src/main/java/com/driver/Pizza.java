package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int  extraCheesePrice ;
    private int ExtraToppingsPrice;
    private int TakeAwayPrice ;
     boolean istakeway;
     boolean ischeeseAdd;
     boolean istoppingAdd;
     boolean isbillGenerate=false;


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
        this.istakeway=false;
        this.ischeeseAdd=false;
        this.istoppingAdd=false;

        this.bill="Base Price Of The Pizza:"+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseAdd==false){
            this.price=this.price+this.extraCheesePrice ;
            ischeeseAdd=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingAdd==false){
            this.price=this.price+this.ExtraToppingsPrice;
            istoppingAdd=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeway==false){
            this.price=this.price+this.TakeAwayPrice;
            istakeway=true;
        }
    }

     public String getBill(){
        // your code goes here
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        if(isbillGenerate==false){

            if(ischeeseAdd==true){
                this.bill=this.bill+"Extra Cheese Added:"+this.extraCheesePrice +"\n";
            }
            if(istoppingAdd==true){
                this.bill=this.bill+"Extra Toppings Added:"+this.ExtraToppingsPrice+"\n";
            }
            if(istakeway==true){
                this.bill=this.bill+"Paperbag Added:"+this.TakeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total Price:"+this.price+"\n";
            isbillGenerate=true;
        }

        return this.bill;
    }
}
