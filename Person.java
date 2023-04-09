public abstract class Person {
    
    private String name;
    private int hp;

    public Person (String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    
    public boolean isAlive(){
        return hp > 0;
    }
    public void reduceHP(int damage, int protect){
        hp -= damage  - protect;
        if (hp < 0){
            hp = 0;
        }
    }
}