package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Activities",
                     "src/test/resources/features/fleet"
        },
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }

)


public class RegressionRunner {

        // kaç tane feature file varsa o kadar browser açılır. surefire config parameters
//                    <parallel>methods</parallel>
//                    <perCoreThreadCount>false</perCoreThreadCount>
//                    <threadCountMethods>10</threadCountMethods>

// Ayrı profile olarak da oluşturulabilir mvn test -P Reggresion

}
