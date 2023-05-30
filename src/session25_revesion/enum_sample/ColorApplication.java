package session25_revesion.enum_sample;

public class ColorApplication {

    public static void main(String[] args) {
        for (Color value : Color.values()) {
            System.out.println("value = " + value+", "+value.ordinal());
        }

    }
}
