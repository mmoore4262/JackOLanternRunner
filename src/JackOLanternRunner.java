public class JackOLanternRunner {

    public static void main (String[] args)
    {
        String [][] faceFeatures={{"xxxxxx "},{"xx0xx0xx "},{"xxxxxxxx "},{"xVVVVVVx "},{"xxxxxx "}};

        JackOLantern pumpkin= new JackOLantern(faceFeatures);

        pumpkin.toString();
        pumpkin.edit("help",0,0);
        pumpkin.fill("yup");



    }
}
