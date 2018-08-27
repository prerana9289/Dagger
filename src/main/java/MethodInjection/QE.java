package MethodInjection;

import javax.inject.Inject;

public class QE implements IStudio {

    @Inject
    public QE() {
    }

    @Override
    public void findResource() {
        System.out.println(this.getClass().getSimpleName()+" found resource for project");
    }

    @Override
    public void assignResourceToProject() {
        System.out.println(this.getClass().getSimpleName()+" has assigned resource to project");
    }
}
