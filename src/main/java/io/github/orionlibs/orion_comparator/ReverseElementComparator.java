package io.github.orionlibs.orion_comparator;

import java.util.Comparator;

public class ReverseElementComparator<T> implements Comparator<T>
{
    @Override
    public int compare(T x, T y)
    {
        return new ReverseCompareToService<T>().compareTo(x, y);
    }
}