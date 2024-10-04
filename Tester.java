package TicTacToe;
import java.util.Scanner;
public class Tester 
{
    public static void main (String[] args)
    {
        Tictactoe game = new Tictactoe();
        Scanner kbd = new Scanner(System.in);
        String restart;
        int row;
        int column;

        System.out.println("Hello! Welcome to a game of tic-tac-toe!");

        do
        {            
            while(true)
            {
                System.out.print("What row does Player " + game.getPlayer() + " want?: ");
                row = kbd.nextInt();

                while(game.OutofBoundsRow(row))
                {
                    System.out.println("The number inputted is not between 1 and 3");
                    System.out.print("Please input a number between 1 and 3 for the row:");
                    row = kbd.nextInt();
                }

                System.out.print("What column does Player " + game.getPlayer() + " want?: ");
                column = kbd.nextInt();

                while(game.OutofBoundsColumn(column))
                {
                    System.out.println("The number inputted is not between 1 and 3");
                    System.out.print("Please input a number between 1 and 3 for the column:");
                    column = kbd.nextInt();
                }

                while(game.isTaken(row, column))
                {
                    System.out.println("The slot is already taken. Please input new numbers");
                    
                    System.out.print("What row does Player " + game.getPlayer() + " want?: ");
                    row = kbd.nextInt();
    
                    while(game.OutofBoundsRow(row))
                    {
                        System.out.println("The number inputted is not between 1 and 3");
                        System.out.print("Please input a number between 1 and 3 for the row:");
                        row = kbd.nextInt();
                    }
    
                    System.out.print("What column does Player " + game.getPlayer() + " want?: ");
                    column = kbd.nextInt();
    
                    while(game.OutofBoundsColumn(column))
                    {
                        System.out.println("The number inputted is not between 1 and 3");
                        System.out.print("Please input a number between 1 and 3 for the column:");
                        column = kbd.nextInt();
                    }

                }

                game.input(row, column);
                game.showBoard();

                if(game.isWin())
                {
                    System.out.println("Player " + game.getPlayer() + " win!");
                    break;
                }

                if(game.isDraw())
                {
                    System.out.println("The gaem ended in a draw");
                    break;
                }

                game.player_switch();

            }

            kbd.nextLine();
            System.out.print("Do you want to restart the game? [Y or y]: ");
            restart = kbd.nextLine();

        }while(restart.charAt(0) == 'Y' || restart.charAt(0) == 'y');

        kbd.close();

    }
}
