class Test3 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++)

            {

                Thread.sleep(500);
                System.out.println("Hello");
                Thread.sleep(2000);
                System.out.println("Suman");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        Test3 obj = new Test3();
        obj.start();
    }
}
