package algoritme1;

import static org.junit.jupiter.api.Assertions.*;

class UkerOppgaver1Test {

    @org.junit.jupiter.api.Test
    void min() {
        int[] a = {9, 3, 6, 7, 23, 44, 35, 67, 95, 56, 77};

        int minimum = UkerOppgaver1.min(a);

        assertEquals(1, minimum);
        assertEquals(3,a[minimum]);
    }
}