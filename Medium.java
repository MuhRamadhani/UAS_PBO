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

        WallX wallX13 = new WallX();
        addObject(wallX13,701,335);
        WallX wallX14 = new WallX();
        addObject(wallX14,349,335);
        WallY wallY10 = new WallY();
        addObject(wallY10,435,320);
        WallY wallY11 = new WallY();
        addObject(wallY11,265,320);
        WallX wallX15 = new WallX();
        addObject(wallX15,552,335);
        wallX15.setLocation(555,335);
        WallX wallX16 = new WallX();
        addObject(wallX16,510,335);
        WallY wallY12 = new WallY();
        addObject(wallY12,435,592);
        WallY wallY13 = new WallY();
        addObject(wallY13,265,592);
        WallX wallX17 = new WallX();
        addObject(wallX17,202,383);
        WallX wallX18 = new WallX();
        addObject(wallX18,55,262);
        WallY wallY14 = new WallY();
        addObject(wallY14,265,221);
        WallX wallX19 = new WallX();
        addObject(wallX19,351,158);
        WallX wallX20 = new WallX();
        addObject(wallX20,55,164);
        WallY wallY15 = new WallY();
        addObject(wallY15,390,-5);
        WallX wallX21 = new WallX();
        addObject(wallX21,501,158);
        WallY wallY16 = new WallY();
        addObject(wallY16,265,188);
        WallY wallY17 = new WallY();
        addObject(wallY17,565,164);
        WallX wallX22 = new WallX();
        addObject(wallX22,760,101);
        WallX wallX23 = new WallX();
        addObject(wallX23,760,227);
    }
}
