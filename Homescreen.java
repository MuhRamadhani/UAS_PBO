import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Homescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homescreen extends World
{
    private GreenfootImage judul = new GreenfootImage("Judul.png");
    /**
     * Constructor for objects of class Homescreen.
     * 
     */
    public Homescreen()
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
        
        ////home
        Judul judul = new Judul();
        addObject(judul,400,150);
        
        addObject(new Start(), 400, 300);
        // addObject(new Restart(), 400, 375);
        addObject(new Petunjuk(), 400, 375); //400,450
        addObject(new Quit(), 400, 450); // 400,525
    }
}
