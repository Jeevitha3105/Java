package Hackerrank;

public class DateAndTime {
    static String Zellercongruence(int day, int month, int year){
        if(month==1){
            month=13;
            year--;
        }
        if(month==2){
            month=14;
            year--;
        }
        int q = day;
        int m=month;
        int k = year%100;
        int j=year/100;

        int h=q+(13*(m+1)/5)+k+(k/4)+(j/4)+5*j;
        h=h%7;

        switch(h){
            case 0 : return "SATURDAY";
            case 1 : return "SUNDAY";
            case 2 : return "MONDAY";
            case 3 : return "TUESDAY";
            case 4 : return "WEDNESDAY";
            case 5 : return "THURSDAY";
            case 6 : return "FRIDAY";
            default: return "Invalid day";
        }

    }
    public static void main(String[] args){
        String getDay=Zellercongruence(31,5,2002);
        System.out.println(getDay);
    }
}
