public class ClockwiseAngle {

    public static Double giveClockwiseAngle(int hours, int minutes){
        double hoursAngle = hours*30 + minutes*0.5;
//        System.out.println(hoursAngle);
        double minutesAngle = minutes*6;
//        System.out.println(minutesAngle);
        if((hoursAngle - minutesAngle) < 0) return -(hoursAngle - minutesAngle);
        return hoursAngle - minutesAngle;
    }

    public static void main(String[] args){
        System.out.println(giveClockwiseAngle(4,40));
        ;
    }
}
