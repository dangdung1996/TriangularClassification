public class TriangularClassification {
    public static String TriangularClassification(int canhA, int canhB, int canhC){
        if (canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA){
            if(canhA == canhB && canhA != canhC || canhA == canhC && canhA != canhB){
                return "isosceles triangle";
            }else if(canhA != canhB && canhB != canhC ){
                return "triangles often";
            } else
                return  "equilateral triangle";
        }else
            return "not a triangle";

    }
}
