class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        var s = my_string.toCharArray()
        var size1 = s.size
        var array: IntArray = intArrayOf()
        for (i in 0..size1 - 1) {
            for (j in 0..9) {
                if (s[i] == (j + '0'.toInt()).toChar()) {
                    array = array.plus(j)
                    break
                }
            }
        }
        var size2 = array.size
        var state = 0
        for (k in 0..9) {
            state = 0
            while (state == 0) {
                for (l in 0..size2 - 1) {
                    if (k == array[l]) {
                        answer = answer.plus(k)
                    
                    }
                    if (l == size2 - 1) {
                        state = 1
                    }
                }
            }
        }

        return answer
    }
}
// 1. char배열로
// 2. for 0..size-1 까지 하고
// 3. for 0..9까지 해서 '0'~'9'까지 있는지 확인
// 4. 있으면 새로운 배열에 담고
// 5. 오름차순을 하기 위한 방법 생각하기
// 6. 일단 intarray로 바꿔주고 => 그냥 인덱스를 담음
// 7. for i in 0..size2-1 해주고
// 8. for j in 0..9 해주고
// 9. 발견되는거 i로 바꿔주고, break  
// 10. 코드짜기 시작 !
// 11. 문제점 발생. 7~8에서 0~9에대해 한번밖에 검사를 못함.
// 12. while을 통해 찾아야만 넘어갈수 잇게끔 해보자.