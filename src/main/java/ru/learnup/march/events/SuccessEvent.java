package ru.learnup.march.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class SuccessEvent extends ApplicationEvent {

    private final int number;
    private final ApplicationContext context;

    public SuccessEvent(ApplicationContext context, int number) {
        super(number);
        this.context = context;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public ApplicationContext getContext() {
        return context;
    }
}
