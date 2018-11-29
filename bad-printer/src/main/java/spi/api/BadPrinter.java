package spi.api;

/**
 * @author wpq
 * @date 2018/11/29 10:12
 */
public class BadPrinter implements Printer {

    public void print() {
        System.out.println("bad-printer");
    }
}
