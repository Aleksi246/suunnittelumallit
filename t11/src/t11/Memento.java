package t11;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private LocalDateTime createdAt;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;

        this.createdAt = LocalDateTime.now();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    @Override
    public String toString() {
        String options = Arrays.toString(this.options);
        String text = "Options: " + options + ", Selected: " + isSelected + ", Created At: " + createdAt;
        return text;  // what shows in ListView
    }
}