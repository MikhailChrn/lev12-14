public class Solution01 {

    //Напиши метод, который определяет, объект какого класса ему передали,
    //и возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String objectClassName = o.getClass().getSimpleName();
        String retur;
        switch (objectClassName) {
            case ("Cow"): retur = "Корова"; break;
            case ("Dog"): retur = "Собака"; break;
            case ("Whale"): retur = "Кит"; break;
            default: retur = "Неизвестное животное";
        }
        return retur;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
