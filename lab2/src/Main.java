

import java.util.Scanner;
import javassist.ClassPool;

class Node {
    private Node next;
    private long x = 10;

    public Node() {
        this(null);
    }

    public Node(Node next) {
        this.next = next;
    }
}

public class Main {

    static ClassPool pool = ClassPool.getDefault();

    public static void main(String[] args) throws Exception {

        System.out.print("Введите номер исключения: ");

        Scanner in = new Scanner(System.in);
        int exceptionNumber = in.nextInt();

        System.out.println("Процесс начался...");

        switch (exceptionNumber) {
            case 1:     // java.lang.OutOfMemoryError: Java heap space
                int[] mas = new int[Integer.MAX_VALUE-2];
                break;

            case 2:     // java.lang.OutOfMemoryError: Java heap space
                Node node = new Node();
                while (true) {
                    node = new Node(node);
                }

            case 3:     // java.lang.OutOfMemoryError: Metaspace

                for (int i = 0; ; i++) {
                    Class c = pool.makeClass("eu.plumbr.demo.Generated" + i).toClass();
                }

            case 4:     // java.lang.StackOverflowError
                function();
                break;

            default: break;
        }
    }

    public static void function() {
        long x1;
        long x2;
        long x3;
        long x4;
        long x5;
        long x6;
        long x7;
        long x8;

        function();
    }
}

