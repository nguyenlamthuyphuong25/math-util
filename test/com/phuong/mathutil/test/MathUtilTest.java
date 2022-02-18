/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.test;

import static com.phuong.mathutil.core.MathUtil.*;
import org.junit.Test;
import org.junit.Assert;

//nếu mún xài các hàm static, có 2 cách
//cách 1: gọi tên class.tên hàm static() truyền thống 100 năm nay
//              nhớ import package...tên class chứa hàm static

//cách 2: ko thèm gọi tên class chấm, gọi tên hàm mình ên, giống C
//              nhớ import static package...tên class.tên hàm static ko ngoặc
//                                                          .* lôi tắt các hàm static
/**
 *
 * @author Acer
 */
public class MathUtilTest {
    
        //test case #1: getF() with valid argument
        //n = 0, expedted = 1; actual: đoán xem!!
        @Test //@Test biến 1 hàm trong 1 class bất kì thành main()
        public void testFactorialGivenValidArgumentReturnsWell() {
            long expected = 1; //hy vọng hàm trả về 1 nếu tính 0!
            long actual = getFactorial(0);
            
            Assert.assertEquals(expected, actual);
            //~~~ trong main() kiểu cũ, ta in ra kết quả expected và actual
            //mắt tự nhìn để coi 2 thằng giống nhau hay k
            //bên JUnit, tung 2 màu sắc: XANH: 2 thằng khớp nhau
            //                                           ĐỎ     : 2 thằng ko khớp nhau
        }
        
        
        //test case #2: getF() with valid argument
        //n = 6, expedted = 720; actual: đoán xem!!
        @Test //@Test biến 1 hàm trong 1 class bất kì thành main()
        public void testFactorialGivenValidArgumentN6ReturnsWell() {
            long expected = 720; //hy vọng hàm trả về 1 nếu tính 0!
            long actual = getFactorial(6);
            Assert.assertEquals(expected, actual);
        }
        
        //NGOẠI LỆ THÌ LÀM SAO ĐỂ TEST
        //NHỚ LÀ: NGOẠI LỆ KO PHẢI LÀ 1 VALUE
        //NGOẠI LỆ LÀ 1 TÌNH HUỐNG, THỨ GÌ ĐÓ BẤT THƯỜNG, CÓ KHẢ NĂNG XUẤT/XẢY RA
        //KO LÀ VALUE ĐỂ SO SÁNH KIỂU assertEquals()
        //ngoại lệ ko dùng hàm assertEquals()
        //--> chỉ đo lường = cách coi m có xh hay k
        @Test (expected = IllegalArgumentException.class)
        //Test case #3: getF() with invalid argument
        //n = -5, expected = ngoại lệ phải xuất hiện!
        public void testFactorialGivenInvalidArgumentThrowsException() {
            getFactorial(-5);
        }
        
        
}
