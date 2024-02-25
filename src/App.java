import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] portas = new int[a];
        int i = 0;
        int ganhou = portas.length;

        while(i < portas.length){
            portas[i] = Integer.parseInt(br.readLine());
            i++;
        }

        i = 0;
        while(i < portas.length){
            switch (portas[i]) {
                case 1:
                    ganhou--;
                    break;
            }
            i++;
        }
        System.out.println(ganhou);
    }
}
