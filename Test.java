public class Test {
    public void print() {
        Thread thread = Thread.currentThread();
        //StackTraceElement element = thread.getStackTrace()[1];
        //System.out.println(element.getClassName());
        StackTraceElement[] stackTrace = thread.getStackTrace();
        
        // Print each element in the stack trace
        for (StackTraceElement e : stackTrace) {
            System.out.println("Class: " + e.getClassName() +
                               ", Method: " + e.getMethodName() +
                               ", File: " + e.getFileName() +
                               ", Line: " + e.getLineNumber());
        }
        

    }

    public void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}
