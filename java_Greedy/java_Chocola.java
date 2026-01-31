import java.util.*;
public class java_Chocola{
    public static void main(String[] args) {
        Integer costHor[] = {2,1,3,1,4};
        Integer costVer[] = {4,1,2};

        // Sorting cost in descending order
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0,v = 0;
        int hpieces = 1,vpieces = 1;
        int Maxcost = 0;
        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){
                Maxcost += (costHor[h] * vpieces);
                hpieces++;
                h++;
            }else{
                Maxcost += (costVer[v] * hpieces);
                v++;
                vpieces++;
            }
        }
        while(h < costHor.length){
            Maxcost += costHor[h] * vpieces;
            h++;
            hpieces++;
        }
        while(v < costVer.length){
            Maxcost += costVer[v] * hpieces;
            v++;
            vpieces++;
        }
        System.out.println(Maxcost);
    }
}