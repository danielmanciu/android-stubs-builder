package android.os;

public class BugreportParams {
    public BugreportParams(int mode) { }

    public BugreportParams(int mode, int flags) { }

    public int getMode() { return 1; }

    public int getFlags() { return 1; }

    public static final int BUGREPORT_MODE_FULL = 0;
    public static final int BUGREPORT_MODE_INTERACTIVE = 1;
    public static final int BUGREPORT_MODE_REMOTE = 2;
    public static final int BUGREPORT_MODE_WEAR = 3;
    public static final int BUGREPORT_MODE_TELEPHONY = 4;
    public static final int BUGREPORT_MODE_WIFI = 5;
    public static final int BUGREPORT_MODE_ONBOARDING = 6;
    public static final int BUGREPORT_MODE_MAX_VALUE = 6;
    public static final int BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA = 0;
    public static final int BUGREPORT_FLAG_DEFER_CONSENT = 1;
    public static final int BUGREPORT_FLAG_KEEP_BUGREPORT_ON_RETRIEVAL = 2;
}