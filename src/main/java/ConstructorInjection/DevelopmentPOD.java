package ConstructorInjection;

import dagger.Component;

@Component
interface PODComponent {
    Project getProject();
}

public class DevelopmentPOD {
    public static void main(String[] args) {
      PODComponent component = DaggerPODComponent.create();
      Project project = component.getProject();
      project.startProject();
    }
}
