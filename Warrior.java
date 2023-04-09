import java.util.Random;

public class Warrior<T extends Weapon, Y extends Shield> extends Person {

    protected T weapon;
    protected Y shield;
    protected static Random rand = new Random(); 
        
    

    public Warrior(String name, int hp, T weapon, Y shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int Harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rand.nextInt(weapon.damage() + 1);
        } 
        return damage;
    }
    public int protect(){
        return shield.protect();
    }


    @Override
    public String toString() {
        return "name = " + getName()
                + " HP " + getHp() + 
                " weapon " + weapon +
                " protect " + shield;
    }
    
    
}
