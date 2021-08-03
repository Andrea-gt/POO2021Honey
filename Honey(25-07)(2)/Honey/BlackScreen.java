import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackScreen extends World
{
    public BlackScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        addObject(new GameOver(), 400,230);
    }
}