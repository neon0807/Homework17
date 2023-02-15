public class Main {
    public static void main(String[] args) {
        StringListImpl a = new StringListImpl();
        a.add("aaaa");
        a.add("aaaa");
        a.add("aaaa");
        a.add("aaaa");
        a.add("aaaa");
        a.set(3, "bbb");
        System.out.println(a);
    }
}