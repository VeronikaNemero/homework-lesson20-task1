public class MaxMin implements Runnable{

    private Thread thread;
    private int[] array;
    private int max;
    private int min;

    public Thread getThread() {
        return thread;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public MaxMin(int[] array) {
        this.array = array;

        thread = new Thread(this, "thread_1");

        thread.start();
    }

    @Override
    public void run() {
        int max0 = array[0];

        int min0 = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max0 < array[i]) {
                max0 = array[i];
            } else if (min0>array[i]){
                min0 = array[i];
            }
        }
        max = max0;

        min = min0;
    }
}
