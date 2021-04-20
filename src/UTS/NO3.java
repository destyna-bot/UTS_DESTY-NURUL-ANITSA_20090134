
package UTS;

import java.util.Scanner;

public class NO3 {
    public static void main(String[] args){
       
   // mendeklarasi i, j, m, n. dengan m = ukuran baris, n = ukuran kolom 
   int i, j, m, n;
   int matriks[][] = new int[10][10]; //yang [10][10] merupakan range atau batas yang akan diinput, batas panjang barisnya 10 batas panjang kolomnya juga 10
   int transpose[][] = new int[10][10];
   //membuat scanner, perintah untuk mengambil input dari keyboard
   Scanner scan = new Scanner(System.in);
   System.out.print("Masukkan jumlah baris matriks A: "); // semisalkan 2
   // mengambil input dari keybiard 
   m = scan.nextInt();
   System.out.print("Masukkan jumlah kolom matriks A: "); // semisalkan 3
   n = scan.nextInt();
   System.out.println("Masukkan elemen matriks A: ");
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           matriks[i][j]=scan.nextInt();
       }
   }
   System.out.println("Hasil matriks A: ");
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           System.out.print(matriks[i][j]+"\t"); //"\t" merupakan untuk tab
       }
       System.out.println();
   }
   
   for(i=0; i<m; i++){
       for(j=0; j<n; j++){
           transpose [j][i] = matriks[i][j];
       }
               
   }
   System.out.println("Hasil transpose matriks A: ");
   for(i=0; i<n ;i++){
       for(j=0; j<m; j++){
           System.out.print(transpose[i][j]+ "\t");
       }
       System.out.println();
   }
   System.out.println("Desty Nurul Anitsa");
   
   int p, q, x, y;
   int matriksB[][] = new int[10][10]; //yang [10][10] merupakan range atau batas yang akan diinput, batas panjang barisnya 10 batas panjang kolomnya juga 10
   int transposeB[][] = new int[10][10];
   //membuat scanner, perintah untuk mengambil input dari keyboard
   
   System.out.print("Masukkan jumlah baris matriks B: "); // semisalkan 3
   // mengambil input dari keybiard 
   x = scan.nextInt();
   System.out.print("Masukkan jumlah kolom matriks B: "); // semisalkan 2
   y = scan.nextInt();
   System.out.println("Masukkan elemen matriks B: ");
   for(p=0; p<x; p++){
       for(q=0; q<y; q++){
           matriks[p][q]=scan.nextInt();
       }
   }
   System.out.println("Hasil matriks B: ");
   for(p=0; p<x; p++){
       for(q=0; q<y; q++){
           System.out.print(matriks[p][q]+"\t"); //"\t" merupakan untuk tab
       }
       System.out.println();
   }
   
   for(p=0; p<x; p++){
       for(q=0; q<y; q++){
           transpose [q][p] = matriks[p][q];
       }
               
   }
   System.out.println("Hasil transpose matriks B: ");
   for(p=0; p<y ;p++){
       for(q=0; q<x; q++){
           System.out.print(transpose[p][q]+ "\t");
       }
       System.out.println();
   }
   }
}
