package MethodInjection;

import dagger.Module;
import dagger.Provides;

@Module
public class ITDeptModule {

    ProjectNetwork networkName;

    public ITDeptModule() {
    }

    @Provides
    public ProjectNetwork provideInternetService() {
        networkName = new ProjectNetwork();
        networkName.setNetwork("WIFI-Globers");
        return networkName;
    }

    @Provides
    public Asset provideAsset()
    {
        IStudio studio = new Mobile();
        Asset asset = new Asset();
        if (studio instanceof Mobile) {
            asset.setAssetType("MAC");
        } else {
            asset.setAssetType("WINDOWS");
        }
        return asset;
    }
}
