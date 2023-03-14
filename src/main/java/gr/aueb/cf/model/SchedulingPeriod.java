package gr.aueb.cf.model;

import java.time.Duration;

public class SchedulingPeriod {

    private TimePeriod timePeriod;
    private Long minutesDuration;
    private String formattedDuration;

    public SchedulingPeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        Duration duration = Duration.between(timePeriod.getStart().toInstant(), timePeriod.getEnd().toInstant());
        minutesDuration = duration.toMinutes();
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        if(hours>0){
            this.formattedDuration = hours+" "+((hours==1) ? "hour" : "hours");
        }
        if(minutes>0){
            this.formattedDuration = minutes+" "+((minutes==1) ? "minute" : "minutes");
        }
    }


}
