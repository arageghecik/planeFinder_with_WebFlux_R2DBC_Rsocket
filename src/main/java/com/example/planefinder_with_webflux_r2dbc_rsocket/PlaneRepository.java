package com.example.planefinder_with_webflux_r2dbc_rsocket;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaneRepository extends ReactiveCrudRepository<Aircraft, Long> {
}


