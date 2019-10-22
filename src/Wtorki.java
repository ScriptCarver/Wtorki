import java.time.LocalDate;

public class Wtorki {

    public static void main(String[]args) {
        int k= cos(2019,10);
        System.out.println("Liczba wtorkow w zadanym miesiacu wynosi: "+k);
    }

    public static int cos(int rok, int miesiac){

        LocalDate mor = LocalDate.of(rok,miesiac,1);
        int n=mor.lengthOfMonth();
        int l=0;
        for(int i=0;i<n;i++){

            if(mor.plusDays(i).getDayOfWeek().getValue()==2){
                l++;
            }
        }
        return l;
    }
}

