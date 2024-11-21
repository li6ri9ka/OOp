import java.util.Random;


public class UniqueID {
private static int currentID = 0;
private int uniqueID;

    public static int generateID(){
        return currentID++;
    }

}
