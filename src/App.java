import java.util.Scanner;
import java.util.InputMismatchException;

class kubus{
    int sisi;
    kubus(int sisi){
        this.sisi = sisi;
    }

    public long volume(){
        return sisi*sisi*sisi;
    }

    public void tampilkanVolume(){
        System.out.println("Panjang sisi kubus : " +sisi+ "cm\nVolume kubus : " +volume()+ "cm^3");
    }
}

public class App {
    public static void main(String[] args)throws Kecil0, Besar100 {
        Scanner keyboard = new Scanner(System.in);  
        int sisi;
        String empty;
        try {
            System.out.print("input panjang sisi kubus (cm) : ");
            sisi = keyboard.nextInt();

            if (sisi>100) throw new Besar100();
            if (sisi<=0) throw new Kecil0();

            kubus kbs = new kubus(sisi);
            kbs.tampilkanVolume();
        }
        
        catch (NumberFormatException e) {
            System.out.println("Sisi harus diisi, tidak boleh kosong");
        }
        
        catch (InputMismatchException e){
            System.out.println("Panjang Sisi harus di isi bilangan bulat!");
        }
    }


}
