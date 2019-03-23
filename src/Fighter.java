import java.util.*;

public class Fighter {
    private String name;
    private double height;
    private int weight;
    public int health;
    private int damagePerAttack;

    public int Attack()
    {
        Random random = new Random();

        do {
            damagePerAttack = random.nextInt(15);
        } while(damagePerAttack == 0);

        System.out.println(name + " attacked with " + damagePerAttack);
        System.out.println("Current health: " + health + " for " + name + ".");
        System.out.println();
        return damagePerAttack;
    }

    public void DisplayFighter()
    {
        System.out.println("Fighter name: " + name);
        System.out.println("Height: " + height + "m.");
        System.out.println("Weight: " + weight + " kg.");
        System.out.println();
    }

    public void IntroduceFighters()
    {
        Scanner introducing = new Scanner(System.in);
        System.out.println("Introduce the figther: ");
        System.out.println();

        System.out.println("Introduce the name: ");
        name = introducing.next();

        System.out.println("Introduce the height: ");
        height = introducing.nextDouble();

        System.out.println("Introduce the weight: ");
        weight = introducing.nextInt();

        System.out.println("Introduce the health: ");
        health  = introducing.nextInt();

        System.out.println();
    }

    public String Winner()
    {
        System.out.println("The winner is " + name);
        return name;
    }
}
