import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        
        int jumlahVokal = 0;
        
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            
            if (huruf == 'a' || huruf == 'A') {
                jumlahVokal++;
            } else if (huruf == 'i' || huruf == 'I') {
                jumlahVokal++;
            } else if (huruf == 'u' || huruf == 'U') {
                jumlahVokal++;
            } else if (huruf == 'e' || huruf == 'E') {
                jumlahVokal++;
            } else if (huruf == 'o' || huruf == 'O') {
                jumlahVokal++;
            }
        }
        
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
        

        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah huruf vokal genap");
                break;
            case 1:
                System.out.println("Jumlah huruf vokal adalah ganjil");
                break;
        }
        
        System.out.print("String secara terbalik: ");
        
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i) + " ");
        }
        
        input.close();


    }
}


