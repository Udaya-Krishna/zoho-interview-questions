import java.util.*;
public class Pattern {
    public static void main(String[] args){
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=(n/2)+1;i++){
            int k=count+i;
            for(int j=1;j<=i;j++){
                System.out.print(k--+" ");
            }
            count+=i;
            System.out.println();
        }

        for(int i=(n/2);i>=1;i--){
            int k=count+i;
            for(int j=1;j<=i;j++){
                System.out.print(k--+" ");
            }
            count+=i;
            System.out.println();
        }
    }
}
