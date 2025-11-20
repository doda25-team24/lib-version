package java.com.doda25.team24;

public final class VersionUtil {
    public static String getVersion() {
        String v = VersionUtil.class.getPackage().getImplementationVersion();
        return v;
    }
}