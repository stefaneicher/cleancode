package general.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})

public class SpringTest {

    @Test
    public void contextLoads() throws Exception {
        assertTrue(true);
    }
}


@Configuration
@ComponentScan(basePackageClasses = SpringTest.class)
class SpringConfig {
}

interface Animal {
    String getName();
}

@Service
class Cat implements Animal {

    @Override
    public String getName() {
        return "miau";
    }
}

@Service
class Dog implements Animal {
    @Override
    public String getName() {
        return "Woof-woof";
    }
}


@Service
class AnimalGetNameService {

    @Autowired
    private Animal cat;

    @Autowired
    private Animal asd;

    @Autowired
    @Qualifier("cat")
    private Animal needsAQualifier;

    public String getNames() {
        return needsAQualifier.getName();
    }
}
