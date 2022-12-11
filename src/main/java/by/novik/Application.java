package novik;

import by.novik.config.AppConfig;
import by.novik.model.Course;
import by.novik.service.CrudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
//        CrudRepository<Course,Integer> repository=new TreeSetCourseRepository(); //можно по логике выбрать сет или эррэй списочек, сервис работы курса 1 или 2
//        CrudService<Course,Integer> service=new FirstCourseService(repository);
//        service.save(new Course(4,"Here",50));
//        service.save(new Course(2,"Second",10));
//        System.out.println(service.findAll()); мы так делали раньше//id по порядку расставил, сортировка в три сете потому что

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class); //строчка - дай мне коробку где лежат все объекты
//       CrudService<Course,Integer> service=context.getBean("crudService",CrudService.class); если бы оставили appfig как было
        CrudService<Course,Integer> service=context.getBean("firstCourseService",CrudService.class);
        service.save(new Course(4,"Here",50));
        service.save(new Course(2,"Second",10));
        System.out.println(service.findAll());
    }
}
