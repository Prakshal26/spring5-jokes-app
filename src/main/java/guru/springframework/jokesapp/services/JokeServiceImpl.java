package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    /*
    We have taken maven dependency in pom <chuck-norris-for-actuator> which has implementation
    of this class.
     */
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        //Get random quote is the function present in ChuckNorrisQuotes class.
        return chuckNorrisQuotes.getRandomQuote();
    }
}
