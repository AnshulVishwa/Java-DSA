// To develop a program to add two m*m matrix.

public class Program4 {
    public static void main(String[] args) {
        int m1[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        int m2[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        for( int i = 0 ; i < m1.length ; i++ ){
            for( int j = 0 ; j < m1[0].length ; j++ ){
                m1[i][j] += m2[i][j];
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
