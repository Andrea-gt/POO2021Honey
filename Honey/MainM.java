import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainM extends World
{

     GreenfootSound backgroundMusic = new GreenfootSound("GreenFootMusic.mp3");
    public MainM()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        backgroundMusic.playLoop();
        prepararMundo();
    }
    private void prepararMundo(){
        addObject(new Start(), 400,350);
        addObject(new Titulo(), 400,230);
    }
    public void act(){
        if (Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new game());
        }
        
    }
}

