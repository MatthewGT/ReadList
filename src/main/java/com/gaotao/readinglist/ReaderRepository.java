package com.gaotao.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ReaderRepository extends JpaRepository<Reader, String> {
    Reader findByUsername(String username);
}