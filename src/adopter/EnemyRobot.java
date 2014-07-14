/**
 * 
 */
package adopter;

import java.util.Random;

/**
 * @author jitendra
 * 
 */
public class EnemyRobot
{

    Random generator = new Random();

    public void smashWithHand()
    {
	int attackDamage = generator.nextInt(10) + 1;
	System.out.println("Enemy robot causes " + attackDamage + "damage with its hands");

    }

    public void walkForward()
    {
	int move = generator.nextInt(5) + 1;
	System.out.println("Enemy robot walks " + move + "spaces");
    }

    public void reactToHuman(String driverName)
    {
	System.out.println("Enemy robot tramps on " + driverName);
    }
}
