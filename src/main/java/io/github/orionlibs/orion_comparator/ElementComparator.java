package io.github.orionlibs.orion_comparator;

import java.util.Comparator;

public class ElementComparator<T> implements Comparator<T>
{
    @Override
    public int compare(T x, T y)
    {
        return CompareToService.<T>compareTo(x, y);
    }
}