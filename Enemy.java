import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

       
        move(Greenfoot.getRandomNumber(15));

        if(isAtEdge())
        {
            turn(25);
        }
        if ( isTouching(Player.class) ) 
        {
            removeTouching(Player.class);

            Greenfoot.playSound("Sad.wav");

            Greenfoot.stop();
        }
    }  

}
