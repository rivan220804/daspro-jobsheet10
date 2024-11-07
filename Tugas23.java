import java.util.Scanner;
public class Tugas23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
               
                int a[][] = new int[10][6];
                double rataRataResponden[] = new double[10];  
                double rataRataPertanyaan[] = new double[6];  
                double total = 0; 
                double rataRata=0;
                
                System.out.println("Masukkan hasil survei:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Responden " + (i + 1) + ":");
                    for (int j = 0; j < 6; j++) {  
                        System.out.print("Jawaban untuk Pertanyaan ke- " + (j + 1) + " (1-5): ");
                        a[i][j] = sc.nextInt();
                    }
                }
        
               
                System.out.println("\nRata-rata untuk setiap responden:");
                for (int i = 0; i < 10; i++) {
                    double totalResponden = 0;
                    for (int j = 0; j < 6; j++) {
                        totalResponden += a[i][j];
                    }
                    rataRataResponden[i] = totalResponden / 6;
                    System.out.println("Rata-rata Responden "  + (i+1) + ": " + rataRata/6);
                }
        
                
                System.out.println("\nRata-rata untuk setiap pertanyaan:");
                for (int j = 0; j < 6; j++) {
                    double totalPertanyaan = 0;
                    for (int i = 0; i < 10; i++) {
                        totalPertanyaan += a[i][j];
                    }
                    rataRataPertanyaan[j] = totalPertanyaan / 10;
                    System.out.println("Rata-rata Pertanyaan "  + (j+1) + ": " + rataRata/10);
                }
    
                System.out.println("\nRata-rata keseluruhan:");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 6; j++) {
                        total += a[i][j];
                    }
                }
                double rataRataKeseluruhan = total / (10 * 6);  
                System.out.println("Rata-rata Keseluruhan: " , rataRataKeseluruhan/60);
        
                
            }
        }
        



    