class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        var n = board.size
        var board2: Array<IntArray> = Array(n) { IntArray(n) { 0 } }
        var count = 0
        for (i in 0..n - 1) {
            for (j in 0..n - 1) {
                if ((board[i][j] == 1)) {
                    for (k in 0..2) {
                        if (i - 1 + k > n - 1) {
                            break
                        } else if (i - 1 + k < 0) {
                            continue
                        }
                        for (l in 0..2) {
                            if (j - 1 + l > n - 1) {
                                break
                            } else if (j - 1 + l < 0) {
                                continue
                            }
                            board2[i - 1 + k][j - 1 + l] = 1
                        }
                    }
                }
            }
        }
        for (a in 0..n - 1) {
            for (b in 0..n - 1) {
                if (board2[a][b] != 1) {
                    count++
                }
            }
        }
        answer = count
        return answer
    }
}
// 1. board는 n*n배열
// 2. 그러면 board[0][0]부터 board[n-1][n-1]까지 표기될듯
// 3. 지뢰가 [x][y]에 있으면 [x-1][y-1] 부터 [x+1][y+1]은 위험해짐
// 4. 그러면 board와 같은 크기의 2차원 배열을 한개 더 만들고 그걸 1로만들어서 하면
// 5. 이후 [0][0] 부터 [n-1][n-1]까지 1을 세면 될듯
// 6. 2차원 배열이니 for 2번감싸기
// 7. gpt에게 2차원 배열의 크기 빼오기. 코틀린 물어봄
// 8. 짯는데 계속 오류가 뜸. 배열 크기 오류.
// 9. 인덱스의 범위를 넘어서거나, 혹은 인덱스가 -1이되거나 두경우에 대해 조건문을 붙여줌.if와 else if로
// 10. 근데 논리에 오류가 있음.
// 11. 혹시 같은 객체가 되는건가 해서 var board2 = board.copyOf() 로 수정.
// 12. 그래도 똑같음.
// 13. 그래도 아무리봐도 오류가없어서 그냥 gpt한테 물어보고
// 13. var board2 = board.copyOf()를 
// 13. var board2: Array<IntArray> = Array(n) { IntArray(n) { 0 } }로 고쳤더니 됨.
// 14. 2개가 겹치는게 문제가 되는게 맞았음. 이유는 모름 나중에 gpt에게 질문해보자.
// 15. gpt 답변 : https://chat.openai.com/share/82c3c90f-57bc-4910-bc7b-24363c49ffbf


