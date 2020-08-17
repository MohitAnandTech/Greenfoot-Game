import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 500, 1); 
        prepare();
          
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Apple apple = new Apple();
        addObject(apple,732,163);
        Apple apple2 = new Apple();
        addObject(apple2,869,157);
        Apple apple3 = new Apple();
        addObject(apple3,647,278);
        Apple apple4 = new Apple();
        addObject(apple4,35,391);
        Apple apple5 = new Apple();
        addObject(apple5,226,255);
        Apple apple6 = new Apple();
        addObject(apple6,429,282);
        Apple apple7 = new Apple();
        addObject(apple7,308,470);
        Apple apple8 = new Apple();
        addObject(apple8,39,240);
        Apple apple9 = new Apple();
        addObject(apple9,888,366);
        Apple apple10 = new Apple();
        addObject(apple10,686,466);
        Player player = new Player();
        addObject(player,218,457);
        Enemy enemy = new Enemy();
        addObject(enemy,825,451);
    }
}
