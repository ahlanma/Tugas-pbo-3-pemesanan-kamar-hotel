import java.util.Scanner;

public class Pelanggan {
    Scanner input = new Scanner(System.in);

    private String idPel;
    private String nama;
    private String alamat;
    private String noHp;
    private String Jk;

    public void inputDataPenyewa(){
        System.out.print("Id Penyewa    : ");
        idPel = input.nextLine();
        System.out.print("Masukkan nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan no HP  : ");
        noHp = input.nextLine();
        System.out.print("Jenis kelamin   : ");
        Jk = input.nextLine();
    }
}
