package com.example.nameservice;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NameService {
    private NameMapper namesMapper;

    public NameService(NameMapper namesMapper) {
        this.namesMapper = namesMapper;
    }

    public Name findName(int id) {
        Optional<Name> name = this.namesMapper.findById(id);
        if (name.isPresent()) {
            return name.get();
        } else {
            throw new NameNotFoundException("player not found");
        }

    }
}



