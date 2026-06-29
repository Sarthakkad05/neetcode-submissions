class Solution {

    List<List<String>> result = new ArrayList<>();

        boolean[] cols;
        boolean[] diag;
        boolean[] antiDiag;
        
    public List<List<String>> solveNQueens(int n) {
        
        cols = new boolean[n];
        diag = new boolean[2 * n - 1];
        antiDiag = new boolean[2 * n - 1];

        char[][] board = new char[n][n];

        for(char[] row: board){
            Arrays.fill(row, '.');
        }

        backtrack(0, board, n);

        return result;
    }

    private void backtrack(int row, char[][] board, int n){

        if(row == n){
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){

            int d = row - col + n - 1;
            int ad = row + col;

            if(cols[col] || diag[d] || antiDiag[ad]){
                continue;
            }

            board[row][col] = 'Q';
            cols[col] = true;
            diag[d] = true;
            antiDiag[ad] = true;

            backtrack(row + 1, board, n);

            board[row][col] = '.';
            cols[col] = false;
            diag[d] = false;
            antiDiag[ad] = false;            
        }
    }

    private List<String> construct(char[][] board){
        
        List<String> solution = new ArrayList<>();

        for(char[] row: board){
            solution.add(new String(row));
        }
        return solution;
    }
}













