public class Main {
    
    public static void main(String[] args){

        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
//      archers.addPersons(new Archer("Robin", 100, new Bow(20)))
//          .addPersons(new Archer("Bobin", 100, new Bow(15)));
//      knights.addPersons(new Knight("Jack", 150, new Knife()))
//          .addPersons(new Knight("John", 150, new Knife()));

        Knight knight1 =  new Knight("Robin", 100, new Knife() , new Smallshield());
        Knight knight2 =  new Knight("Bobin", 90, new Knife(), new Smallshield());            

        Battle fight = new Battle(knight1,knight2);
        fight.run();
    }
}
