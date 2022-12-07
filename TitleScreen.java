import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen. 
 * 
 * @author Felix
 * @version December 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 230, 140);
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
        addObject(elephant,462,97);
        elephant.setLocation(455,103);
        elephant.setLocation(429,124);
        elephant.setLocation(461,127);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,297,286);
        label.setLocation(346,299);
        label.setLocation(301,291);
        label.setLocation(301,291);
        Label label2 = new Label("Use <-- and --> to Move", 40);
        addObject(label2,304,247);
        elephant.setLocation(450,135);
        label2.setLocation(343,237);
        label.setLocation(337,297);
    }
}
