import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BNext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BNext extends Button
{
    /**
     * Act - do whatever the BNext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Difficulty());
        }
    }
}
