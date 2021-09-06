package algoritme1;

public class HelloWorld {
    public static void main(String[] args) {
        int[] array = {1, 29, 99, 88, 44, 55, 8, 5, 6};
         System.out.println("finner støste tall");

        int maksverdi = array[0];
        for (int i = 0; i < 9; ++i) {
           int verdi = array[i];
            if (verdi > maksverdi) {
                maksverdi = verdi;
            }

        }
        System.out.println(maksverdi);

        System.out.println("faesal teller opp til 15");

        for (int i=1; i<=15; ++i){
            System.out.println("faesal sier "+ i);
        }

    }
            
}

