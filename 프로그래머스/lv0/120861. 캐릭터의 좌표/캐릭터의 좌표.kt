class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        val xMax = (board[0] -1 ) / 2
        val yMax = (board[1] -1 ) / 2
        for(i in keyinput.indices)
        {when(keyinput[i]){
        "left" -> {if(answer[0]>-xMax){answer[0]=answer[0]-1}}
        "right" -> {if(answer[0]<xMax){answer[0]=answer[0]+1}}
        "up" -> {if(answer[1]<yMax){answer[1]=answer[1]+1}}
        "down" -> {if(answer[1]>-yMax){answer[1]=answer[1]-1}}
        }
        }
            return answer
    }
}

// 1. 그냥 뭘 정리하기전에 짜다보니 끝남.
// 2. 코드실행하고 잘돌아가길래 Max값넣어주고 그러니 잘되고 걍 끝.