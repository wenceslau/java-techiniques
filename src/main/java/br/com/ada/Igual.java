package br.com.ada;

import java.util.function.Predicate;

public class Igual implements Predicate {
    @Override
    public boolean test(Object o) {
        return o.toString().equalsIgnoreCase("agua");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
