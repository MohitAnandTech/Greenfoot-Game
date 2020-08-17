import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor

{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int applesEaten;
    public GreenfootImage image1;
    public GreenfootImage image2;
 
    public Player()
    {
       
        image1 = new GreenfootImage("Player.png");
        image2 = new GreenfootImage("Player1.png");
        
        setImage(image1);
    }

    public void act()
    {

        movement();
        touch();
        apples_eaten();
      
        switchImage();
    

    }
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }

    public void movement()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-3);

        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(3);

        }
    }

    public void touch()
    {
        if ( isTouching(Apple.class) ) 
        {
            removeTouching(Apple.class);
            Greenfoot.playSound("Eat Chips.wav");
        }
    }

    public void apples_eaten()
    {
        int applesEaten=0;
        applesEaten=applesEaten+1;
        if (applesEaten == 10) 
        {
            Greenfoot.playSound("Ta Da.wav");
            Greenfoot.stop();
        }
    }
}

   