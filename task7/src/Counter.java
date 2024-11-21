public class Counter {
    static int counterObject;

    Counter(){
        counterObject++;
    }

    public int getCounterObject() {
        return counterObject;
    }
}
