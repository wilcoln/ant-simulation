package com.wilcoln.app;
import com.wilcoln.config.ConfigManager;

/**
 * Contexte de la simulation.
 */
public final class Context {
    private static Application THE_APP;
    public static String CONFIG_PATH= "res/app.cfg";
    public static String INIT_PATH="res/config.cfg" /* "res/config-step9.cfg" */;

    /*package*/
    static void initializeApplication(Application application) {
        THE_APP = application;
    }

    /**
     * Retourne l'instance de l'application de ce contexte.
     *
     * @return L'instance de l'application
     */
    public static Application getApplication() {
        assert THE_APP != null;
        return THE_APP;
    }
    
    public static ConfigManager getConfig() {
        return THE_APP.getConfigManager();
    }
}
