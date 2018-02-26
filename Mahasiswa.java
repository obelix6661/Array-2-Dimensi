import java.util.Scanner;

public class Mahasiswa 
{
    public static void main(String [] args)
	{


        Scanner nilai= new Scanner(System.in);
        int mhs,jmlh, banyakTes = 3, nilaii[][], nilaitertinggi[], nilaiterendah[];
        float rata[], jumlah[], ratatinggi, ratarendah;
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = nilai.nextInt();
        
        nilaii = new int[mhs][banyakTes];
        jumlah = new float[mhs];
        rata = new float[mhs];
        nilaitertinggi = new int[banyakTes];
        nilaiterendah = new int[banyakTes];
        
        System.out.println("");
        
        for(int m=0; m<mhs; m++){ 
            System.out.println("Mahasiswa " + (m+1));
            
            for(int t=0; t<banyakTes ; t++){       
                System.out.print("Nilai Tes " + (t+1) + " : ");
                nilaii[m][t] = nilai.nextInt();

                jumlah[m] = jumlah[m] + nilaii[m][t];
            }
            rata[m] = jumlah[m]/banyakTes;
            System.out.println("");
        }
        
        for(int t=0; t<banyakTes; t++){
            nilaitertinggi[t] = nilaii[0][t];
            nilaiterendah[t] = nilaii[0][t];
        }
        
        ratatinggi = rata[0];
        ratarendah = rata[0];
        
        for(int t=0; t<banyakTes; t++){
            for(int r=0; r<mhs; r++){
                if(nilaitertinggi[t] < nilaii[r][t]){
                    nilaitertinggi[t] = nilaii[r][t];
                }
                if(nilaiterendah[t] > nilaii[r][t]){
                    nilaiterendah[t] = nilaii[r][t];
                }
            }
        }
        
        for(int t=0; t<mhs; t++){
            if(ratatinggi < rata[t]){
                    ratatinggi = rata[t];
                }
                if(ratarendah > rata[t]){
                    ratarendah = rata[t];
                }
        }
       
        System.out.println("-------------------------------------------------");
        System.out.println("\t \t Daftar Nilai Mahasiswa  ");
        System.out.println("-------------------------------------------------");
        System.out.println();
        
        System.out.println("\t\tTes   1\tTes  2\tTes  3\tRata-rata");
       
        for(int r=0; r<mhs; r++){
            System.out.print("Mahasiswa " + (r+1));
            for(int b=0; b<banyakTes; b++){
                System.out.print("\t" + nilaii[r][b]);
            }
            System.out.print("\t" + rata[r]);
            System.out.println("");
        }
        
        System.out.println("");

        System.out.print("Nilai Tertinggi\t");
        for(int r=0; r<banyakTes; r++){
            System.out.print(nilaitertinggi[r] + "\t");
        }
        System.out.print(ratatinggi);
        System.out.println("");
       
        System.out.print("Nilai Terendah\t");
        for(int r=0; r<banyakTes; r++){
            System.out.print(nilaiterendah[r] + "\t");
        }
        System.out.print(ratarendah);
        System.out.println("");
    
    }    
}