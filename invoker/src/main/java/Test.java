import spi.api.Printer;

import java.util.ServiceLoader;

/**
 * @author wpq
 * @date 2018/11/29 10:17
 */
public class Test {

    public static void main(String[] args) {
        ServiceLoader<Printer> load = ServiceLoader.load(Printer.class);
        for(Printer printer : load){
            printer.print();
        }
    }
}
