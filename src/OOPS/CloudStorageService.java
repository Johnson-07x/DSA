package OOPS;

abstract class CloudStorage {
    abstract String uploadFile(String fileName);
    abstract String downloadFile(String fileName);

    void showStorageDetails() {
        System.out.println("259 TB free space left");
    }
}

class GoogleDrive extends CloudStorage{
    String uploadFile(String fileName) {
        return "Uploaded file from GoogleDrive " + fileName;
    }

    String downloadFile(String fileName) {
        return "Downloaded file from GoogleDrive " + fileName;
    }
}

class DropBox extends CloudStorage {
    String uploadFile(String fileName) {
        return "Uploaded file from DropBox " + fileName;
    }

    String downloadFile(String fileName) {
        return "Downloaded file from DropBox " + fileName;
    }
}

class OneDrive extends CloudStorage {
    String uploadFile(String fileName) {
        return "Uploaded file from OneDrive " + fileName;
    }

    String downloadFile(String fileName) {
        return "Downloaded file from OneDrive " + fileName;
    }
}

public class CloudStorageService {
    static void main(String[] args) {
        GoogleDrive gd = new GoogleDrive();
        System.out.println(gd.downloadFile("wallpaper"));
        System.out.println(gd.uploadFile("vicky"));

        OneDrive od = new OneDrive();
        System.out.println(od.downloadFile("wallpaper"));
        System.out.println(od.uploadFile("vicky"));

        DropBox db = new DropBox();
        System.out.println(db.downloadFile("wallpaper"));
        System.out.println(db.uploadFile("vicky"));
    }
}
