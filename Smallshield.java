public class Smallshield implements Shield{

    @Override
    public int protect() {
        return 2;
    }
    
    @Override
    public String toString() {
        return "Smallshield []" + 
        "protect " + protect();
    }
}
