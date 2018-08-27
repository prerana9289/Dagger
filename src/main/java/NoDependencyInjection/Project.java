package NoDependencyInjection;

public class Project {

    private Mobile mobile;
    private QE qe;

    public Project(){
        mobile = new Mobile();
        qe = new QE();

        mobile.findResource();
        mobile.assignResourceToProject();
        qe.findResource();
        qe.assignResourceToProject();
    }

    public void startProject()
    {
        System.out.println("Start project");
    }
}
