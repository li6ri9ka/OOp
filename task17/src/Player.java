public class Player{
    private final String name;
    private int score = 0;
    private int health = 300;
    private int level = 1;
    private int damage = 50;
    private int kill = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getlevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public void strikeABlow(Enemy enemy){
        if (isAlive()){
            if(!enemy.isAlive()){
                kill++;
                scoreIncrease();
            }
            else {
                enemy.takeDamage(damage);
            }
        }
        else{
            System.out.println("You are dead");
        }
    }

    public void healPlayer() {
        health += 200;
        System.out.println("Ваше здоровье восстановлено");
        System.out.println("----------------------------------");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println("Вам нанесен урон: " + damage + "\nЗдоровье: " + health);
        System.out.println("----------------------------------");
    }

    public void levelUp(){
        if (score >= 400 && score % 2 == 0){
            level++;
        }
    }

    public int scoreIncrease(){
        score = kill * 100;
        levelUp();
        return score;
    }

    public void infoPlayer(){
        System.out.println("Количество очков: " + getScore());
        System.out.println("Здоровье: "+getHealth());
        System.out.println("Уровень: "+getlevel());
        System.out.println("Урон: "+getDamage());
        System.out.println("Убийства: "+getKill());
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy("Ghost",300,100);
        Enemy enemy1 = new Enemy("Ghost",300,100);
        Enemy enemy2 = new Enemy("Ghost",300,100);
        Player player = new Player("Imperator");
        Weapon weapon = new Weapon("TT",222);
        enemy.attack(player);
        player.strikeABlow(enemy);
        enemy.attack(player);
        enemy.attack(player);
        player.healPlayer();
        player.strikeABlow(enemy);
        player.strikeABlow(enemy);
        player.strikeABlow(enemy);
        player.strikeABlow(enemy);
        player.strikeABlow(enemy);
        player.strikeABlow(enemy);
        player.infoPlayer();
        player.infoPlayer();
        player.strikeABlow(enemy1);
        weapon.struckWithAWeapon(player);
        player.strikeABlow(enemy1);
        player.strikeABlow(enemy1);














    }
}
