package exercise3;

import java.util.List;

public class Training_Java {
    private final String subject;
    private final Integer participantsAmount;
    private final List<String> courseConductors;

    public Training_Java(String subject, Integer participantsAmount, List<String> courseConductors) {
        this.subject = subject;
        this.participantsAmount = participantsAmount;
        this.courseConductors = courseConductors;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getParticipantsAmount() {
        return participantsAmount;
    }

    public List<String> getCourseConductors() {
        return courseConductors;
    }

    @Override
    public String toString() {
        return "Training_Kotlin(" +
                "subject=" + subject +
                ", participantsAmount=" + participantsAmount +
                ", courseConductors=" + courseConductors +
                ')';
    }
}
