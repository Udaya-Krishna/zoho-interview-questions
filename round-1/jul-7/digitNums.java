import java.util.*;
public class digitNums {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            if(isValid(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isValid(int n){
        if(n==0) return true;
        while(n>0){
            int digit=n%10;
            if(digit!=5 && digit!=6 && digit!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}
