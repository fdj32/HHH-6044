package io.github.fdj32.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorld, CompositePrimaryKey> {

}
