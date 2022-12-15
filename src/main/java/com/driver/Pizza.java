package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int  chesePrise;
    private int tappingPrise;
    private int takewayPrise;
     boolean istakeway;
     boolean ischeeseAdd;
     boolean istoppingAdd;
     boolean isbillGenerate=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        takewayPrise=20;
        chesePrise=80;
        if(isVeg==true){
            this.price=300;
            this.tappingPrise=70;
        }
        else{
            this.price=400;
            this.tappingPrise=120;
        }
        this.istakeway=false;
        this.ischeeseAdd=false;
        this.istoppingAdd=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseAdd==false){
            this.price=this.price+this.chesePrise;
            ischeeseAdd=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingAdd==false){
            this.price=this.price+this.tappingPrise;
            istoppingAdd=false;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeway==false){
            this.price=this.price+this.takewayPrise;
            istakeway=false;
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
                this.bill=this.bill+"Extra Cheese Added: "+this.chesePrise+"\n";
            }
            if(istoppingAdd==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.tappingPrise+"\n";
            }
            if(istakeway==true){
                this.bill=this.bill+"Paperbag Added: "+this.takewayPrise+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isbillGenerate=true;
        }

        return this.bill;
    }
}
