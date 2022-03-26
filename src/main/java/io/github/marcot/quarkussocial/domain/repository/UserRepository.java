package io.github.marcot.quarkussocial.domain.repository;

import io.github.marcot.quarkussocial.domain.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}
