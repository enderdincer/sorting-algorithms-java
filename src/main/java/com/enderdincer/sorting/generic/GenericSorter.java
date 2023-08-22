package com.enderdincer.sorting.generic;

import java.util.Collection;
import java.util.List;

public interface GenericSorter <T> {

    List<T> sort(Collection<T> collection);
}
