package pl.edu.wszib.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InstancesOfTheSameClass {

    private final OnStart onStart;
    private final OnStart on123Start;

    public InstancesOfTheSameClass(OnStart onStart,
                                   OnStart on0Start) {
        this.onStart = onStart;
        this.on123Start = on0Start;
    }
}
