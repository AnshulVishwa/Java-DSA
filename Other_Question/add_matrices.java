// To develop a program to add two m*m matrix.

public class add_matrices {
    public static void main(String[] args) {
        int m1[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        int m2[][] = { { 1 , 2 , 3 } , { 4 , 5 , 6 } , { 7 , 8 , 9 } };
        int result[][] = new int[ m1.length ][ m1[0].length ];
        for( int i = 0 ; i < m1.length ; i++ ){
            for( int j = 0 ; j < m1[0].length ; j++ ){
                result[i][j] = m1[i][j] + m2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
