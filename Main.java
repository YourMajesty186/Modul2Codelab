import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String namaUniversitas = "Muhammadiyah Malang"; // Simpan nama universitas

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Tampilkan data mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membuang karakter newline setelah input integer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaTambah = input.nextLine();

                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimTambah = input.nextLine();
                    while (nimTambah.length() != 15) {
                        System.out.println("NIM Harus 15 Digit!!!");
                        nimTambah = input.nextLine();
                    }

                    System.out.print("Masukkan jurusan mahasiswa: ");
                    String jurusanTambah = input.nextLine();

                    Mahasiswa mahasiswaBaru = new Mahasiswa(namaTambah, nimTambah, jurusanTambah);
                    daftarMahasiswa.add(mahasiswaBaru);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    if (!daftarMahasiswa.isEmpty()) {
                        System.out.println();
                        tampilUniversitas(); // Cetak universitas hanya sekali di atas data mahasiswa
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            mhs.tampilDataMahasiswa(namaUniversitas);
                        }
                    } else {
                        System.out.println("Data mahasiswa belum dimasukkan.");
                    }
                    break;

                case 3:
                    berjalan = false;
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan pilih menu yang benar.");
                    break;
            }
        }

        input.close();
    }
}