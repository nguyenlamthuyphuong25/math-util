/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.main;

import com.phuong.mathutil.core.MathUtil;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        //ta kiểm thử bằng cách gọi hàm, với data đưa vào, chạy, và
        //nhìn kết quả của hàm trả về (ACTUAL) so sánh với cái ta hy vọng nó sẽ trả về (EXPECTED)
        //ví dụ 5! thì ta hy vọng nhận về expected = 120 
        //              thực tế hàm getFI(5) trả về mấy actual = ?
        //chạy mới biết
        //cuối cùng: so sánh expedted vs actual
        //để đảm bảo hàm dúng, ta phải chia các trường hợp/nghĩ ra
        //các tình huống hàm sẽ dc xài, tức là nghĩ ra các bộ data
        //dưa cho hàm, hàm chạy, output, kết luận
        //mỗi bộ DATA ĐƯA VÀO, MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MỤC ĐÍCH NÀO ĐÓ
        //==> TA GỌI LÀ TEST CASE - TÌNH HUỐNG TEST
        //n = 5, gọi hàm getF() -> test case
        //n = -5, gọi hàm getF() -> test case
        
        //Test case #1: check getF() with valid argument
        //n = 0, expedted = 1; actual: đoán xem!!
        long expected = 1; //em hy vọng
        long actual = MathUtil.getFactorial(0); //đoán xem
        //compare
        System.out.println("0! -> expected: " + expected
                                             + "; actual: " + actual);
        
        //Testcase #2: check getF() with valid argument
        //n = 6, expected 720, actual: đoán xem!!!
        expected = 720; //em hy vọng
        actual = MathUtil.getFactorial(6); //đoán xem có phải 720 hem?
        //compare
        System.out.println("6! -> expected: " + expected
                                             + "; actual: " + actual);
        
        //Testcase #3: check getF() with Invalid argument
        //n = -5, expected = ??? --> phải ném ra ngoại lệ
        //thấy ngoại lệ mừng rớt nc mắt
        //expected = Exception sẽ phải xuất hiện, ko là long, thấy nó hoi
        System.out.println("Check if exception is thrown");
        MathUtil.getFactorial(-5); //đoán xem có ngoại lệ hong
        //nhìn = mắt để tìm ngoại lệ xh
        //thiết kế -5 phải xh, giờ chạy -5 có Ex xuất hiện, rõ ràng app/hàm chạy đúng như thiết kế, ngoại lệ xh như kì vọng
        //mừn
        //5 phải 120
        //-5 phải ngoại lệ
    }
}
