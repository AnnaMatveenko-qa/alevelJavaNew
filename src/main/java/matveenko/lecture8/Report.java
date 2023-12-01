package matveenko.lecture8;

public class Report {

    public String generateReport(){
      return   generateHeader() + separator() + generateBody() + separator() + generateFooter();
    }
    protected String generateFooter(){
        return "";
    }
    protected String generateBody(){
        return "";
    }
    protected String generateHeader(){
        return "";
    }
    private String separator(){
        return System.lineSeparator() + "=========================================================" + System.lineSeparator();
    }

    public static void main(String[] args) {
       Report report = new Report();
       System.out.println(report.generateReport());
    }
}
