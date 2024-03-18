package relation;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    // Getters and other methods
}

class Course {
    private String title;
    private List<Teacher> teachers; // Aggregation relationship

    public Course(String title) {
        this.title = title;
        // this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
        }
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    // Getters and other methods
}
