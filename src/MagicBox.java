import java.util.Random;

public class MagicBox<T> {

    private int size;

    private T[] items;
    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {

        for (int j = 0; j < items.length; j++) {
            if (items[j] == null) {
                items[j] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int elements = 0;
        for (T e : items) {
            if (e == null) {
                elements++;
            }
        }
        if (elements != 0) {
            System.out.println();
            System.out.println("Что ж! Не заполнена полностью коробка, осталось заполнить всего " + elements + " элементов!");
        }
        return items[random()];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(size - 1);
        return randomInt;
    }
}