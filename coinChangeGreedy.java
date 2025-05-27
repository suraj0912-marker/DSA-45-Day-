package com.practise;

public class coinChangeGreedy {
    public static void main(String[] args) {
        int []coin={20,10,5,2,1};
        int amount=45;
        System.out.print("coin used :");
        for (int i = 0; i <coin.length ; i++) {
            while (amount>=coin[i]){
                System.out.print(coin[i]+" ");
                amount=amount-coin[i];
            }

        }
    }
}
