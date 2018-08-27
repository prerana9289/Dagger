package FieldInjection;

import javax.inject.Inject;

public class Mobile implements IStudio {

    @Inject
    Asset asset;

    public Asset getAsset() {
        return asset;
    }

    @Inject
    public Mobile() {
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
