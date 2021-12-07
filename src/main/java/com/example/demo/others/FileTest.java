package com.example.demo.others;

import java.io.File;
import java.util.*;


public class FileTest {
    public static void main(String[] args) {
        /*File file = new File("D:\\offlinemaps");
        listAllFiles(file);
        "String".equals("");
        Object o = new Object();
        o.hashCode();
        HashMap hashMap = new HashMap();
        hashMap.put("", "");
        int[] array1 = {1};
        for (int a : array1) {
        }
        int[] array2 = Arrays.copyOf(array1, array1.length);
        "".equals("");
        Objects.hash("wtf");*/
        System.out.println(FileTest.findMax());
        ArrayList arrayList = new ArrayList();
        arrayList.forEach(x -> {
            System.out.println(x);
        });

        Comparator<String> comparator = (first, second) -> first.length() - second.length();
        System.out.println(comparator.compare("123", "1234"));

        Object o = new Object();
        LinkedList linkedList = new LinkedList();
        linkedList.get(1);
        linkedList.getFirst();
        linkedList.getLast();
        HashMap map = new HashMap();
        map.put(null, 1);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.contains("");
        Collection collection = new ArrayList();

    }

    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static int findMax(int... values) {
        System.out.println(values.length);
        int max = Integer.MIN_VALUE;
        for (int temp : values) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
class ge<T>{
    private T f;
    private T s;


}
