package com.ugorji;

import com.ugorji.data.DebugDataModule;
import com.ugorji.ui.DebugUiModule;

import dagger.Module;

@Module(
        addsTo = VelcroModule.class,
        includes = {
                DebugUiModule.class,
                DebugDataModule.class
        },
        overrides = true
)
public final class DebugVelcroModule {
}
