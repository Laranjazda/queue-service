package services;

import models.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerService extends MongoRepository<Customer, Long> {
    @Override
    default <S extends Customer> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Customer> findAll() {
        return null;
    }

    @Override
    default List<Customer> findAll(Sort sort) {
        return null;
    }

    @Override
    default <S extends Customer> S insert(S entity) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default Page<Customer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Customer> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Customer> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Customer entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Customer> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default <S extends Customer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Customer> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Customer> boolean exists(Example<S> example) {
        return false;
    }
}

