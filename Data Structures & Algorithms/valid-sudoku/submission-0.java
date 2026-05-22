class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> row = new ArrayList<>();
        List<Set<Character>> col = new ArrayList<>();
        for(int i=0;i<9;i++) {
            row.add(new HashSet<Character>());
            col.add(new HashSet<Character>());
        }

        boolean res = true;

        for(int i=0;i<9;i=i+3) {
            for(int j=0;j<9;j=j+3) {
                res = res && traverse(board, i, j, row, col);
            }
        }
        return res;

    }

    public boolean traverse(char[][] board,int i , int j, List<Set<Character>> row,
                             List<Set<Character>> col ) {
        Set<Character> set = new HashSet<>();
        for(int m=i;m<i+3;m++) {
            for(int n=j;n<j+3;n++) {
                if(board[m][n] == '.')
                    continue;

                if(set.contains(board[m][n])) {
                    System.out.println(board[m][n] + " , "+ m+ " , "+ n);
                    return false;
                }
                set.add(board[m][n]);
                Set<Character> r = row.size()<m+1 ? new HashSet<Character>(): row.get(m);

                Set<Character> c = col.size()< n+1 ? new HashSet<Character>(): col.get(n);
                if(c.contains(board[m][n]) || r.contains(board[m][n])) {

                    System.out.println(board[m][n] + " , "+ m+ " , "+ n + ","+ col + " , " + row);
                    return false;
                }
                c.add(board[m][n]);
                r.add(board[m][n]);

            }
        }
        return true;
    }
}
