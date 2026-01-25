package java.com.doda25.team24;

public final class VersionUtil {

    public static String getVersion() {
        return VersionUtil.class
                .getPackage()
                .getImplementationVersion();
    }

}
