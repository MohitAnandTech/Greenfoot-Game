import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spinach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spinach extends Actor
{
    /**
     * Act - do whatever the Spinach wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         move(Greenfoot.getRandomNumber(8));
       if(isAtEdge())
        {turn(50);} // This turns the apple at 50 degree whenever it touches the edge.
        turn(Greenfoot.getRandomNumber(15)-5);
           }    
      }
