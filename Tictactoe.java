package TicTacToe;

public class Tictactoe 
{
    private char[][] board = new char[3][3];
    private char player = 'X';

    public Tictactoe()
    {
        clear();
        showBoard();

    }

    public void clear()
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int column = 0; column < board[row].length; column++)
            {
                board[row][column] = ' ';
            }
        }
    }

    public void showBoard()
    {
        System.out.println("");
        System.out.println("   1   2   3 ");
        System.out.println("");
        System.out.println("1  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
        System.out.println("  -----------");
        System.out.println("2  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
        System.out.println("  -----------");
        System.out.println("3  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ");
        System.out.println("");
    }

    public char getPlayer()
    {
        return player;
    }

    public void input(int row, int column)
    {
        board[row-1][column-1] = player;
    }

    public boolean OutofBoundsRow(int row)
    {
        boolean retVal = false;
        
        if(row < 1 || row > 3)
            {
                retVal = true;
            }
        return retVal;
        
        
    }

    public boolean OutofBoundsColumn(int column)
    {
        boolean retVal = false;
        
        if(column < 1 || column > 3)
            {
                retVal = true;
            }
        return retVal;
        
        
    }

    public boolean isTaken(int row, int column)
    {
        boolean retVal = false;
        
        if(board[row-1][column-1] != ' ')
        {
            retVal = true;
        }
        return retVal;
    }

    public void player_switch()
    {
        if(player == 'X')
        {
            player = 'O';
        }
        else
        {
            player = 'X';
        }
    }

    public boolean isWin()
    {
        boolean retVal = false;

                //win by rows
                if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
                {
                    retVal = true;
                }
                if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
                {
                    retVal = true;
                }
                if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
                {
                    retVal = true;
                }
        
                if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
                {
                    retVal = true;
                }
                if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
                {
                    retVal = true;
                }
                if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
                {
                    retVal = true;
                }
        
                //win by columns
                if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
                {
                    retVal = true;
                }
                if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
                {
                    retVal = true;
                }
                if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
                {
                    retVal = true;
                }
        
                if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
                {
                    retVal = true;
                }
                if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
                {
                    retVal = true;
                }
                if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
                {
                    retVal = true;
                }
        
                //win by diagonal
                if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
                {
                    retVal = true;
                }
                if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')
                {
                    retVal = true;
                }
        
                if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
                {
                    retVal = true;
                }
                if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')
                {
                    retVal = true;
                }
        
                return retVal;
    }

    public boolean isDraw()
    {
        boolean retVal = false;

        if(board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' '
        && board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' '
        && board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ')
        {
            retVal = true;
        }

        return retVal;
    }



}



