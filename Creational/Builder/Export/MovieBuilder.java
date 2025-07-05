package Creational.Builder.Export;

public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 5);
    }

    public Movie getMovie() {
        return movie;
    }

}
