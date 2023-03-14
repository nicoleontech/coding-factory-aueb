package gr.aueb.cf.ch15.seminarsinh;

import java.time.Duration;

public class SchedulingPeriod extends TimePeriod{

    private Long minutesDuration;
    private String formattedDuration;

    public SchedulingPeriod(TimePeriod timePeriod) {
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
