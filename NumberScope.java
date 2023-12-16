
class NumberScope {
    static int x = 5;
    int y = 5;
   
    public void test() {
        NumberScope s = new NumberScope();
        x = 10;
        s.y = 20;
        y = 2;
        this.y = 10;
        
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        NumberScope instance = new NumberScope();
        instance.test();
    }

    
    }


    
