package com.initialwebtech.billing.system.desktop.pagination;

import java.util.List;

public interface PaginationDataProvider<T> {
    int getTotalRowCount();
    List<T> getRows(int startIndex, int endIndex);
}
