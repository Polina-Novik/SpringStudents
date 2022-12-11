package by.novik.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T,D> { //crud - интерфейс, кот делает все методы для работы с базой данных  за нас
    //T d - дженерики, 2 класса
    List<T> findAll(); //если Т курс - вернет лист курсов, или Т юзеры вернется их лист и т д
    Optional<T> findById(D id); // если есть к коллекции эта ай ди вернет ее, нет ничего не вернет. оптионал говорит есть или нет. нулл поинтер эксепсон не дает, все под твою ответственность
    T save(T entity);
    void delete(T entity);
}
