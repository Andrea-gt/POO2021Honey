import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * Write a description of class MC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MC extends Actor
{
        public void act(){
        if (Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            move(5);
        }
        if (isTouching(honey.class))
        {
            World mundo = getWorld();
            game Game = (game) mundo;
            Counter counter = Game.getCounter();
            counter.addScore(1);
            removeTouching(honey.class);
        }
        if (isTouching(Bee.class))
        {
            World mundo = getWorld();
            game Game = (game) mundo;
            Health health = Game.getHealth();
            if (health.health >0)
            {
            health.loseHealth();
            }
            else if(health.health<=0)
            {
            
            }
            removeTouching(Bee.class);
        }
    }
}
    
