package by.novik.repository;

import by.novik.model.Course;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("set")
public class TreeSetCourseRepository implements CrudRepository<Course, Integer> {
    private Set<Course> courses = new TreeSet<>();

    @Override
    public List<Course> findAll() {
        return new ArrayList<>(courses);
    }

    @Override
    public Optional<Course> findById(Integer id) {
        return courses.stream()
                .filter(course -> course.getId()==id)
                .findAny();
    }

    @Override
    public Course save(Course entity) {
        courses.add(entity);
        return entity;
    }

    @Override
    public void delete(Course entity) {
        courses.remove(entity);
    }
}
