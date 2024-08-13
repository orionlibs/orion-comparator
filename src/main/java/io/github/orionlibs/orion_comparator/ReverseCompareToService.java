package io.github.orionlibs.orion_comparator;

import com.orion.core.comparator.tasks.ReverseCompareToTask;

public class ReverseCompareToService<T>
{
    public int compareTo(T x, T y)
    {
        return ReverseCompareToTask.run(x, y);
    }
}