import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant hates bananas! If the elephant eats bananas, you lose a point.
 * 
 * @author Felix
 * @version December 2022
 */
public class Banana extends Actor
{
    int speedBanana = 1;
    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Banana falls down
        int xB = getX();
        int yB = getY() + speedBanana;
        setLocation(xB, yB);
        
        // Remove banana if it gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speedBanana = spd;
    }
}
