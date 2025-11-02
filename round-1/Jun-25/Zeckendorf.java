import java.util.*;
public class Zeckendorf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[50];
        arr[0]=1;
        arr[1]=2;
        int right=2;
        while(arr[right-1]+arr[right-2]<=n){
            arr[right]=arr[right-1]+arr[right-2];
            right++;
        }
        int[] res=new int[50];
        int track=0;
        int lastIndex=-1;
        int remainder=n;
        for(int i=right-1;i>=0;i--){
                if(arr[i]<=remainder){
                    if(i==lastIndex-1){
                        System.out.println("Not possible!");
                        break;
                    }
                    res[track++]=arr[i];
                    lastIndex=i;
                    remainder-=arr[i];
                }
        }
        if(remainder!=0){
            System.out.println("Not possible!");
            return;
        }
        System.out.println("Series:");
        for(int i=0;i<track;i++){
            System.out.print(res[i]+" ");
        }
    }
}
