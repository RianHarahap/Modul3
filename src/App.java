import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("///Percobaan Pertama///");
        boolean x = false;
        if(!x){
            System.out.println("Ini adalah blok if");
        }
         else {
            System.out.println("Ini adalah blok else");
        }


        System.out.println("///Percobaan Kedua///");

        int a = 10;
        if (a > 5)
        {
            System.out.println("A lebih besar dari 5");
        }
        else 
        {
            System.out.println("A lebih kecil dari 5");
        }


        System.out.println("///Percobaan Ketiga///");
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka: " );
        int nilai = input.nextInt();

        if(nilai > 80)
        {
            System.out.println("Nilai Anda A");
        }
        else if (nilai > 70) 
        {
            System.out.println("Nilai Anda B");
        }
        else if (nilai > 60)
        {
            System.out.println("Nilai Anda C");
        }
        else if (nilai > 50)
        {
            System.out.println("Nilai Anda D");
        }
        else {
            System.out.println("Nilai Anda E");
        }
                input.close();


        System.out.println("///Percobaan Keempat///");
        int day = 1;
        switch (day)
        {
            case 1:
                System.out.println("Senin");
                break;
            
            case 2:
                System.out.println("Selasa");
                break;

            default:
                System.out.println("Tidak Valid");
                break;
        }


        System.out.println("///Percobaan Kelima///");
        String dayName = "Senin";
        switch(dayName)
        {
            case "Senin":
            System.out.println("Benar hari senin");
            break;
            
            default:
            System.out.println("Tidak Valid");
        }


        System.out.println("///Percobaan Keenam///");
        int angka = 4;
        if (angka % 2 ==0)
        {
            System.out.println("Angka Genap");
        }
        else
        {
            System.out.println("Angka Ganjil");
        }

        System.out.println("///Percobaan Ketujuh");
        String hasil = (angka % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        System.out.println(hasil);


        System.out.println("///Percobaan Kedelapan");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Perulangan Ke-" + (i+1));
        }


        System.out.println("///Percobaal Kesembilan");
        int i = 0;
        while (i < 5)
        {
            System.out.println("Perulangan Ke" + (i+1));
            i++;
        }


        System.err.println("///Percobaan Kesepuluh///");
        do
        {
            System.out.println("Perulangan Ke- " + (i+1));
            i++;
        }
        while (i < 5);


        System.out.println("///Percobaan Kesebelas");
        int []numbers ={1, 2, 3, 4, 5};
        for (int j : numbers)
        {
            System.out.println(j);
        }
    }
}
       

