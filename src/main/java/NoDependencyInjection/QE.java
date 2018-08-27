package NoDependencyInjection;

public class QE implements IStudio {

    @Override
    public void findResource() {
        System.out.println(this.getClass().getSimpleName()+" found resource for project");
    }

    @Override
    public void assignResourceToProject() {
        System.out.println(this.getClass().getSimpleName()+" has assigned resource to project");
    }
}
