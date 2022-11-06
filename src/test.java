public class test {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board [][] = new String[ROW][COL];
    public static void main(String[] args) {
        for (int i = 0; i <= (ROW-1); ++i) {
            for (int k = 0; k <= (COL-1); ++k) {
                board[i][k] = " - ";
            }
        }


        for (int i = 0; i <= (ROW-1); ++i) {
            for (int k = 0; k <= (COL-1); ++k) {
                System.out.print(board[i][k]);
            }
            System.out.println();
        }
    }
}
