import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 2);
//        CompletableFuture<Integer> result = future.thenApply(x -> x * 2);
//        result.thenAccept(System.out::println);
//        Map<String, String> map = new HashMap<>();
//        map.put("A", null);
//        map.put(null, null);
//        String rs = genParamsUrl(map);
//        System.out.println(rs);
//        int x = 10;
//        Stream.iterate(0, n -> n + x)
//                .limit(10)
//                .forEach(System.out::println);
//        x = 30;

//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int[] arr = new int[n - m];
//        for (int i = 0; i <= arr.length; i++) {
//            arr[i] = m;
//            m++;
//            if (m == n) break;
//        }
//
//        int count = 0;
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < i; j++) {
//                for (int number : arr) {
//                    if (i * i - j * j == number) {
//                        count++;
//                        break;
//                    }
//                }
//
//
//            }
//        }
//
//        System.out.println(count);
//        System.out.println(tets(null));


//
//        boolean check = true;
//        Scanner scanner = new Scanner(System.in);
//        String regexDouble = "";
//        do {
//            String s = "";
//            System.out.println("Nhap n:");
//            s = scanner.nextLine();
//            if (s.matches("^(-?)(0|([1-9]\\d*))(\\.\\d+)?$")) {
//                Double nn = Double.parseDouble(s);
//                if (nn >= 0 || nn < 10000000) {
//                    System.out.println("OK");
//                    check = false;
//                } else {
//                    System.out.println("K OK");
//                }
//            } else {
//                System.out.println("input not number");
//            }
//
//        } while (check);



//        String s = "{\\\"Result\\\":{\\\"returnCode\\\":\\\"500\\\",\\\"returnMes\\\":\\\"Unknown error - SO HOP DONG 1000116110000013 DA DUOC GIAI NGAN\\\"}}";
//        System.out.println(s.replace("\\", "cc"));
//        int[] num = {1, 2};
//        int[] nums2 = {3, 4};
//        double s = findMedianSortedArrays(num, nums2);
//        System.out.println(s);

//        String s = "abbc";

//        String s = "\\\"uri\\\":\\\"https://dev-int-channel-ing.mcredit.com.vn/pre-offer?username=0989409196\\\"";
//        String patt = "\\\\\"uri\\\\\"\\s*:\\\\\"\\s*(.*?)\\\\\"";
//
//
//        s = maskURI(patt, s);
//
//        System.out.println(s);

        System.out.println(s());
    }


    static int s() {
        try {

//            if (1==1) throw new RuntimeException();
        } catch (Exception ex) {
            return 3;
        } finally {
            return 2;
        }
    }

    static String maskURI(String pattern, String mask) {
        if (mask.matches(pattern)) {
            String[] ss = mask.split("\\?");
            if (ss.length == 2) {
                StringBuffer rs = new StringBuffer();
                char[] arr = ss[1].toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (i < arr.length - 2) {
                        rs.append("*");
                    } else {
                        rs.append(arr[i]);
                    }
                }
                return ss[0] + rs;
            }
        }
        return mask;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] newNum = new int[len];
        System.arraycopy(nums1, 0, newNum, 0, nums1.length);
        System.arraycopy(nums2, 0, newNum, nums1.length, nums2.length);

        double rs = 0;

        for(int i = 1; i < len; i++) {
            int temp = newNum[i];
            int j = i - 1;
            while(j >= 0 && newNum[j] > temp) {
                newNum[j + 1] = newNum[j];
                j--;
            }
            newNum[j + 1] = temp;
        }

        if (len % 2 != 0) {
            rs = newNum[len / 2];
        } else {
            rs =  ((double) newNum[len / 2] + newNum[(len / 2) - 1]) / 2;
        }
        return rs;

    }

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] rs = new int[2];
        int len = nums.length;
        if (len == 2) {
            if(nums[0] + nums[1] == target) {
                rs[0] = 0;
                rs[1] = 1;
                return rs;
            }
            return rs;
        }
        for(int i =0; i <  len - 1; i ++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] + nums[j] == target) {
                    rs[0] = i;
                    rs[1] = j;
                    return rs;
                }
            }
        }
        return rs;
    }


    private static String tets(String s) {
        try {
            throw new Error("Errr");
//            return "OK";
        } catch (Error ex) {
            return ex.getMessage();
        } finally {
            System.out.println("finaly");
        }
    }

    private static int ss() {
        return true ? null : 0;
    }

    private static String genParamsUrl(Map<String, String> parameters) {
        return parameters.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining("&"));
    }

    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

}
