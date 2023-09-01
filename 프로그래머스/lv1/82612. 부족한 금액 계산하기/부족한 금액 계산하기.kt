class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var mone = money.toLong()
        for(i in 0..count-1){
             mone = mone - (price * (i+1))
        }
        if(mone < 0)
        {
            answer = (0 - mone).toLong()
        }
        else {answer = 0}

        return answer
    }
}

// 1. 가격 : price // 내가가진돈 : money // 횟수 : count // result : 부족한 금액