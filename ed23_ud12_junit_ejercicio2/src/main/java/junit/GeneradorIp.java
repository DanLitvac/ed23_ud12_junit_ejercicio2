package junit;

import java.util.Random;

public class GeneradorIp {
    private Random rand;

    public GeneradorIp() {
        rand = new Random();
    }

    public int generarNumero(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public String generarIp() {
        int n1 = generarNumero(1, 255);
        int n2 = generarNumero(0, 255);
        int n3 = generarNumero(0, 255);
        int n4 = generarNumero(1, 255);
        return n1 + "." + n2 + "." + n3 + "." + n4;
    }
}
