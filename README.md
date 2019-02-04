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
