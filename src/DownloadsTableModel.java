import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

class DownloadsTableModel extends AbstractTableModel
        implements PropertyChangeListener {
    private static final String[] columnNames = { "URL", "Size",
            "Progress", "Status" };
    private static final Class<?>[] columnClasses = { String.class,
            String.class, JProgressBar.class, String.class };
    private ArrayList<Download> downloadList = new ArrayList<Download>();

    public void addDownload(Download download) {
        download.addPropertyChangeListener(this);
        downloadList.add(download);
        int index = downloadList.indexOf(download);
        fireTableRowsInserted(index, index);
    }

    public void clearDownload(int row) {
        Download download = downloadList.get(row);
        download.removePropertyChangeListener(this);
        downloadList.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public Download getDownload(int row) {
        return downloadList.get(row);
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Class<?> getColumnClass(int col) {
        return columnClasses[col];
    }

    public int getRowCount() {
        return downloadList.size();
    }

    public Object getValueAt(int row, int col) {
        Download download = downloadList.get(row);
        switch (col) {
            case 0:
                String fileName = download.getFileName(download.getUrl());
                return fileName;
            case 1:
                int size = download.getSize();
                size /= (1024 * 1024);
                return (size == -1) ? "" : Integer.toString(size) + " MB";
            case 2:
                return Float.valueOf(download.getProgress());
            case 3:
                return Download.STATUSES[download.getStatus()];
        }
        return "";
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Download download = (Download) evt.getSource();
        int index = downloadList.indexOf(download);
        fireTableRowsUpdated(index, index);
    }
}
