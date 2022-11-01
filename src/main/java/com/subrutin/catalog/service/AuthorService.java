package com.subrutin.catalog.service;

import com.subrutin.catalog.dto.AuthorRepositoryDTO;

public interface AuthorService {

    public AuthorRepositoryDTO findAuthorById(Long id);

}
