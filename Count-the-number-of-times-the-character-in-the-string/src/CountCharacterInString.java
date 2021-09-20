public class CountCharacterInString {
    public static void main(String[] args) {
       int a = countCharacter("thaivu",'a');
        System.out.println(a);
    }

    //todo tên phương thức: countCharacter
    //todo tham số: chuỗi,1 ký tự muốn tìm
    //todo dữ liệu trả về: số lượng (int)
    public static int countCharacter(String text, char character){
        int count = 0;
        for (int i = 0; i< text.length();i++){
            char a = text.charAt(i);
            if (a == character) count++;
        }
        return count;
    }
}
