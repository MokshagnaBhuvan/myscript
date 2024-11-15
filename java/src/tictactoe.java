import java.util.*;
public class tictactoe {
    private char character;
    private char[][] array;
    private Scanner sc;
    public int row,col,counter=0;
    public boolean x;

    public static void main(String[] args){
        tictactoe game = new tictactoe();
        // game.check();
        game.playgame();
        // System.out.println(array.length);
        // System.out.println("Enter the character");
        

    }
    public tictactoe(){
        sc = new Scanner(System.in);
        array = new char[3][3];
        x=false;
    }
    public void playgame(){
        
        



while(!x){
    System.out.println("Enter the character ");
    character = sc.next().charAt(0);
    System.out.println("At pos(x,y)");
    row = sc.nextInt();
    col = sc.nextInt();
    insertChar(character,row,col);
    display();
    check();
}




    }
    public void display(){
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length;j++){
                if(array[i][j]=='\0'){
                    array[i][j]='-';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void check(){
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') ||
                (array[0][i] == array[1][i] && array[1][i] == array[2][i] && array[0][i] != '-')) {
                x=true;
                if(array[i][0]=='x'){
                    System.out.println("x won the game");
                    x = false;
                }
                else{
                    System.out.println("o won the game");
                    x=false;
                }
            }
        }
        // Check diagonals
        if ((array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[0][0] != '-') ||
            (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[0][2] != '-')) {
            x= true;
            if(array[1][1]=='x'){
                System.out.println("x won the game");
                x=false;
            }
            else{
                System.out.println("o won the game");
                x  = false;
            }
        }
        else{
x =false;

        } 
        }
    
    
    public void insertChar(char character,int row, int col){
        
        if(array[row][col] != 'x' && array[row][col] != 'X' && array[row][col] != 'o' && array[row][col] != 'O'){
            array[row][col] = character;
            counter++;
            

        }
    }
    }
    
    


