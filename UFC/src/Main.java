public class Main {
    public static void main(String[] args) {
        Fighter mikeTyson=new Fighter("Mike_Tyson",15,100,90,5);
        Fighter georgeForeman=new Fighter("George Foreman",10,95,100,0);
        Ring msg = new Ring(mikeTyson,georgeForeman,90,100);
        msg.run();
    }
}
