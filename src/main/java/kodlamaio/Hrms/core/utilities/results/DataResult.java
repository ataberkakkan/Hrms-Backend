package kodlamaio.Hrms.core.utilities.results;

public class DataResult<T> extends Result{

    public DataResult(T data, boolean success, String message) {
        super(success, message);
    }


}
