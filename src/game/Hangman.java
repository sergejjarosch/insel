package game;

public class Hangman {
    public static void hangman_out() {
        System.out.print("Welches word soll erraten werden? : ");
        String hangmanWord = new java.util.Scanner( System.in ).nextLine();
        String usedChars = "";

        String guessedWord = "";
        for ( int i = 0; i < hangmanWord.length(); i++ )
            guessedWord += "_";

        for ( int guesses = 0; ; guesses++ ) {
            if ( guesses == 10 ) {
                System.out.printf("Sorry, game over after 10 attemts ! By the way, the " +
                        "word was '%s.'", hangmanWord );
                break;
            }
            System.out.printf("Round %d. Previous guess: '%s'. What character do you choose?%n",
                    guesses, guessedWord );
            char guassedChar = new java.util.Scanner(System.in ).next().charAt( 0 );

            if ( usedChars.indexOf( guassedChar ) >= 0 )
                System.out.printf(" '%c' you have entered before!%n", guassedChar );
            else { // Character has not been used yet
                usedChars += guassedChar;
                // hangmanWord.indexOf( c ) == -1
                if ( hangmanWord.indexOf( guassedChar ) >= 0 ) {
                    guessedWord = "";
                    for ( int i = 0; i < hangmanWord.length(); i++ )
                        guessedWord += usedChars.indexOf( hangmanWord.charAt( i ) ) >= 0 ?
                                    hangmanWord.charAt( i ) : "_";

                    if ( guessedWord.contains( "_" ) )
                        System.out.printf( "Good guess, '%s' can be found in the word. "+
                                        "But there's something missing!%n", guassedChar );
                    else {
                        System.out.printf("Congratulation, you have guessed the word '%s'!", hangmanWord);
                        break;
                    }
                }
                else {
                    System.out.printf("Bad luck, << %c >> does not occur in the word!%n", guassedChar);
                }
            }
        }
    }
}
