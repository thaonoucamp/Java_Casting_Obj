package myPackage;

public class Main {
    public static void main(String[] args) {
        long x = 10;
        int i = (int) x;

        Worker w = new Worker();
        Employee e = new Worker();
        Person p = new Worker();
        Object obj = new Worker();

        w.luong();
        Worker k1 = (Worker) e;
        k1.luong();

        ((Worker) p).luong();

        ((Worker) obj).luong();
    }
}
// ep kieu thap hon;

