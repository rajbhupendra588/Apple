package ArrayList;

public class AddTwoNumberBruteForceApproach<sol> {
    @Override
    public String toString() {
        return "AddTwoNumberBruteForceApproach{}";
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int target = 9;

        int[] sol = findTwoSum(arr, target);
        System.out.println("Values present under Array are = ");
        for (int i : sol) {
            if( i == 0);
            else
            System.out.println("Index Values is="+i);
        }
    }


    private static int[] findTwoSum(int[] arr, int target) {
        int[] sol = new int[arr.length];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("arr[i]=" + arr[i] + " arr[j]=" + arr[j]);
                    sol[c] = i;
                    c++;
                  sol[c] = j;
                    c++;
                }

            }
        }

        return sol;
    }
}
