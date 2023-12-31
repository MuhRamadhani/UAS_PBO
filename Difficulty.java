import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Startscreen.
     * 
     */
    public Difficulty()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    public void prepare(){
        //WallX Top
        addObject(new WallX(), 70, 12);
        addObject(new WallX(), 220, 12);
        addObject(new WallX(), 370, 12);
        addObject(new WallX(), 520, 12);
        addObject(new WallX(), 670, 12);
        addObject(new WallX(), 790, 12);

        //WallX Bottom
        addObject(new WallX(), 70, 588);
        addObject(new WallX(), 220, 588);
        addObject(new WallX(), 370, 588);
        addObject(new WallX(), 520, 588);
        addObject(new WallX(), 670, 588);
        addObject(new WallX(), 790, 588);

        //WallY Left
        addObject(new WallY(), 12, 70);
        addObject(new WallY(), 12, 220);
        addObject(new WallY(), 12, 370);
        addObject(new WallY(), 12, 520);

        //WallY Right
        addObject(new WallY(), 788, 70);
        addObject(new WallY(), 788, 220);
        addObject(new WallY(), 788, 370);
        addObject(new WallY(), 788, 520);

        ////difficulty
        addObject(new aBack  (), 90 , 50);
        addObject(new Difficult(), 400, 150);
        addObject(new zEasy  (), 176, 375);
        addObject(new zMedium(), 400, 375);
        addObject(new zHard  (), 624, 375);
    }
}
