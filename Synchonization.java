public class Synchonization {
        private static int sharedResource = 0;
        private static final Object lock = new Object();
    private static void incrementSharedResource() {
        for (int i = 0; i < 1000000; i++) {
            // Acquire the lock
            synchronized (lock) {
                sharedResource++;
            }}}
    public static void main(String[] args) throws InterruptedException {
        // Create two threads
        Thread thread1 = new Thread(Synchonization::incrementSharedResource);
        Thread thread2 = new Thread(Synchonization::incrementSharedResource);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final shared resource value: " + sharedResource);
    }
}
