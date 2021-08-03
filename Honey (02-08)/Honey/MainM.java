import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainM extends World
{
    Button button = new Button();
    private int opcion = 0;
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
        addObject(new Quit(), 410,550);
        addObject(button, 300,370);
    }
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0){opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1){opcion--;} 
        if (opcion >=2) opcion = 0;
        if (opcion <0) opcion = 1;
        button.setLocation(300,370 + (opcion*80));
        if (Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //start
                    Greenfoot.setWorld(new game());
                    break;
                case 1://quit
                    Greenfoot.stop();
                    break;
            }
        }
        }
}
   
