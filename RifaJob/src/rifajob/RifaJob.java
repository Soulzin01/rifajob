package rifajob;

import java.util.Scanner;

public class RifaJob {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um valor");
            int x = sc.nextInt();
            
            System.out.println(x);
        }
    } 
}
