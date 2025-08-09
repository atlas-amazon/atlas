public class Main {
    public static void main(String[] args) {
        // Create subsystem objects
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie("The Matrix");
        System.out.println();
        homeTheater.endMovie();
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player turned ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player turned OFF");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector turned ON");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void off() {
        System.out.println("Projector turned OFF");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound System turned ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound volume set to: " + level);
    }

    public void off() {
        System.out.println("Sound System turned OFF");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        dvd.on();
        projector.on();
        projector.setInput("DVD");
        sound.on();
        sound.setVolume(5);
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvd.off();
        projector.off();
        sound.off();
    }
}