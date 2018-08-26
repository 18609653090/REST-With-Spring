package com.baeldung.um.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.baeldung.um.security.SecurityRestLiveTest;
import com.baeldung.um.test.live.UmAsyncRestLiveTest;

@RunWith(Suite.class)
@SuiteClasses({// @formatter:off
    LiveDiscoverabilitySuite.class,
    LiveLogicSuite.class,
    SecurityRestLiveTest.class,
    UmAsyncRestLiveTest.class
})
// @formatter:on
public final class LiveSuite {
    //
}
