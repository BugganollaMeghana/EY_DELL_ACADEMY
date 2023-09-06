package EY_2208;

public class GeneralizedMethod {

	public static void main(String[] args) {
		Integer[] intArr = {10,4,5,6,7,23,4};
		String[] strArr= {"Z","A","X","B","W"};

        System.out.println("Printing integer array");
        printArray(intArr);

        System.out.println("Printing string array");
        printArray(strArr);
    }
    static <E> void printArray(E[] elements)
    {
        for(E e: elements)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
		}



