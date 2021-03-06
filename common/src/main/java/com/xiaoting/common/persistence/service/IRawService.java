package com.xiaoting.common.persistence.service;

import com.xiaoting.common.interfaces.IOperations;
import com.xiaoting.common.persistence.model.IEntity;
import org.springframework.data.domain.Page;


public interface IRawService<T extends IEntity> extends IOperations<T> {

    Page<T> findAllPaginatedAndSortedRaw(final int page, final int size, final String sortBy, final String sortOrder);

}
