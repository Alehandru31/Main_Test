public class Potochi {

    static class  SomeThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Numarul este: " + i);
            }
        }
    }

        public static void main(String[] args) {
            SomeThread someThread = new SomeThread();
            someThread.start();
            SomeThread someThread1 = new SomeThread();
            someThread1.start();

            //A doua metoda fara noul class
            Thread thread =new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Numarul este: " + i);
                    }
                }
            });
            thread.start();
        }
}