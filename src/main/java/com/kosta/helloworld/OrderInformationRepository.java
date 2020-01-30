package com.kosta.helloworld;

import org.springframework.data.repository.CrudRepository;

public interface OrderInformationRepository extends CrudRepository<OrderInformation, Long> {
}
