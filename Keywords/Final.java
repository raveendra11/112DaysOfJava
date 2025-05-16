package Keywords;

// final class can't be exended.
// final method can't be overridded.
// final variable can't be changed.
public final class Final {
    final String Gender = "female";

    final public void doFinal() {
        System.out.println(Gender);
    }

    public static void main(String[] args) {
        Final object = new Final();
        object.doFinal();
    }

}
