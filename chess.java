public class chess {
    static void step(int board [][], int i, int j){
        board [i] [j] = 1;

        for (int item =0; item<8; item++) {
            if ((board [i][item]) != 1 && (board [i][item]) != -1){
                board [i][item] = -1;
            }
        }
        for (int element= 0; element<8; element++) {
            if ((board [element][j]) != 1 && (board [element][j]) != -1){
                board [element][j] = -1;
                }
            }
        for (int column = 0; column < 8; column++){
            for (int raw = 0; raw < 8; raw++) {
                if (Math.abs(column-i) == Math.abs(raw-j) && (!(column==i && raw==j)))
                    board [column][raw] = -1;
                }
            }
        }
    public static void main(String[] args) {
        int [] board [] = new int [8][8];
        step(board, 5, 0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] !=1 && board[i][j] !=-1)
            step(board,i,j);
            
            }}
                Print(board);
        }
    public static void Print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    }