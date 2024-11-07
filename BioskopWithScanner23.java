import java.util.Scanner;
public class BioskopWithScanner23 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        int menuOption;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menuOption = sc.nextInt();
            sc.nextLine();  

            switch (menuOption) {
                case 1:  
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
        
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                    
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak valid! Silakan pilih antara baris 1-4 dan kolom 1-2.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton " + nama + " berhasil dimasukkan di baris " + baris + ", kolom " + kolom);
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2: 
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                           
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();  
                    }
                    break;

                case 3:  //
                    System.out.println("Terima kasih! Program keluar.");
                    return;

                default:
                    System.out.println("Pilihan menu tidak valid! Silakan pilih antara 1, 2, atau 3.");
                    break;
            }
        }
    }
}

   