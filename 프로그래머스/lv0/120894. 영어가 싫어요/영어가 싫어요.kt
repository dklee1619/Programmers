class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0
        var cA = numbers.toCharArray()
        val size = cA.size
        var arr = CharArray(size)
        var count = 0
        for (i in 0..size-1) {
             if((i!=(size-1))){
            when (cA[i]) {
                'z' -> if ((cA[i + 1] == 'e') && (cA[i + 2] == 'r') && (cA[i + 3] == 'o')) {
                    arr[count] = '0'
                    count++
                }

                'o' -> if ((cA[i + 1] == 'n') && (cA[i + 2] == 'e')) {
                    arr[count] = '1'
                    count++
                }

                't' -> if ((cA[i + 1] == 'w') && (cA[i + 2] == 'o')) {
                    arr[count] = '2'
                    count++
                } else if ((cA[i + 1] == 'h') && (cA[i + 2] == 'r') && (cA[i + 3] == 'e') && (cA[i + 4] == 'e')) {
                    arr[count] = '3'
                    count++
                }

                'f' -> if ((cA[i + 1] == 'o') && (cA[i + 2] == 'u') && (cA[i + 3] == 'r')) {
                    arr[count] = '4'
                    count++
                } else if ((cA[i + 1] == 'i') && (cA[i + 2] == 'v') && (cA[i + 3] == 'e')) {
                    arr[count] = '5'
                    count++
                }

                's' -> if ((cA[i + 1] == 'i') && (cA[i + 2] == 'x')) {
                    arr[count] = '6'
                    count++
                } else if ((cA[i + 1] == 'e') && (cA[i + 2] == 'v') && (cA[i + 3] == 'e') && (cA[i + 4] == 'n')) {
                    arr[count] = '7'
                    count++
                }

                'e' -> if ((cA[i + 1] == 'i') && (cA[i + 2] == 'g') && (cA[i + 3] == 'h') && (cA[i + 4] == 't')) {
                    arr[count] = '8'
                    count++
                }

                'n' -> if ((cA[i + 1] == 'i') && (cA[i + 2] == 'n') && (cA[i + 3] == 'e')) {
                    arr[count] = '9'
                    count++
                }

            }
             }
        }
        answer = arr.copyOf(count).joinToString("").toLong()
        return answer
    }
}

// 1. 그냥 맨마지막 문제 그대로인데..
// 2. 그래서 복붙하니까 끝남.