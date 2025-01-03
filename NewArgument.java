class javaClass {
    javaClass() {
        System.out.println("Hello");
    }

    javaClass(int r) {
        this();
    }
}
public class NewArgument {
    public static void main(String[] args) {
        javaClass t = new javaClass(99);
    }

}

