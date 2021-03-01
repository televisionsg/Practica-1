public class Maths{

	static double aciertos = 0;
    static double puntosTotales;
    static double areaCuadrado = 4;
    static double radio;
    static final int MAX = 1;
    static final int MIN = -1; 

	protected  static double aproxPi(double puntosTotales) {
        double aproximacion = 0.0;
        
        for( int i = 1; i < puntosTotales ; i++){
        
            double x =  (Math.random() * ((MAX - MIN))) + (MIN);
            
          double y = (Math.random() * ((MAX - MIN))) + (MIN);

	  if (diferenciaCoordenadas(x,y) <= 1.0){

                aciertos ++;

            }


        }


 	radio = 1;
        double areaCirculo = areaCuadrado * (aciertos / puntosTotales);
        aproximacion = areaCirculo / Math.pow(radio,2);


        return aproximacion;

    }

    protected static double diferenciaCoordenadas(double x, double y) {


	double diferencia2 = Math.sqrt((Math.pow((x-0),2)) + (Math.pow((y-0),2)));
      	return diferencia2;
    }

}


