public class JackOLantern {
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures=faceFeatures;
    }
    public void edit (String replace, int row, int col)
    {
        this.faceFeatures[row][col]=replace;
        System.out.println(replace);
    }
    public void fill(String str)
    {
        for (int i=0; i<this.faceFeatures.length; i++)
        {
            for (int j=0; j<this.faceFeatures[i].length; j++)
            {
                this.faceFeatures[i][j]=null;
            }
        }
        this.faceFeatures[0][0]=str;
        System.out.println(this.faceFeatures[0][0]);
    }
    public String toString()
    {
        for (int i=0; i<this.faceFeatures.length; i++)
        {
            for (int x=0; i<this.faceFeatures.length; i++)
            {
                System.out.println(this.faceFeatures[i][x]);
            }

        }
        return null;
    }
}
