import java.util.Random;

public class Test2 {

    public int random(int x) {
        return new Random().nextInt(x + 1);
    }

    public int[] randomArray() {
        int size = random(98) + 2;
        int [] array = new int[size];
        for (int i : array) {
            array[i] = random(size - 2) + 1;
        }
        return array;
    }

    public int findDup(int[] array) {
        int[] existInt = new int[array.length];
        for (int i: array) {
            if (existInt[array[i]] == 1) return array[i];
            existInt[array[i]] = 1;
        }
        return 0;
    }
}
