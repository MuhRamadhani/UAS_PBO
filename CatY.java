import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatY extends Enemy
{
    /**
     * Act - do whatever the CatY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        setLocation(getX(), getY() + speed);
    }
}
