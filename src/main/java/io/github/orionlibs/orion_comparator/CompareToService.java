package io.github.orionlibs.orion_comparator;

import com.orion.core.comparator.tasks.CompareToTask;

public class CompareToService<T>
{
    public static <T> int compareTo(T x, T y)
    {
        return CompareToTask.run(x, y);
    }
}