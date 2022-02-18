/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.test;

import static com.phuong.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Acer
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    public MathUtilDDTTest() {
    }
        //ta cần test thử hàm getF() bên code chính chạy đúng k
        //rõ ràng ta phải đưa data cho hàm, xong xem nó trả về gì
        //so sánh kết luận hàm đúng sai
        //3 việc: chuẩn bị data, đưa data vào hàm (gọi hàm)
        //                                  kết luận đúng sai
        //done ở bên MathUtilTest rồi, NHƯNG
        
        //0!, 0 -> 1
        //1!, 1 -> 1
        //2!, 2 -> 2                bộ dữ liệu test, test data
        //3!, 3 -> 6                lưu table SQLServer, Excel, .CSV
        //5!, 5 -> 120            lưu trong 1 mảng trong code cũng oke
        //6!, 6 -> 720
        //mảng 2 chiều [6] [2]
        //[10][20]
        
        //học cách viết code tách đám data ra khỏi các câu lệnh
        //getF(), ko mixed. Tất cả các framework UnitTest của mọi NNLT đều làm dc điều này!
        
        //hàm trả về mảng 2 chiều kiểu object
        //vì các framework chơi vs object ko, mảng số nguyên
        //phải hiểu là object, tức là chơi với Wrapper Class nếu
        //mảng số...
        //Wrapper class: Integer(int), Long(long), Character(char)
    
    //báo JVM JUnit đây là data nguồn!! dùng nhồi vào Parameterized
    @Parameterized.Parameters
        public static Object[][] initData() {
            //int a[] = {2, 4, 6, 8};
            //int a[4] = {2, 4, 6, 8};
            //int a[] = {0, 1}
            
            return new Integer[][] {
                                                    {0, 1},
                                                    {1, 1},
                                                    {2, 2},
                                                    {3, 6},
                                                    {6, 720}
             };
        }

        //cần trích mảng con ra để dc cặp value input/expected
        @Parameterized.Parameter(value = 0) //map cột 0
        public int input;
        
        @Parameterized.Parameter(value = 1) //map cột 2
        public int expected;
        
        @Test
        public void testFactorialGivenValidArgumentReturnsWell() {
            //long actual = getFactorial(input);
            Assert.assertEquals(expected, getFactorial(input));
        }
}
        //DDT tách data cần test ra 1 chỗ. Sau đó lấy từng miếng data
        //mồi/nhồi/lắp/map và trong chỗ gọi hàm, chỗ assert()
        //tách và nhồi vào  -> làm hoài như vậy cho các bộ data
        //phải thông qua tên biến/tham số
        //DDT còn dc gọi tên là: THAM SỐ HÓA TEST DATA PARAMETERIZED
