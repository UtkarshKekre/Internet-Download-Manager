# Internet-Download-Manager
This is a prototype of a fully functional internet download manager which accepts an URL from the user and starts downloading content from that URL.
Major Festures-<br>
1.The GUI maintains a list of downloads that are currently being managed.<br>
2.GUI contains Progress Bar to show the percentage of downloading completed.<br>
3.GUI has buttons allowing user to add,pause,resume,cancel, and to clear a download.

Language Used : JAVA , the GUI has been made using swing.

### This is the preview of the Download manager Application which can be used to download files

![screenshot 21](https://cloud.githubusercontent.com/assets/24290847/22510683/da58e3e6-e8b8-11e6-9315-6a0134d73423.png)


##### Another Sceen shot
![screenshot 22](https://cloud.githubusercontent.com/assets/24290847/22510686/dc9405c8-e8b8-11e6-8d27-152c3e79fc40.png)

# Functionality
The Download Manager is broken into a few classes for natural separation of functional components. These are Download, DownloadsTableModel, ProgressRenderer and DownloadManager Classes.<br>
1. DownloadManager - Responsible for GUI interface and makes use of DownloadsTableModel and ProgressRenderer for displaying current list of downloads.<br>
2. Download - Represents "managed" download and is reponsible for actual downloading of a file

# The Download Class
The Download class is the workhorse of the Download Manager. Its primary purpose is to download a file and save that file's contents to disk. Each time a new download is added to the Download Manager, a new Download object is instantiated to handle the download. The Download Manager has the ability to download multiple files at once. To achieve this, it's necessary for each of the simultaneous downloads to run independently. It's also necessary for each individual download to manage its own state so that it can be reflected in the GUI. This is accomplished with the Download class. The entire code for Download is shown here. Notice that it extends Observable andimplements Runnable.

# The ProgressRenderer Class
The ProgressRenderer class is a small utility class that is used to render the current progress of a download listed in the GUI's "Downloads" JTable instance. Normally, a JTable instance renders each cell's data as text. However, often it's particularly useful to render a cell's data as something other than text. In the Download Manager 's case, we want to render each ofthe table's Progress column cells as progress bars. The ProgressRenderer class shown here makes that possible. Notice that it extends JProgressBar and implements TableCellRenderer

# The DownloadsTableModel Class
The DownloadsTableModel class houses the Download Manager's list of downloads and is the backing data source for the GUI's "Downloads" JTable instance. It extends AbstractTableModel and implements the obserever interface.

# The DownloadManager Class
The DownloadManager class isresponsible for creating and running the Download Manager's GUI. This class has a main( )method declared, so on execution it will be invoked first. The main( ) method instantiates anew DownloadManager class instance and then calls its show( ) method, which causes it to be displayed. It extends JFrame and implements Observer.

# Compiling Download Manager
Compile DonwloadManager like this<br>
javac DownloadManager.java DownloadsTableModel.java ProgressRenderer.java Download.java

# Running Donwload Manager
Run DownloadManager like this<br>
javaw DownloadManager<br>

Thank you!
I hope you like this project :)
