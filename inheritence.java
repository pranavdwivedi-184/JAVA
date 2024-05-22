class dhoni {
    String a() {
        return "jersey no. 7";
    }
}

class jadeja extends dhoni {
    String b() {

        return "jersey no. 8";
    }

}

class raina extends jadeja {
    public void c() {
        System.out.println("jersey no 3");
    }
}

public class inheritence {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        raina obj = new raina();
        obj.c();

    }
}
