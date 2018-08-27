package FieldInjection;

import dagger.Component;

@Component(modules = ITDeptModule.class)
interface PODComponent {
    Project getProject();
    Mobile getMobileStudio();
}

public class DevelopmentPOD {
    public static void main(String[] args) {

        PODComponent component = DaggerPODComponent.builder().build();
        Project project = component.getProject();

        System.out.println("Network Name " + project.getNetwork().getNetworkName() + "Asset Type "+ component.getMobileStudio().getAsset().getAssetType());
        project.startProject();
    }
}
