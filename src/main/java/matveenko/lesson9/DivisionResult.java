package matveenko.lesson9;

public class DivisionResult {
    private int result;
    private boolean success;

    public DivisionResult(int result, boolean success) {
        this.result = result;
        this.success = success;
    }

    public int getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public DivisionResult(boolean success) {
        this.success = success;
    }
}
