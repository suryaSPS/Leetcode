class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set present = new HashSet();
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!present.add(num + "r" + i) || !present.add(num + "c" + j) || !present.add(num + "b" + i/3 + "-" + j/3))
                    return false;
                }
            }
        }
        return true;
    }
}