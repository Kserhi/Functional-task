package app.view;

import app.entitis.ContactEntiti;

import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AppView {
    public void getAllItems(Collection<ContactEntiti> contactEntitis) {
        AtomicInteger atomicInteger = new AtomicInteger();
        contactEntitis.forEach((value) ->
                System.out.println(atomicInteger.incrementAndGet() + " ) " + value)

        );
    }

    public String getMenu() {
        Supplier<String> supplier=()->{
            System.out.println(
                    """ 
                                Menu:
                                1-get All
                                2-exit
                        """);
            return  new Scanner(System.in).next();
        };

        return supplier.get();
    }


}
