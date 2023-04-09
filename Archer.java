public class Archer extends Warrior<Throwing, Shield> {

    public Archer(String name, int hp, Throwing weapon, Bigshield bigshield) {
        super(name, hp, weapon, bigshield);
    }

    public int getRange(){
        return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer []" + super.toString();
    }

    
    
    
}
