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
    GameOver gameover = new GameOver();
    private Counter counter;
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
            counter = Game.getCounter();
            counter.addScore();
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
            Greenfoot.setWorld(new BlackScreen());
            Greenfoot.stop();
            }
            removeTouching(Bee.class);
        }
    }
}
    
