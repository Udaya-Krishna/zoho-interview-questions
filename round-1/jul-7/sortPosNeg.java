import java.util.*;
public class sortPosNeg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int pos=0,neg=0;
        for(int x:arr){
            if(x>0) pos++;
            else neg++;
        }
        int[] posArr=new int[pos];
        int[] negArr=new int[neg];

        int pI=0,nI=0;
        for(int x:arr){
            if(x>0) posArr[pI++]=x;
            else negArr[nI++]=x;
        }
        sort(posArr);
        sort(negArr);

        pI=0;
        nI=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                if(pI<posArr.length){
                    System.out.print(posArr[pI++]+" ");
                }
                else break;
            }
            else{
                if(nI<negArr.length){
                    System.out.print(negArr[nI++]+" ");
                }
                else break;
            }
        }
        while(pI<posArr.length){
            System.out.print(posArr[pI]+" ");
            pI++;
        }
        while(nI<negArr.length){
            System.out.print(negArr[nI]+" ");
            nI++;
        }
    }
    private static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
