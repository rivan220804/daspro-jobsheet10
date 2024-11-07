import java.util.Scanner;
public class Siakad23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int [jumlahSiswa][jumlahMataKuliah];

        for (int i=0; i< jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j=0; j < jumlahMataKuliah; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai [i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/3);
        }

        System.out.println("\n====================");
        System.out.println("Rata-rata Niali setiap mata kuliah: ");

        for (int j=0; j<jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i=0; i<jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/4);
        }


    }
}
