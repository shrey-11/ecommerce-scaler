package dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable;

import org.springframework.data.jpa.repository.JpaRepository;



public interface JtUserRepository extends JpaRepository<User, Long> {
    User save(User user);

    User findUserById(Long id);
}