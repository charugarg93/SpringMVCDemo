package com.example.demo.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlRootElement;

@Component
@Scope("session")
public class GameService {

    private int target;
    private int attempts;
    private String message;
    private boolean gameOver;

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }



    public GameService(){
        target = (int)(Math.random()*1000);
        System.out.println("Game object created with target " + target);
    }



    public void play(int guess){
        attempts++;
        if(guess > target)
            message = "Aim Lower";
        else if(guess < target)
            message = "Aim Higher";
        else {
            message = "You've got it!!!";
            gameOver = true;
        }
    }

}
