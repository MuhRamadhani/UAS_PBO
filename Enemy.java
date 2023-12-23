import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        getImage().scale(75, 75);
    }
    public int speed = 2;
    public void act()
    {
        atWall();
    }
    public void atWall()
    {
        Actor wall = getOneIntersectingObject(WallX.class);
        if (wall != null){
            speed = -speed;
        }
    }
}
