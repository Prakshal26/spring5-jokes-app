package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    /*
    This is the main part that will interact with html/web browser.
    in model.addAttribute we have given "joke" so whenever in html file namely chucknorris will see "joke" this
    model will be called and it will call getJoke method of JokeService class.
    We have given implementation of that method in Service class and will return some random joke.
    As we are returning chucknorris that means html file chucknorris. In resources we have created a
    html file in namely chucknorris so it will return to that file.
    In that html file in parapagraph tag under th: we have given joke. so it will see this joke and
    it will call the getJoke function.
     */
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }


}
