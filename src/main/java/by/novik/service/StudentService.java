package by.novik.service;

import by.novik.model.Course;
import by.novik.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("secondCourseService")
public class SecondCourseService implements CrudService<Course,Integer> {


   private CrudRepository<Course,Integer> repository; //qualifier доб когда все убрали с appconfig. нужен чтобы не запутаться между двумя репозиториями,если он один, то так не надо
   //если не работаем ставим @Autowired
    public SecondCourseService(@Qualifier("set") CrudRepository<Course,Integer> repository) {
        this.repository=repository;
    }
    @Override
    public List<Course> findAll() {
        System.out.println("find all");
        return repository.findAll();
    }

    @Override
    public Optional<Course> findById(Integer id)
    {
        System.out.println("find by id");
        return repository.findById(id);
    }

    @Override
    public Course save(Course entity) {
        System.out.println("save");
        repository.delete(entity); //это на случай если у нас есть штука с ай ди 3, мы вставляем новую с 3, чоб старую удалило и сохрнила
        repository.save(entity);
        return entity;
    }

    @Override
    public void delete(Course entity) {
        System.out.println("delete");
        repository.delete(entity);
    }
}
