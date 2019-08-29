Example of Selenium/Serenity project.


Run Selenium test on BrowserStack:
mvn clean verify -Dwebdriver.remote.url=http://iownittau1:xpqizD37oGnPsU6RsQ7N@hub-cloud.browserstack.com/wd/hub -Dwebdriver.remote.os="WINDOWS" -Dwebdriver.remote.os_version="10" -Dwebdriver.remote.driver=Chrome


mvn clean test serenity:aggregate -Dmaven.clean.failOnError=false 
-Dmaven.test.failure.ignore=true 
-Dwebdriver.remote.url=https://olehhryshchenko1:huMfFmABxRh6hj15A6HH@hub-cloud.browserstack.com/wd/hub 
-Dwebdriver.remote.driver=chrome 
-Dwebdriver.remote.os=WINDOWS 
-Dwebdriver.remote.os_version=10 
-Dwebdriver.remote.browserstack.debug=true -Dchrome.switches="--no-sandbox,--ignore-certificate-errors,--homepage=about:blank,--no-first-run"