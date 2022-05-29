import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Classroom {

    private List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public StudentGrade getWorstGrade(String discipline) {
        int worstGrade = 11;
        StudentGrade worst = null;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)
            && worstGrade > studentGrade.getGrade()) {
                worstGrade = studentGrade.getGrade();
                worst = studentGrade;
            }
        }
        return worst;
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("file", "grades.txt"));
        List<StudentGrade> grades = new ArrayList<>();
        for (String line : lines) {
            grades.add(readStudentGradeFromLine(line));
        }

        //System.out.println(grades);

        Classroom classroom = new Classroom(grades);

        StudentGrade lbRomana = classroom.getWorstGrade("romana");
        System.out.println(lbRomana);
        try {
            System.out.println(lbRomana.getDiscipline());
        } catch (NullPointerException e) {
            System.out.println("S-a aruncat un NPE. Probabil lbRomana e null.");
        }

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(classroom);
    }

    private static StudentGrade readStudentGradeFromLine(String line) {
        String[] components = line.split(Pattern.quote("|"));
        return new StudentGrade(components[0], components[1], Integer.parseInt(components[2]));
    }

    public StudentGrade getMaxGrade() {
        int maxGrade = 0;
        StudentGrade max = null;
        for (StudentGrade grade : grades) {
            if(grade.getGrade() > maxGrade) {
                max = grade;
                maxGrade = grade.getGrade();
            }
        }
        return max;
    }
}
