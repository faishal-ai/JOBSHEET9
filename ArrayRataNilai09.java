import java.util.Scanner;
public class ArrayRataNilai09 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Masukkan jumlah mahasiswa : ");
            int jumlahMhs = sc.nextInt();
            int[] nilaiMhs = new int[jumlahMhs];
            double totalLulus = 0;
            double totalTidakLulus = 0;
            int jmlLulus = 0;
            int jmlTdkLulus = 0;

            for (int i = 0; i < nilaiMhs.length; i++){
                System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
                nilaiMhs[i] = sc.nextInt();
             if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++; 
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTdkLulus++;
     }
    }
            double rataLulus = (jmlLulus>0) ? totalLulus / jmlLulus : 0;
            double rataTdkLulus = (jmlTdkLulus > 0) ? totalTidakLulus /jmlTdkLulus : 0;
            
            System.out.println("Rata-rata nilai lulus = " +rataLulus);
            System.out.println("Rata-rata nilai tidak lulus = "+rataTdkLulus);
        }
}}


    // public static void main(String[] args) {
    //     try (Scanner sc = new Scanner (System.in)) {
    //         int[] nilaiMhs = new int[10];
    //         double total = 0;
    //         double rata2;
    //         int MhsLulus = 0;
     
    //         for (int i = 0; i < nilaiMhs.length; i++){
    //             System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
    //             nilaiMhs[i] = sc.nextInt();
    //             if (nilaiMhs[i] > 70) {
    //                 MhsLulus++;
    //              }
    //           }
    //         for (int i = 0; i < nilaiMhs.length; i++){
    //             total += nilaiMhs[i];
    //           }
    //             rata2 = total/nilaiMhs.length;
    
    //             System.out.println("Rata-rata nilai = "+rata2);
    //             System.out.println("Jumlah mahasiswa yang lulus (>70) : " +
    //             MhsLulus);
    //     }
    
    //         }
    //  }







   
//          public static void main(String[] args) {
//         try (Scanner sc = new Scanner (System.in)) {
//             int[] nilaiMhs = new int[10];
//             double total = 0;
//             double rata2;

//             for (int i = 0; i < nilaiMhs.length; i++){
//                 System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
//                 nilaiMhs[i] = sc.nextInt();
//     }
//             for (int i = 0; i < nilaiMhs.length; i++){
//                 total += nilaiMhs[i];
//    }
//                 rata2 = total/nilaiMhs.length;
//             System.out.println("Rata-rata nilai = "+rata2);
//         }
//     }
//   }
