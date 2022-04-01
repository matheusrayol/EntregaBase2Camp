package com.matheusrayol.suite;

import com.matheusrayol.tests.LoginTests;
import com.matheusrayol.tests.ReportIssueTests;
import com.matheusrayol.tests.ViewIssuesTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LoginTests.class,
        ReportIssueTests.class,
        ViewIssuesTests.class
})

public class SuiteTest {

}
