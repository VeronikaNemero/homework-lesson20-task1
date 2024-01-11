public class Main {
    public static void main(String[] args) {

        MaxMin thread1 = new MaxMin(new int[] {6, 87, -5, 2, 53});

        MaxMin thread2 = new MaxMin(new int[] {6, 87, -5, 2, 53});

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Max value in array: " + thread1.getMax());
        System.out.println("Min value in array: " + thread1.getMin());
    }
}