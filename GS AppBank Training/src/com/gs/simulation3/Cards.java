package com.gs.simulation3;

public class Cards {

    public  static int maxScoreCards(int [] cardPoints,int k){
        int length=cardPoints.length;
        int totalPoints=0;
                                      // here I am  calculating total points of first k
        for(int posi=0;posi<k;posi++){
            totalPoints=totalPoints+cardPoints[posi];
        }
        int maxScore=totalPoints;
        //calculate points when taking cards from the end
        for(int posi=0;posi<k;posi++) {
            totalPoints = totalPoints - cardPoints[k - 1 - posi];      // here removing card from start
            totalPoints = totalPoints + cardPoints[length - 1 - posi]; // hare add card from end
            maxScore=Math.max(maxScore,totalPoints);
        }
         return  maxScore;
    }

    public static void main(String[] args) {
        int[] cardPoints1 = {1, 2, 3, 4, 5, 6, 1};
        int k1 = 4;

        int result=maxScoreCards(cardPoints1,k1);
        System.out.println(result);
    }
}
