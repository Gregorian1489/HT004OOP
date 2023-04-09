public class Bigshield implements Shield{

    @Override
    public int protect() {
        return 5;
    }
    
    @Override
    public String toString() {
        return "Bigshield []" + 
        "protect " + protect();
    }
}