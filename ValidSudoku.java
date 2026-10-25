
import java.util.*;


class ValidSudoku {
public static void main(String[] args) {

    int[][] board = { 
        
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,3,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        
    };
System.out.println("Duplicates "+(checkIfAnyRoworColumnDuplicate(board)?"Exists":"Not Exists"));
   
   

}
public static boolean checkIfAnyRoworColumnDuplicate(int[][] board) {
     for(int i = 0; i < board.length; i++) {
         Set<Integer> columnSet = new LinkedHashSet<Integer>();
        Set<Integer> rowSet = new LinkedHashSet<Integer>();
    
        for(int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + " ");

            if(!rowSet.add(board[i][j]) && board[i][j]!=0) {
                System.err.println("Found Duplicate in Row "+i+ "index "+j+" Element is "+ board[i][j]);
                return true;
            }

              if(!columnSet.add(board[j][i]) && board[j][i]!=0) {
                System.err.println("Found Duplicate in Column "+i+ "index "+j+" Element is "+ board[j][i]);
                return true;
            }
        }
        System.out.println();
          
        
    }
    return false;
}

public static boolean isDuplicateInSuares(int[][] board) {
for (int boxRow = 0; boxRow < 9; boxRow += 3) {
    for (int boxCol = 0; boxCol < 9; boxCol += 3) {

        Set<Integer> boxSet = new HashSet<>();

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {

                int value = board[i][j];

                if (value != 0 && !boxSet.add(value)) {
                    System.out.println(
                        "Duplicate in 3x3 box: " + value);
                    return true;
                }
            }
        }
    }
}

return false;
}


   

}