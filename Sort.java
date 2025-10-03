
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import sorting.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }

}

public class Sort {
    static public void readfile() throws Exception {
        FileReader fs = new FileReader("C:\\Users\\kaika\\OneDrive\\Desktop\\java\\praveen.txt");

    }

    public static void main(String[] args) {
        // try {
        // FileOutputStream myfile=new
        // FileOutputStream("C:\\Users\\kaika\\OneDrive\\Desktop\\java\\praveen.txt");

        // String data="hello my name is praveen";
        // myfile.write(data.getBytes());
        // myfile.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // int arr[]={10,5,7,9,3};
        // SelectionSort ss=new SelectionSort();
        // BubbleSort bb=new BubbleSort();
        // InsertionSort is=new InsertionSort();
        // QuickSort q=new QuickSort() ;
        // q.sort(arr,5);
        // System.out.println(Arrays.toString(arr));
        // try {
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        //     Connection con = DriverManager.getConnection(
        //             "jdbc:mysql://localhost:3306/praveen", "root", "Praveen@123");
        //     Statement st=con.createStatement();
        //     ResultSet rs=st.executeQuery("Select * from students");
        //     while (rs.next()) {
        //         System.out.println(rs.getString(0));
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
        MergeSort mg=new MergeSort();
        int arr[]={3,5,7,9,10,1,8,4};
        mg.sort(arr, 0, 7);
        System.out.println(Arrays.toString(arr));
    }
}
