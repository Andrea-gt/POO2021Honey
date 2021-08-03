import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class game extends World

{
    private int spawnTimer;
    Counter counter = new Counter();
    Health health = new Health();
    public void act(){
        newHoney();
        newBee();
    }
    public game()
    {
        super (800, 500, 1);
        prepararJuego();
    }
        public Counter getCounter()
    {
        return counter;
    }
    public Health getHealth()
    {
        return health;
    }
    private void prepararJuego()
    {
        addObject(new MC(), 400,350);
        addObject(new Counter(), 50,50);
        addObject(health, 60,70);
    }
    public void newHoney()
    {
            int x = Greenfoot.getRandomNumber(200);
            if(x == 50)
            {   
            addObject(new honey(),Greenfoot.getRandomNumber(800),25);
            }
    }  
    public void newBee()
    {
            int x = Greenfoot.getRandomNumber(200);
            if(x == 100)
            {   
            addObject(new Bee(),Greenfoot.getRandomNumber(800),25);
            }
    }  
}

