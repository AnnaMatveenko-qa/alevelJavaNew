package matveenko.lecture8;

public class ReportA extends Report{
    @Override
    protected String generateFooter() {
        return "Footer A";
    }

    @Override
    protected String generateBody() {
        return "Body A";
    }

    @Override
    protected String generateHeader() {
        return "Header A";
    }
}
