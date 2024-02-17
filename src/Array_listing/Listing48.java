package Array_listing;

public class Listing48 {
    static void printLetter( char[] [] letter ){
        for ( int column = 0; column < letter[0].length; column++ ) {
            for ( int line = letter.length - 1; line >= 0; line--)
                System.out.print( letter[line][column] );
            System.out.println();
        }
    }
    static void printZero() {
        char [][] zero = {  {' ', '#', ' '},
                            {'#', ' ', '#'},
                            {'#', ' ', '#'},
                            {'#', ' ', '#'},
                            {'#', ' ', '#'},
                            {'#', ' ', '#'},
                            {' ', '#', ' '} };
        printLetter( zero );
    }
    static void printOne() {
        char[][] one = {{' ', '#'},
                        {'#', '#'},
                        {' ', '#'},
                        {' ', '#'},
                        {' ', '#'},
                        {' ', '#'},
                        {' ', '#'}};
        printLetter(one);
    }
}
