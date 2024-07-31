import java.util.concurrent.locks.Lock;

class Philosopher implements Runnable {
    private final int id;
    private final Lock leftFork;
    private final Lock rightFork;

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " размышляет.");
        Thread.sleep(100); // Представим, что философ размышляет некоторое время
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест.");
        Thread.sleep(100); // Представим, что философ ест некоторое время
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                think();
                leftFork.lock();
                try {
                    rightFork.lock();
                    try {
                        eat();
                    } finally {
                        rightFork.unlock();
                    }
                } finally {
                    leftFork.unlock();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
