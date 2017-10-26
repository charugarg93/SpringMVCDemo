package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class GameController {


    @RequestMapping("/play")
    public String playGame(HttpSession httpSession){
        GameService game = new GameService();
        httpSession.setAttribute("game",game);
        return "display";

    }

    @RequestMapping(value = "/game/play", method = RequestMethod.POST)
    public String play(@RequestParam("guess") int guess, HttpSession httpSession, Model model){
        GameService game = (GameService)httpSession.getAttribute("game");
        game.play(guess);
        model.addAttribute("attempts","Attempts: "+ game.getAttempts());
        model.addAttribute("message", game.getMessage());
        if(game.isGameOver()){
            return "gameover";
        }
        return "display";
    }

}

