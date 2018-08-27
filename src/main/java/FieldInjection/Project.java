package ConstructorInjection;

import javax.inject.Inject;

public class Project {

    private Mobile mobile;
    private QE qe;

    @Inject
    public Project(Mobile mobile, QE qe) {
        this.mobile = mobile;
        this.qe = qe;
    }

    private void findResource() {
        mobile.findResource();
        qe.findResource();
    }

    private void prepareTeam() {
        mobile.assignResourceToProject();
        qe.assignResourceToProject();
    }

    public void startProject() {
        findResource();
        prepareTeam();
        System.out.println("Start project");
    }
}
