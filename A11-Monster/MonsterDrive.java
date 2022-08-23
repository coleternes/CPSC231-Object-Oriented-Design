/* Name: Cole Ternes
 * ID: 2323955
 */
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MonsterDrive {
  //Main Method
  /** Main method
   * @param args An array of strings
   */
  public static void main(String[] args) {
    //Creates an ArrayList of Monsters
    List<AbstractMonster> monsterList = new ArrayList<AbstractMonster>();

    //Monsters
    AbstractMonster z1 = new Zombie("Zoey", "Graveyard", 2019, "Rock");
    AbstractMonster v1 = new Vampire("Velma", "Transylvania", 1880, 673);
    AbstractMonster w1 = new Werewolf("Will", "London", "Corgi", 2);

    //Add the newly created monsters into the list
    monsterList.add(z1);
    monsterList.add(v1);
    monsterList.add(w1);

    //Shuffle the list
    Collections.shuffle(monsterList);

    //For-Loop to traverse the monsterList
    for (int i = 0; i < monsterList.size(); i++) {
      System.out.println("\nMonster #" + (i+1));
      //Gets currentMonster
      AbstractMonster currentMonster = monsterList.get(i);
      //Prints Monster Name
      System.out.println("Name: " + currentMonster.getName());
      //Prints Monster Type
      if (currentMonster instanceof Zombie) {
        System.out.println(currentMonster.getName() + " is a Zombie.");
      } else if (currentMonster instanceof Vampire) {
        System.out.println(currentMonster.getName() + " is a Vampire.");
      } else if (currentMonster instanceof Werewolf) {
        System.out.println(currentMonster.getName() + " is a Werewolf.");
      } else {
        System.out.println("Monster Error #" + i);
      }
      //Prints Monster Speech
      System.out.print(currentMonster.getName() + " says \"");
      currentMonster.speak();
      //PRints Monster Diet
      System.out.print("Diet: ");
      currentMonster.diet();
      //Prints Monster Specifics
      if (currentMonster instanceof Zombie) {
        Zombie tmp = (Zombie)currentMonster;
        System.out.println("Favorite Weapon: " + tmp.getWeapon());
      } else if (currentMonster instanceof Vampire) {
        Vampire tmp = (Vampire)currentMonster;
        System.out.println("Number of Victims: " + tmp.getVictims());
      } else if (currentMonster instanceof Werewolf) {
        Werewolf tmp = (Werewolf)currentMonster;
        System.out.println("Days until Transformation: " + tmp.getTransformation());
      } else {
        System.out.println("Monster Error #" + i);
      }
    }
  }
}
