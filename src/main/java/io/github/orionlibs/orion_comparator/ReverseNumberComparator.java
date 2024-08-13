package io.github.orionlibs.orion_comparator;

import java.math.BigDecimal;
import java.util.Comparator;

public class ReverseNumberComparator implements Comparator<Number>
{
    @Override
    public int compare(Number x, Number y)
    {
        BigDecimal number1 = new BigDecimal(x.toString());
        BigDecimal number2 = new BigDecimal(y.toString());
        return (number2).compareTo(number1);
    }
}