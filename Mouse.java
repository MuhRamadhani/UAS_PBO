import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lives = 3;
    private int score;
    private int timer;
    
    public Mouse(){
        getImage().scale(100,60);
    }
    public void act()
    {
        showStatus();
        updateTimer();
        moveMouse();
        eatFood();
        caughtCat();
        winTheGame();
        Pindah();
    }
    int no = 1;
    int delay = 5;
    public void animate(){
        if(delay < 5){
            delay++;
            return;
        }
        delay = 0;
        if(no == 3){
            no = 1;
        } else{
            no++;
        }
        this.setImage(new GreenfootImage("rat"+no+".png"));
        getImage().scale(100,60);
    }
    public void moveMouse()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
            //setRotation(360);
            animate();
            Actor wall = getOneIntersectingObject(WallX.class);
            if (wall != null)
            {
                setLocation (getX()-4,getY());
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
            //setRotation(180);
            animate();
            Actor wall = getOneIntersectingObject(WallX.class);
            if (wall != null)
            {
                setLocation (getX()+4,getY());
            }
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
            //setRotation(90);
            animate();
            Actor wall = getOneIntersectingObject(WallX.class);
            if (wall != null)
            {
                setLocation (getX(),getY()-4);
            }
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
            //setRotation(-90);
            animate();
            Actor wall = getOneIntersectingObject(WallX.class);
            if (wall != null)
            {
                setLocation (getX(),getY()+4);
            }
        }
    }
    public void Pindah()
    {
        if(isTouching(Portal.class)){
            Greenfoot.setWorld(new ZWin());
        }
    }
    public void eatFood()
    {
        if(isTouching(Food.class)){
            removeTouching(Food.class);
            score+=10;
        }
    }
    public void caughtCat()
    {   
        if(isTouching(Cat.class)){
            setLocation(70,530);
            setRotation(0);
            dead();
        }
    }
    public void dead()
    {
        if(lives >=1){
            lives--;
            timer = 1000;
            loseTheGame();
            showStatus();
        }
    }
    public void showStatus()
    {
        getWorld().showText("Lives : "+lives, 725, 530);
        getWorld().showText("Score : "+score, 725, 550);
    }
    public void updateTimer()
    {
        if(lives >= 1){
            timer--;
        }
        getWorld().showText("Time Left = "+timer, 725, 570);
        if(timer < 1){
            dead();
        }
    }
    public void winTheGame()
    {
        if(isTouching(Portal.class)){
            // getWorld().addObject(new Win(), 400, 500);
            // getWorld().addObject(new Playagain(), 400, 500);            
        }
    }
    public void loseTheGame()
    {
        if(lives <= 0){
            // getWorld().removeObject(this);
            Greenfoot.setWorld(new ZLose());
            // getWorld().addObject(new Playagain(), 400, 500);
            // getWorld().addObject(new Playagain(), 400, 500);
        }
    }
}   
