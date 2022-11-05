import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void cetakMenu(){
        System.out.println("+------------------------------+");
        System.out.println("| No | Jenis Kamar |  Harga    |");
        System.out.println("+------------------------------+");
        System.out.println("| 1  | VIP        | 1000k /mlm |");
        System.out.println("| 2  | Standar    | 5000k /mlm |");
        System.out.println("+------------------------------+");
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("[1]. Input Pemesanan");
        System.out.println("[2]. Tambah pesanan");
        System.out.println("[3]. Hapus pesanan");
        System.out.println("[4]. Exit");
    }
    public static <noinspection> void main(String[] args) throws IOException {
        Login lgn = new Login();
        Pelanggan pel = new Pelanggan();
        Pemesanan pesan = new Pemesanan();
        Scanner input = new Scanner(System.in);

        int pilih;
        int i = 0;
        int salah = 3;
        while (i < 3) {
            System.out.print("Username : ");
            String usernama = input.nextLine();
            lgn.setUserName(usernama);

            System.out.print("Password : ");
            String sandi = input.nextLine();
            lgn.setPassword(sandi);

            if (lgn.getUserName().equals("mhs") && lgn.getPassword().equals("mhs")){
                System.out.println("Login succes");
                break;

            } else {
                System.out.println("Login gagal");
                salah++;
                i++;
                if(i == 3){
                    System.out.println("Anda sudah 3x mencoba maaf anda keluar ");
                    System.exit(0);

                }
            }
        }

        cetakMenu();
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        switch (pilih)
        {
            case 1:
                pel.inputDataPenyewa();
                pesan.inputPemesanan();
                break;
            case 2:

                break;
            case 3:

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Error!!!");
        }

    }
}
