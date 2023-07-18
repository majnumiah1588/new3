public class SeriesProduct {

    private int result;

    public SeriesProduct(){

        result=1;
    }

    public int SeriesProduct(int highestNumber){

        for(int loopCount=1; loopCount<=highestNumber; loopCount++){
            
            result=result * loopCount;
        }
        return result;
    }

}
