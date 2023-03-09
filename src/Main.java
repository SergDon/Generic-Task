public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxString = new MagicBox<>(3);
        MagicBox<Integer> magicBoxInteger = new MagicBox<>(5);
        MagicBox<String> magicBoxError = new MagicBox<>(7);

        magicBoxString.add("Ferrari - 1");
        magicBoxString.add("Ford - 2");
        magicBoxString.add("Lada - 3");
        magicBoxString.add("Aveo - 4");
        magicBoxString.add("Buggati - 5");

        String box = magicBoxString.pick();
        System.out.println(box);

        magicBoxInteger.add(1);
        magicBoxInteger.add(2);
        magicBoxInteger.add(3);
        magicBoxInteger.add(4);
        magicBoxInteger.add(5);

        int numberBox = magicBoxInteger.pick();
        System.out.println(numberBox);

        magicBoxError.add("Ой -ой! Ошибка");
        magicBoxError.pick();
    }
}