public class Battle {
    private Warrior attacker;
    private Warrior definder;
    
    public Battle(Warrior attacker, Warrior definder) {
        this.attacker = attacker;
        this.definder = definder;
    }

    public Warrior run(){
        while (true){
            int attack = attacker.Harm();
            int protect = definder.protect();
            definder.reduceHP(attack, protect);
            System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n", attacker.getName(), attack, definder.getName(), definder.getHp());
            if (!definder.isAlive()){
                System.out.printf("Warrior %s is dead, %s winner", definder.getName(),attacker.getName());
                return attacker;
            } 
            attack = definder.Harm();
            protect = definder.protect();
            attacker.reduceHP(attack, protect);
            System.out.printf("Warrior %s return harm %d\n Warrior %s %d HP\n", definder.getName(), attack, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()){
                System.out.printf("Warrior %s is dead, %s winner", attacker.getName(),definder.getName());
                return definder;
            } 
        }
    }

    
}
