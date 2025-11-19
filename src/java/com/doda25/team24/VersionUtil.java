package com.doda25.team24;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class VersionUtil {
    public static String getVersion() {
        String v = VersionUtil.class.getPackage().getImplementationVersion();
        return v;
    }
    private VersionUtil() {}
}