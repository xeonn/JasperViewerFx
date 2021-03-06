package com.mgrecol.jasper.jasperviewerfx.util;

import com.mgrecol.jasper.jasperviewerfx.enums.JRViewerSupportedLocale;

import java.util.ResourceBundle;

/**
 * @author Alexey Silichenko (a.silichenko@gmail.com)
 *         created on 25.08.2016
 */
public class BundleUtils {

    private static final String BUNDLE = "bundles/locale";
    private static ResourceBundle resourceBundle;

    public static void init(JRViewerSupportedLocale locale) {
        resourceBundle = ResourceBundle.getBundle(BUNDLE, locale.getLocale());
    }

    public static ResourceBundle getBundle() {
        return resourceBundle;
    }

    public static String getLocalizedString(String key) {
        return resourceBundle.getString(key);
    }
}
