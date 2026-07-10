package lab;

/**
 * ==========================================================================
 * ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 * โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 * หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 * ต้องมีอย่างน้อย:
 * - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 * - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 * - @return  อธิบายค่าที่คืน 
 * - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * ค้นหาดัชนี (index) แรกที่พบค่าที่กำหนดภายในอาร์เรย์ของจำนวนเต็ม
     *
     * @param arr อาร์เรย์ของจำนวนเต็มที่ต้องการค้นหา 
     * @param key ค่าจำนวนเต็มที่ต้องการค้นหาในอาร์เรย์
     * @return -1 หากไม่พบค่านั้นในอาร์เรย์
     * @throws IllegalArgumentException ถ้าอาร์เรย์ที่ส่งเข้ามามีค่าเป็น null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * คำนวณหาพื้นที่ของวงกลมจากรัศมีที่กำหนดให้
     *
     * @param radius รัศมีของวงกลม 
     * @return พื้นที่ของวงกลมที่คำนวณได้เป็นทศนิยม 
     * @throws IllegalArgumentException ถ้าค่ารัศมีที่ส่งเข้ามามีค่าน้อยกว่า 0 (ติดลบ)
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    /**
     * ปรับรูปแบบของข้อความให้เป็นมาตรฐาน โดยการตัดช่องว่างหน้า-หลัง และแปลงเป็นตัวพิมพ์เล็กทั้งหมด
     * @param radius คำนวนรัสมี
     * @throws illegalArgumentException เมื่อ radius น้อยกว่า 0
     * @return คืนค่าเป็นข้อความว่าง ("") หากข้อความที่ส่งเข้ามาเป็น null
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}