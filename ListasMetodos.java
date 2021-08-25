import java.util.Arrays;

public class ListasMetodos {
    public static void main(String[] args) {
        int[] num = {0 ,8, 2, 3, 5, 4, 6, 7, 1, 9};
        int[] numeros = new int[num.length];
        String arrayIgual = "";
        int p = 3;
        int pos;
        // int total = 0;
        
        Arrays.sort(num);
        // Arrays.fill(num, 10);
        // System.arraycopy(num, 0, numeros, 0, num.length);

        // arrayIgual = Arrays.equals(num, numeros) ? "Sim" : "Não";
        pos = Arrays.binarySearch(num, p); // precisa ordenar o array para usar esse método
        System.out.printf("O elemento %d está no array? %s", p, pos > 0 ? "Sim" : "Não");

        // for (int i : numeros) {
        //     System.out.println(i);
        // }
    }

}
 