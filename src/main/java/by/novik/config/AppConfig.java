package novik.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //говорим ту спрингу какие бины у нас тут есть
@ComponentScan("by.novik.*") //когда комментим все что снизу, типо сам по папке ищи
public class AppConfig {
//    @Bean("crudRepository")          //знак стрелочки тип добавит куда надо
//    public CrudRepository<Course,Integer> getCrudRepository() {
//        return new TreeSetCourseRepository(); //меняем здесь - меняем во всем приложении где бины
//    }
//    @Bean("crudService")
//    public CrudService<Course,Integer> getCrudService() {
//        return new FirstCourseService(getCrudRepository());
//    }
//    @Bean("secondCrudService")
////    @Profile("test") @Profile("dev") - можно было иэто указать. говришь с каким профилем собраться и он соберется, но здесь это не сработает
//    public CrudService<Course,Integer> getSecondCrudService() {
//        return new SecondCourseService(getCrudRepository());
//    }
}
