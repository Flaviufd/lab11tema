public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }
}
