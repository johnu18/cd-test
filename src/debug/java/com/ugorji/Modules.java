package com.ugorji;

import org.jetbrains.annotations.NotNull;

final class Modules {
    static Object[] list(@NotNull VelcroApp app) {
        return new Object[]{
                new VelcroModule(app),
                new DebugVelcroModule()
        };
    }

    private Modules() {
        // No instances.
    }
}
