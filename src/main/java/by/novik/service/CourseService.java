package by.novik.service;

import by.novik.model.Course;
import by.novik.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("firstCourseService") //указываем че за бин
public class FirstCourseService implements CrudService<Course,Integer> {

    private CrudRepository<Course,Integer> repository;
    public FirstCourseService (@Qualifier("arrayListCourseRepository") CrudRepository<Course,Integer> repository) {
        this.repository=repository;
    }
    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Course save(Course entity) {
        repository.delete(entity); //это на случай если у нас есть штука с ай ди 3, мы вставляем новую с 3, чоб старую удалило и сохрнила
        repository.save(entity);
        return entity;
    }

    @Override
    public void delete(Course entity) {
repository.delete(entity);
    }
}
