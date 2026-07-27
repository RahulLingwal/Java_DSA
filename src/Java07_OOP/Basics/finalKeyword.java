package Java07_OOP.Basics;

public class finalKeyword {
    public static void main(String[] args) {
        final int NUM = 10;
        // NUM = 12;            Error: cannot assign a value to final variable

        final int NUM2;
        NUM2 = 12;

        System.out.println(NUM2);

        final Video video = new Video("1GB", "2k", 30);
        video.resolution = "4k";
        System.out.println(video.resolution);

        //when a non primitive is final, you cannot reassign it.
//        video = new Video("2GB", "4k", 60);
    }
}

class Video {
    String size;
    String resolution;
    int fps;

    Video(String size, String resolution, int fps) {
        this.size = size;
        this.resolution = resolution;
        this.fps = fps;
    }
}
