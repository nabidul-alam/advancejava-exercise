package com.masterdevskills;

public class Play {

    public static void main(String[] args) {
        Pizza pizza = new Pizza() {
            @Override
            public String eat() {
                return "eating pizza";
            }
        };
        String s = eatingPizza(() -> "eating pizza1");
        System.out.println(s);
    }

    interface Pizza{
        String eat();
    }
    interface Star{
        String eat();

        default String reload(){
            return "default";
        }
    }

    public static String eatingPizza(Pizza pizza){
        return pizza.eat();
    }
}
