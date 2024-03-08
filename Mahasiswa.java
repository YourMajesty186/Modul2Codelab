class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        if (nim.length() > 15) {
            this.nim = nim.substring(0, 15);
        } else {
            this.nim = nim;
        }
        this.jurusan = jurusan;
    }

    public void tampilDataMahasiswa(String universitas) {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }
}