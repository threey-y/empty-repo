package com.thoughtworks;

import java.lang.reflect.Array;

public class Goods {
    private int price;
    private String name;
    Goods( int price, String name){
        this.price = price;
        this.name = name;
    }

    String[] specialGoodsList = new String[]{"apple" , "watermelon" , "beef"};

   boolean specialGoodsJudge(){
        boolean judgeNum = false;
        for (int i=0;i<specialGoodsList.length;i++) {
            if(name  == specialGoodsList[i])
                return  true;
            else judgeNum =  false;

        }
        return judgeNum;
    }


    int getPrice(){
        if (specialGoodsJudge() == true)
            return 100;
        else return price;
    }
}
