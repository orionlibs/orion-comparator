package io.github.orionlibs.orion_comparator;

import io.github.orionlibs.orion_comparator.tasks.CompareToTask;

public class CompareToService<T>
{
    public static <T> int compareTo(T x, T y)
    {
        return CompareToTask.run(x, y);
    }
}