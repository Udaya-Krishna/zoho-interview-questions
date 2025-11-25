import java.util.*;
public class coinDenomination {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins={100,50,25,10,5,2,1};

        int totalCoins=0;

        for(int i=0;i<coins.length;i++){
            boolean flag=false;
            int count=0;
            if(n>=coins[i]){
                flag=true;
                count=n/coins[i];
                n=n%coins[i];
                totalCoins+=count;

            }
            if(flag){
                System.out.println(coins[i]+" rupee coin(s): "+count);
            }

        }
        System.out.println("Total coins required: "+totalCoins);
    }
}

