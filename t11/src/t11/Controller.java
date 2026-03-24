package t11;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> future; // Memento future

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.future = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        future.clear();
        model.setOption(optionNumber, choice);
        gui.updateGui();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        future.clear();
        model.setIsSelected(isSelected);
        gui.updateGui();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            saveToFuture();

            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo(){
        if(!future.isEmpty()) {
            System.out.println("Memento found in future");
            saveToHistory();

            IMemento nextState = future.remove(future.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    private void saveToFuture() {
        IMemento currentState = model.createMemento();
        future.add(currentState);
    }

    public List<IMemento> getHistory() {
        return this.history;
    }
    public List<IMemento> getFuture() {
        return this.future;
    }
}