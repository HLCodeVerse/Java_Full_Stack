package Core_Java.Generics;

public class Gen1 {
    public static void main (String[] args) {
        TestGen<Integer> gen1 = new TestGen<>(32);
        System.out.println(gen1);

        TestGen<String> gen2 = new TestGen<>("Hello World");
        System.out.println(gen2);
    }
}

class TestGen<T> {
    T obj;

    TestGen(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return String.valueOf ( obj);
    }
}
