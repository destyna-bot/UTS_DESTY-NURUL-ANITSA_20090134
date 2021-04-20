
package UTS;

public class NO1 {
    public static void Bubble_Sort(int B[]){
        int i = 1, j, n = B.length;
        int temp;
        while (i<n){
            j = n-1;
            while (j>=i) {
                if (B[j-1]>B[j]){
                    temp = B[j];
                    B[j] = B[j-1];
                    B[j-1] = temp;
                }
                j = j -1;
            }
            i = i + 1;
        }
    }
    
    public static void tampil(int data[]){
        for( int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main( String[] args){
        int B[] = {3, 10, 4 , 2, 8, 13};
        NO1.tampil(B);
        NO1.Bubble_Sort(B);
        NO1.tampil(B);
        
        int cari = 8;
        int indeks_awal = 0;    //0
        int indeks_akhir = B.length-1;   //4
        int ketemu = 0;
        int point = 0;
        
        //menampilkan data dalam array
        System.out.println("Isi data adalah ");
        for( int i = 0; i < B.length; i++ ){   //i=0; 0<5->T; printB[0]; i++ i=1;1<5 ->T; maka print B[1] dan seterusnya hingga i=5; 5<5-?F maka perulangan berhenti 
            System.out.print(B[i] + " "); //print B[0] = 7;print B[1] = 9; dst
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        //membuat kondisi ketika indeks awal <= indeks akhir, akan ketemu = 0
        while ((indeks_awal <= indeks_akhir) && (ketemu == 0)) { 
        point = (indeks_awal + indeks_akhir) / 2; // 0+4=4/2=2; 
        System.out.println("Indeks pointer :" + point);
            if (cari == B[point] ) {
                ketemu = 1;
                System.out.println ("Data " + cari + " Telah ditemukan pada indeks ke "+ point);                
            }
            
            else if (cari < B[point]) {
               System.out.println("Cari di kiri ");
               indeks_akhir = point-1;
            }
            
            else if(cari > B[point]){
                indeks_awal = point+1;
                System.out.println("Cari di kanan ");
            }
        }
            
    if (ketemu == 1)
        System.out.println("Kesimpulan: Data ditemukan ");
    else 
        System.out.println("Kesimpulan: Data tidak ditemukan");
        }

    }



