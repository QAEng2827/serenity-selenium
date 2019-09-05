package step;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.annotations.Metafilter;

@Metafilter("+smoke")      //"+login03 +login01" чтоб запустить конкретные тесты
public class RunASingleScenario extends SerenityStories {}
