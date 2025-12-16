import java.util.*;
public class noOfDays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two days:");

        int d1=sc.nextInt();
        String m1=sc.next();
        int y1=sc.nextInt();

        int d2=sc.nextInt();
        String m2=sc.next();
        int y2=sc.nextInt();

        int count=0;

        int mon1=getMonth(m1);
        int mon2=getMonth(m2);

        while(d1<d2 || mon1<mon2 || y1<y2){
            count++;
            d1++;

            int days=31;

            if(mon1==4 || mon1==6 || mon1==9 || mon1==11){
                days=30;
            }

            else if(mon1==2){
                if((y1%400==0) || (y1%4==0 && y1%100!=0)){
                    days=29;
                }
                else days=28;
            }

            if(d1>days){
                d1=1;
                mon1++;

                if(mon1>12){
                    mon1=1;
                    y1++;
                }
            }

        }
        System.out.println("No. of days:"+count);
    }

    private static int getMonth(String month){
        String[] months={"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};

        for(int i=0;i<12;i++){
            if(month.equalsIgnoreCase(months[i])){
                return i+1;
            }
        }
        return -1;
    }
}
