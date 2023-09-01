class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        answer = rsp
        answer = answer.replace("2","바") // rsp.replace로 하니까 안됫는데 이유는 몰겠음.
        answer = answer.replace("0","보")
        answer = answer.replace("5","가")
        answer = answer.replace("바","0")
        answer = answer.replace("보","5")
        answer = answer.replace("가","2")

        return answer
    }
}