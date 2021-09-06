package algoritme1;

public class UkerOppgaver1 {
    public static void main(String[] args) {
        int[] a = {9, 3, 6, 7, 23, 44, 35, 67, 95, 56, 77};

        int min_index = min(a);

        System.out.println("indexen er " + min_index);
        System.out.println("verdien er " + a[min_index]);
    }

    static int min(int[] a){
        //initisliserer med første element
        int min_value = a[0];
        int min_index = 0;

        // looper over alle resterende elementer og sjekk om vi finner et mindre tall.

        for (int i=1; i<a.length; ++i){
            int value = a[i];
            int index = i;

            //sjekk om vardiene er mindre enn det vi har sett tidligere.

            if (value< min_value){
                min_value = value;
                min_index = index;
            }
        }
        //returnerer index til minste verdi.
        return min_index;
    }
}
