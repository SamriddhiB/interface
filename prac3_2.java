
/*
 Write a program to create a default method in an interface IPrinter. Create
an interface IPrinter and IScanner. You can assume variables and methods for both
interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the
class, store it in Vector and display the result of the vector. 

 */
import javax.swing.text.PlainView;
import java.util.*;

interface IPrinter {
    int a = 3;

    default int meth1() {
        return a;
    };
}

interface IScanner {
    public int b = 0;

    public int meth2();
}

class C implements IPrinter, IScanner {
    public int meth2() {
        return b;
    }
}

public class prac3_2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        C c[] = new C[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new C();
            v.add(c[i]);
        }
        C c1 = (C) v.get(0);
        System.out.println(c1.meth1());
        System.out.println(c1.meth2());
        
    }
}
