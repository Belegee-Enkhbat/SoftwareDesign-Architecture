package relation;


class Course {
    private String courseName;

    public Course(String name) {
        this.courseName = name;
    }
    
    // Other methods and fields
}

class Teacher {
    private String name;
    private List<Course> courses; // One-to-many association

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    
    // Other methods and fields
}

