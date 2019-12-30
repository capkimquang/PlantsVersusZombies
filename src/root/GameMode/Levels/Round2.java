package root.GameMode.Levels;

import root.GUI.GamePanel;
import root.GUI.IconButton;
import root.entities.plants.Repeater;
import root.entities.plants.SnowPea;
import root.entities.zombies.BucketHeadZombie;
import root.entities.zombies.ConeHeadZombie;

public class Round2 extends Round1 {

  public Round2(GamePanel gamePanel) {
    super(gamePanel);

    //zombie
    zombieClasses.add(ConeHeadZombie.class);
    zombieClasses.add(BucketHeadZombie.class);

    //plant
    plantClasses.add(SnowPea.class);
    cards.add(new IconButton(gamePanel.visualMode.SnowPeaCardIcon, gamePanel.visualMode.GameDim.width * 28 / 90,
        gamePanel.visualMode.GameDim.height / 67, gamePanel.visualMode.SnowPeaCardImage, gamePanel));

    plantClasses.add(Repeater.class);
    cards.add(new IconButton(gamePanel.visualMode.RepeaterCardIcon, gamePanel.visualMode.GameDim.width * 34 / 90,
        gamePanel.visualMode.GameDim.height / 67, gamePanel.visualMode.RepeaterImage, gamePanel));

    MAX_ZOMBIES = 20;
  }
}
