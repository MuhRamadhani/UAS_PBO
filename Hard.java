import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Hard()
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

        ////level 3

        addObject(new Food(), 300, 400);
        addObject(new Food(), 478, 525);
        addObject(new Food(), 565, 285);
        addObject(new Food(), 400, 285);
        addObject(new Food(), 200, 285);
        addObject(new Food(),  85, 225);
        addObject(new Food(), 290, 137);
        addObject(new Food(),  90,  75);
        addObject(new Food(), 633, 75);
        
        
        addObject(new Mouse(), 80, 530);
        addObject(new Portal(), 715, 400);
        addObject(new Cat(),  90, 400);
        addObject(new Cat(), 417, 281);
        addObject(new Cat(),  90,  74);

        // Map
        addObject(new WallY(), 638, 389);
        addObject(new WallY(), 638, 245);
        addObject(new WallY(), 638, 200);
        addObject(new WallY(), 304, 526);
        addObject(new WallY(), 478, 403);

        addObject(new WallX(), 574, 137);
        addObject(new WallX(), 431, 137);
        addObject(new WallX(), 150, 137);
        addObject(new WallX(),  90, 137);
        addObject(new WallX(),  83, 464);
        addObject(new WallX(), 392, 340);
        addObject(new WallX(), 284, 340);
        addObject(new WallX(), 136, 340);
        addObject(new WallX(),  87, 340);
        addObject(new WallX(), 414, 225);
        addObject(new WallX(), 220, 225);
        addObject(new WallX(), 265, 225);
    }
}
