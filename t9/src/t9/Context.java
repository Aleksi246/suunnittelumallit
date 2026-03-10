package t9;

public class Context {
    private SortingStrategy sortingStrategy;


    public Context(){

    }

    public void setStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] arr){
        sortingStrategy.sortArray(arr);
    }
}
