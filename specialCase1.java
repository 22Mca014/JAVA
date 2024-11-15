import java.util.Scanner;

public class specialCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
         double d=scan.nextDouble();
           scan.nextLine();
           /*scan.nextLine(); এই লাইনটি আমরা ব্যবহার করি কারণ যখন আমরা nextInt() বা nextDouble() এর মতো মেথড দিয়ে ইনপুট নেই, তখন এটি কেবল সংখ্যা অংশটি নেয় এবং লাইনটির শেষে থাকা নিউলাইন ক্যারেক্টার (\n) রেখে যায়। পরবর্তীতে যদি আমরা nextLine() মেথড দিয়ে String ইনপুট নেওয়ার চেষ্টা করি, তবে সেই অবশিষ্ট নিউলাইন ক্যারেক্টারটি nextLine() দ্বারা পড়ে ফেলা হয়, যার ফলে আমরা ইচ্ছাকৃত স্ট্রিং ইনপুটটি নিতে পারি না।

           তাই, scan.nextLine(); একটি খালি লাইন হিসাবে ব্যবহার করা হয় যাতে এই অবশিষ্ট নিউলাইন ক্যারেক্টারটি কনজিউম হয়ে যায় এবং পরবর্তী nextLine() কলটি পুরোপুরি নতুন লাইনের ইনপুট নিতে পারে। */
         String s=scan.nextLine();
        // Write your code here.
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
