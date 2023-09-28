public class EvaluasiEkspresi {
    public static void main(String[]args ) {
     int A = 3;
     int B = 6;
     int C = 2;
     int K = 5;
     int L = 4;
     int M = 3;

     boolean hasilA = 4 + 2 > A && B - 2 > 3 + 2 || B + 2  <= 6 + 2;
     boolean hasilB = K + 5 < M || (C * M < L && 2 * M - L > 0);
     boolean hasilC = L + 5 < M || C * K < L && 2 * K - L > 0;
     boolean hasilD = A * 4 <= 3 * M + B ; 
     boolean hasilE = K + 10 > A && L - 2 > 4 * C ;

     System.out.println("hasil a:" + hasilA);
     System.out.println("hasil b:" + hasilB);
     System.out.println("hasil c:" + hasilC);
     System.out.println("hasil d:" + hasilD);
     System.out.println("hasil e:" + hasilE);
    }
}