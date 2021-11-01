public class crossword {
    public static void main(String[]args){
        char[][] board = { { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
        { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
        { '+', '-', '-', '-', '-', '-', '-', '-', '+', '+' },
        { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
        { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
        { '+', '-', '-', '-', '-', '-', '-', '+', '+', '+' },
        { '+', '-', '+', '+', '+', '-', '+', '+', '+', '+' },
        { '+', '+', '+', '+', '+', '-', '+', '+', '+', '+' },
        { '+', '+', '+', '+', '+', '-', '+', '+', '+', '+' },
        { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+' } };


String [] words = { "agra", "norway", "england", "gwalior" };
crossword(board, words);

    }
public static void crossword(char[][] board, String words){
    crosswordhelper(board, words, 0);
}
public static void crosswordhelper(char[][] board, String words,int idx);{
  if(idx == words.length()){
      for(char[]ar : board){
          for(char ele: ar){
              System.out.print(ele+" ");
          }
          System.out.println();
      }
      return;
  }

for(int i = 0; i < board.length; i++){
    for(int j =0; j < board.length; j++){
        if(board[i][j]=='-'){
            if(canplacevertically(board, i, j, cword)){
    boolean[] pbm = placevertically(board,i,j,cword);
                crosswordhelper(board, words,idx+1);
                unplacevertically(board, i, j, cword, pbm);
            }
            if(canplacehorizontally(board, i, j, cword)){
                boolean[] pbm = placehorizontally(board,i,j,cword);
                            crosswordhelper(board, words,idx+1);
                            unplacehorizontally(board, i, j, cword, pbm);
                        }
        }
    }
}

}

public static void canplacevertically(char[][] board, int i, int j , String[] words){
    
}


}
