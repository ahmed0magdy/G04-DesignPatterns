package Behavioral.Visitor.AudioEditor;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.execute(new NoiseReductionFilter());
        wavFile.execute(new ReverbFilter());
        wavFile.execute(new NormalizeFilter());
    }
}
