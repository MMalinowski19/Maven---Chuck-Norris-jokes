package MyMavenTraining;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());

    }
}
