import java.util.Scanner;

class Display{
 
    //scanner
    Scanner input = new Scanner(System.in);

    void inputt(){
        //inisialisasi
        int jml;   
        String Status;

        System.out.print("Masukkan Jumlah : ");
        jml =  input.nextInt();

        //inisialisasi array
        int[] Nilai = new int[jml];
        String[] nama = new String[jml];

        
        for (int i = 0;i < jml; i++ ){

            System.out.print("Masukkan Nama : ");
            nama[i] = input.next();
    
            System.out.print("Maskkan Nilai : ");
            Nilai[i] = input.nextInt();

        }

            System.out.println("Nama    Nilai     Status");
            System.out.println("------------------------");

        for (int i = 0;i < jml; i++ ){
            if (Nilai[i] > 85){
                Status = "A";
            }
            else if(Nilai[i]>=70 && Nilai[i]<=85){
                Status = "B";
            }
            else if(Nilai[i]>=60 && Nilai[i]<=70){
                Status = "C";
            }
            else {
                Status = "D";
            }

            System.out.print(nama[i]);
            System.out.print("        "+Nilai[i]);
            System.out.print("        "+Status+"\n");
        }

    }
}


public class coba {
    
    public static void main(String[] args) {
        //konstruktor
        Display mhs = new Display();
        mhs.inputt();
    }
}
