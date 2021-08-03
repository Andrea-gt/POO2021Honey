import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy = -20;
    int g = 1; 
    public void act()
    { 
        setLocation(getX(),getY()+ g);
        dy = dy + g;
        /*if (MainC != null){
            World mundo = getWorld();
            game Game = (game) mundo;
            Counter counter = Game.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (isAtEdge()){
         getWorld().removeObject(this);
        }*/
        if (isAtEdge()){
         getWorld().removeObject(this);
        }
    }
    }
    
