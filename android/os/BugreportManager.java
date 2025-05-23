package android.os;

import java.util.concurrent.Executor;

public class BugreportManager {
    public void startBugreport(
        ParcelFileDescriptor bugreportFd,
        ParcelFileDescriptor screenshotFd,
        BugreportParams params,
        Executor executor,
        BugreportCallback callback
    ) {}

    public abstract static class BugreportCallback {
        public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
        public static final int BUGREPORT_ERROR_RUNTIME = 2;
        public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
        public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
        public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
        public static final int BUGREPORT_ERROR_NO_BUGREPORT_TO_RETRIEVE = 6;

        public void onProgress(float progress) {}

        public void onError(int errorCode) {}

        public void onFinished() {}

        public void onFinished(String bugreportFile) {}

        public void onEarlyReportFinished() {}
    }
}