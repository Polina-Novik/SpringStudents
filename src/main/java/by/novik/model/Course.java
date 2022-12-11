package novik.model;

public class Course implements Comparable<Course>{ //чтобы можно было сравнить один курс с другим
    private int id;
    private String description;
    private int students;

    public Course(int id, String description, int students) {
        this.id = id;
        this.description = description;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return id == course.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Course o) {
        return Integer.compare(getId(),o.getId()); //0 => одинаковые. -x - текущий курс меньше, +x - больше. сравниваем по id
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", students=" + students +
                '}';
    }
}
