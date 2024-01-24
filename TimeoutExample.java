import java.time.Duration;
import java.time.Instant;

public class TimeoutExample {

    public static void main(String[] args) {
        // Set a timeout threshold (e.g., 3 seconds)
        Duration timeout = Duration.ofSeconds(3);

        // Capture the start time
        Instant startTime = Instant.now();

        // Simulate an operation with an infinite while loop
        boolean operationCompleted = performInfiniteLoopOperation();

        // Capture the end time
        Instant endTime = Instant.now();

        // Calculate the duration
        Duration duration = Duration.between(startTime, endTime);

        // Check if the operation completed or if it exceeded the timeout
        if (operationCompleted) {
            System.out.println("Operation completed successfully.");
        } else {
            System.out.println("Operation did not complete within the timeout.");
        }

        System.out.println("Elapsed Time: " + duration.getSeconds() + " seconds");
    }

    // Simulate an operation with an infinite while loop
    private static boolean performInfiniteLoopOperation() {
        Instant startLoopTime = Instant.now();

        // Simulate an infinite while loop (replace with your actual logic)
        while (true) {
            // Check if the operation should exit the loop
            if (someCondition()) {
                return true; // Operation completed successfully
            }

            // Check if the timeout is exceeded
            Instant currentTime = Instant.now();
            Duration loopDuration = Duration.between(startLoopTime, currentTime);
            if (loopDuration.compareTo(Duration.ofSeconds(5)) > 0) {
                return false; // Timeout exceeded
            }

            // Simulate some work in the loop
            simulateWork();
        }
    }

    // Simulate a condition that ends the infinite loop
    private static boolean someCondition() {
        // Replace with your actual condition
        return Math.random() < 0.001; // Simulating a condition with a 10% chance
    }

    // Simulate some work in the loop
    private static void simulateWork() {
        // Replace with your actual work
        try {
            Thread.sleep(100); // Simulating some work taking 100 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



    

