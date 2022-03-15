package ru.learnup.march.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class NewNumberEvent extends ApplicationEvent {

    private final int goal;
    private final int number;
    private final ApplicationContext context;

    public NewNumberEvent(ApplicationContext context, int goal, int number) {
        super(number);
        this.goal = goal;
        this.number = number;
        this.context = context;
    }

    public int getGoal() {
        return goal;
    }

    public int getNumber() {
        return number;
    }

    public ApplicationContext getContext() {
        return context;
    }
}
