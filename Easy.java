import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Easy()
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

        ////easy
        addObject(new Mouse(), 80, 530);

        addObject(new Food(), 390, 460);
        addObject(new Food(), 70, 300);
        addObject(new Food(),250, 100);
        addObject(new Food(),560, 100);
        addObject(new Food(),550, 500); 

        addObject(new Portal(), 715, 60);

        addObject(new Cat(), 300, 300);

        //wall stage

        WallX wallX13 = new WallX();
        addObject(wallX13,97,464);
        WallX wallX14 = new WallX();
        addObject(wallX14,245,463);
        wallX14.setLocation(270,465);
        wallX14.setLocation(270,465);
        WallY wallY10 = new WallY();
        addObject(wallY10,480,502);
        wallX14.setLocation(245,464);
        WallY wallY11 = new WallY();
        addObject(wallY11,444,418);
        wallY11.setLocation(480,430);
        WallX wallX15 = new WallX();
        addObject(wallX15,324,367);
        WallX wallX16 = new WallX();
        addObject(wallX16,228,365);
        wallX16.setLocation(231,367);
        WallX wallX17 = new WallX();
        addObject(wallX17,230,231);
        WallX wallX18 = new WallX();
        addObject(wallX18,380,231);
        WallY wallY12 = new WallY();
        addObject(wallY12,167,164);
        WallY wallY13 = new WallY();
        addObject(wallY13,325,80);
        wallX18.setLocation(400,231);
        WallX wallX19 = new WallX();
        addObject(wallX19,300,231);
        WallY wallY14 = new WallY();
        addObject(wallY14,486,168);
        WallY wallY15 = new WallY();
        addObject(wallY15,646,95);
        WallX wallX20 = new WallX();
        addObject(wallX20,680,349);
        removeObject(wallX20);
        WallY wallY16 = new WallY();
        addObject(wallY16,646,244);
        WallX wallX21 = new WallX();
        addObject(wallX21,417,367);
    }
}
