package MethodInjection;

import javax.inject.Inject;

public class Project {

    private Mobile mobile;
    private QE qe;

    ProjectNetwork network;

    @Inject
    public void setNetwork(ProjectNetwork network) {
        this.network = network;
    }

    @Inject
    public Project(Mobile mobile, QE qe) {
        this.mobile = mobile;
        this.qe = qe;
    }

    public ProjectNetwork getNetwork() {
        return network;
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
