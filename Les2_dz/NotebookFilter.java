import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookFilter {
    private List<Notebook> notebooks;

    public NotebookFilter(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public List<Notebook> filter(Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            if (matchesFilters(notebook, filters)) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    private boolean matchesFilters(Notebook notebook, Map<String, Object> filters) {
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            String filterName = entry.getKey();
            Object filterValue = entry.getValue();

            switch (filterName) {
                case "brand":
                    if (!notebook.getBrand().equals(filterValue)) {
                        return false;
                    }
                    break;
                case "ram":
                    if (notebook.getRam() < (int) filterValue) {
                        return false;
                    }
                    break;
                case "storageCapacity":
                    if (notebook.getStorageCapacity() < (int) filterValue) {
                        return false;
                    }
                    break;
                case "os":
                    if (!notebook.getOs().equals(filterValue)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!notebook.getColor().equals(filterValue)) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown filter: " + filterName);
            }
        }

        return true;
    }
}
