import java.util.List;

public class Enemy {
    private final String name;
    private int health;
    private int damage;


    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }



    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Вы нанесли удар: "+name+"\nНанесенный урон: " + damage+ "\nЗдоровье: " + health);
        System.out.println("----------------------------------");
        if(!isAlive()){
            System.out.println(name + " Dead");
        }
        System.out.println("----------------------------------");
    }

    public void attack(Player player) {
        if(player.isAlive()){
            player.takeDamage(damage);
        }

    }

    public boolean isAlive() {
        return health > 0;
    }


    public void infoEnemy(){
        System.out.println("Здоровье - "+getHealth());
        System.out.println("Урон - " + getDamage());
    }
}
