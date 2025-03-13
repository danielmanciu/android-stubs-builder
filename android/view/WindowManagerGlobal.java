package android.view;

public class WindowManagerGlobal {
    public static IWindowManager getWindowManagerService() {
        return new IWindowManager() {
            @Override
            public void freezeDisplayRotation(int displayId, int rotation) {}
        };
    }
}
