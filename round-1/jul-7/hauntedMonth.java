import java.util.*;
public class hauntedMonth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine().trim();
        String month=sc.nextLine().trim();

        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        int first=0;
        for(int i=0;i<7;i++){
            if(day.equalsIgnoreCase(days[i])){
                first=i;
                break;
            }
        }

        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months={"January","February","March","April","May","June","July",
                "August","September","October","November","December"};

        int daysBetween=0;
        for(int i=0;i<12;i++){
            if(month.equalsIgnoreCase(months[i])) break;
            daysBetween+=monthDays[i];
        }
        int finalDay=(first+daysBetween+12)%7;
        if(finalDay==4) System.out.println("Haunted");
        else System.out.println("Not haunted");
    }
}
