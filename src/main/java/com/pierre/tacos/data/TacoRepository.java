package com.pierre.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.pierre.tacos.Taco;

public interface TacoRepository
         extends CrudRepository<Taco, Long> {

}
