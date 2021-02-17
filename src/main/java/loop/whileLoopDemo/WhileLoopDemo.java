package loop.whileLoopDemo;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int counter = 1;
        while (counter < 11) {
            System.out.println("counter is:" + counter);
            counter++;
        }

        while (true){
            System.out.println("never end loop");
        }
    }
}
