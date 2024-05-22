public class ThreadExample extends Thread {
    // Thread class has several methods
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        ThreadExample obj = new ThreadExample();
        obj.start();
        System.out.println("hello world");
    }

    public void run() {

        System.out.println("het");

    }
}
