import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen. 
 * 
 * @author Felix
 * @version December 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        Label label = new Label("Press <space> to Start", 50);
        addObject(label,300,330);
        Label label2 = new Label("Use \u2190 \u2192 to Move", 50);
        addObject(label2,300,280);
    }
}
