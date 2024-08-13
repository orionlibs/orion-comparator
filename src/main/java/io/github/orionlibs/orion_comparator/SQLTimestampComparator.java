package io.github.orionlibs.orion_comparator;

import java.sql.Timestamp;
import java.util.Comparator;

public class SQLTimestampComparator implements Comparator<Timestamp>
{
    @Override
    public int compare(Timestamp x, Timestamp y)
    {
        return x.compareTo(y);
    }
}