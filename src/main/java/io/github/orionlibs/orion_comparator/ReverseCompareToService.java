package io.github.orionlibs.orion_comparator;

import io.github.orionlibs.orion_comparator.tasks.ReverseCompareToTask;

public class ReverseCompareToService<T>
{
    public int compareTo(T x, T y)
    {
        return ReverseCompareToTask.run(x, y);
    }
}