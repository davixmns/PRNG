package alisson;

public class Main {
    public static void main(String args[]) {
        Random rand = new LCG();
        for(int i=0; i < 6; i++) {
            System.out.print(rand.randomInt(1, 60)+" ");
        }
    }
}