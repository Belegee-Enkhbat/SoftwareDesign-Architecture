package com.example.monolithArch;

import org.springframework.data.repository.CrudRepository;

public interface bookRepository extends CrudRepository <Book, Integer> {
}
