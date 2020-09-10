package by.jrr.ruslan.arrays.service;

public class LookUpArrayService {


        public static int findMax(int[] array) {
            if (array.length==0){
                return 0;
            }
            int findMax = array[0];
            for (int i=0; i<array.length; i++){
                if (array[i]>findMax){
                    findMax=array[i];
                }
            }
            return findMax;
        }

        public static  int findMin(int[] array) {
            if (array.length==0){
                return 0;
            }
            int findMin = array[0];
            for (int i =0; i<array.length; i++){
                if (array[i]<findMin){
                    findMin=array[i];
                }
            }
            return findMin;
        }

        public static  int indexOfMax(int[] array) {
            if (array.length==0){
                return -1;
            }
            int indexOfMax=0;
            for (int i=0; i<array.length; i++){
                if (array[indexOfMax]<array[i]){
                    indexOfMax=i;
                }
            }
            return indexOfMax;
        }

        public int indexOfMin(int[] array) {
            if (array.length==0){
                return -1;
            }
            int indexOfMin=0;
            for (int i =0; i<array.length;i++){
                if (array[indexOfMin]>array[i]){
                    indexOfMin=i;
                }
            }
            return indexOfMin;
        }

        public int indexOf(int[] array, int value) {
            if (array.length==0){
                return -1;
            }
            int indexOf=0;
            for (int i=0; i<array.length;i++){
                if (array[i]==value){
                    indexOf=i;
                }
            }
            return indexOf;
        }
}
