public class Element {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 3, 5, 2, 8, 1, 6, 7, 1, 9, 5};
                
            System.out.println("Approach 1: Using Nested Loops");
            Element(arr);
        }
        
        public static void Element(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Repeating Element: " + arr[i]);
                    }
                }
            }
        }
    }    

