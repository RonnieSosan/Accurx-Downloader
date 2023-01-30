/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.accurx.reliabledownloader;

public class App {

    public static void main(String[] args) {
        // If this url 404's, you can get a live one from https://installer.demo.accurx.com/chain/latest.json.
        var exampleUrl = "https://installer.demo.accurx.com/chain/3.182.57641.0/accuRx.Installer.Local.msi";
        var exampleFilePath = "C:/Users/[USER]/myfirstdownload.msi";
        var fileDownloader = new MyFileDownloader();
        fileDownloader.DownloadFile(exampleUrl, exampleFilePath, (progress) -> System.out.println("Percent progress is " + progress));
    }
}