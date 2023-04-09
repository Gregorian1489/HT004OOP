public class Knight extends Warrior<Knife, Shield>{

    public Knight(String name, int hp, Knife weapon, Smallshield smallshield) {
        super(name, hp, weapon, smallshield);
    }

    public int getProtect(){
        return shield.protect();
    }
    @Override
    public String toString() {
        return "Knight []" + super.toString();
    }

    
    
}
