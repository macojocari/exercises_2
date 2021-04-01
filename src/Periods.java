import java.time.LocalDate;

public class Periods {
    public static void main(String[] args) {
        LocalDate start1 = LocalDate.of(2021,1,1);
        LocalDate end1=LocalDate.of(2021,2,1);
        LocalDate start2=LocalDate.of(2021,1,25);
        LocalDate end2=LocalDate.of(2021,3,1);
        LocalDate startDate1 = LocalDate.of(2021,3,2);
        LocalDate endDate1=LocalDate.of(2021,3,8);
        LocalDate startDate2=LocalDate.of(2020,1,1);
        LocalDate endDate2=LocalDate.of(2020,1,10);

       isDateOverlapping(start1,end1,start2,end2);
       isDateOverlapping(startDate1,endDate1,startDate2,endDate2);
       isDateOverlapping(null,end1,start2,end2);
       isDateOverlapping(startDate1,endDate1,startDate2,null);

    }

   public static void isDateOverlapping(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
if(start1 != null && start2 != null && end1 != null && end2 !=null) {
    if (start1.isBefore(end1) && start2.isAfter(end1)) {
        System.out.println("The dates aren't overlapping");
    } else if (start2.isBefore(end2) && start1.isAfter(end2)) {
        System.out.println("The dates aren't overlapping");
    } else {
        System.out.println("Dates overlap");
    }
}else if(start1==null || start2==null){
    System.out.println("-infinity");
}else {
    System.out.println("+infinity");
}
    }
}


