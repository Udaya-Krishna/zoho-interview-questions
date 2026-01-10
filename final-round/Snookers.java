import java.util.*;
public class Snookers {
    static final int size=9;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cue=0;
        int target=2;

        int board[]=new int[size];

        while(target<size){
            printIT(cue, target);
            System.out.println("Enter steps");
            int steps=sc.nextInt();

            int gap=target-cue;

            if(gap<=steps && gap>0){
                int cueMov=gap-1;
                cue=cue+cueMov;

                int remaining=steps-cueMov;
                target+=remaining;

            }

            else{
                cue+=steps;
            }

        }
        printIT(cue,target);
        System.out.println();
        System.out.println("Target reached!");
    }

    static void printIT(int cue, int target){
        for(int i=0;i<size;i++){
            if(i==cue) System.out.print("0 ");
            else if(i==target) System.out.print("2 ");
            else System.out.print(". ");
        }
        System.out.println();
    }
}
