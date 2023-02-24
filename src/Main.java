public class Main {
    public static void main(String[] args) {
        Fighter hasbulla=new Fighter("Hasbulla",15,100,90,5);
        Fighter connorMcgregor=new Fighter("Connor Mcgregor",10,95,100,0);
        Cage msg = new Cage(hasbulla,connorMcgregor,90,100);
        msg.run();
    }
}
