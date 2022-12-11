package by.novik.repository;

import by.novik.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Repository
public class ArrayListCourseRepository implements CrudRepository<Course, Integer> {
    private List<Course> courses = new ArrayList<>(Arrays.asList(new Course(1,"First course",10),
            new Course(2,"second course",20),
            new Course(3,"third course",30)));


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
