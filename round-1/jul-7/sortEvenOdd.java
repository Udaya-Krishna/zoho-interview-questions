import java.util.*;
public class sortEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int e=0,o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) e++;
            else o++;
        }
        int[] evArr=new int[e];
        int[] odArr=new int[o];

        int ei=0,oi=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0) evArr[ei++]=arr[i];
            else odArr[oi++]=arr[i];
        }

        for(int i=0;i<e-1;i++){
            for(int j=i+1;j<e;j++){
                if(evArr[j]<evArr[i]){
                    int temp=evArr[i];
                    evArr[i]=evArr[j];
                    evArr[j]=temp;
                }
            }
        }

        for(int i=0;i<o-1;i++){
            for(int j=i+1;j<o;j++){
                if(odArr[j]>odArr[i]){
                    int temp=odArr[i];
                    odArr[i]=odArr[j];
                    odArr[j]=temp;
                }
            }
        }

        for(int i=0;i<e;i++){
            System.out.print(evArr[i]+" ");
        }
        for(int i=0;i<o;i++){
            System.out.print(odArr[i]+" ");
        }
    }
}
