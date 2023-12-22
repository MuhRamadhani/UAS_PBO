import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Medium()
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

        addObject(new WallX(), 717, 468);

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

        addObject(new WallY(), 638, 531);

        //bgscore
        addObject(new Bgscore(), 725, 540);

        ////medium
        addObject(new Mouse(), 700, 395);

        //addObject(new Food(), 250, 250);
        //addObject(new Food(), 500, 500);

        addObject(new Portal(), 350, 275);
        
        //Labirin
        addObject(new WallX(),  55, 262);
        addObject(new WallX(),  55, 164);
        addObject(new WallX(), 202, 383);
        addObject(new WallX(), 349, 335);
        addObject(new WallX(), 351, 158);
        addObject(new WallX(), 501, 158);
        addObject(new WallX(), 510, 335);
        addObject(new WallX(), 555, 335);
        addObject(new WallX(), 701, 335);
        addObject(new WallX(), 760, 101);
        addObject(new WallX(), 760, 227);
        
        addObject(new WallY(), 265, 320);
        addObject(new WallY(), 265, 592);
        addObject(new WallY(), 265, 221);
        addObject(new WallY(), 265, 188);
        addObject(new WallY(), 390,  -5);
        addObject(new WallY(), 435, 320);
        addObject(new WallY(), 435, 592);
        addObject(new WallY(), 565, 164);
        
    }
}
