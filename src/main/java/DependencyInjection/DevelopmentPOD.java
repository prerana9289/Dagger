package DependencyInjection;

public class DevelopmentPOD {
    private static Mobile mobile;
    private static QE qe;

    public static void main(String[] args) {

        mobile = new Mobile();
        qe = new QE();

        Project project = new Project(mobile, qe);
        project.startProject();
    }
}
