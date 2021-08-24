package algoritme1;

public class HelloWorld {
    public static void main(String[] args) {
        int[] array = {1, 29, 99, 88, 44, 55, 8, 5, 6};

        int maksverdi = array[0];
        for (int i = 0; i < 9; ++i) {
            int verdi = array[i];
            if (verdi > maksverdi) {
                maksverdi = verdi;
            }

        }
        System.out.println(maksverdi);

    }
}

