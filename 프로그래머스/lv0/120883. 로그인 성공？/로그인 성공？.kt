class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        val dbsize = db.size
    var idArray = arrayOfNulls<String>(dbsize) // gpt에게 물어봄
    var pwArray = arrayOfNulls<String>(dbsize) // gpt에게 물어봄
        for(i in db.indices)
        {idArray[i] = db[i][0]
        pwArray[i] = db[i][1]} // 1차원 배열화 완료
        
        for(i in db.indices)
        {if(idArray[i] == id_pw[0])
            {
                    if(pwArray[i] == id_pw[1])
                    {answer = "login"
                    break}
                    answer = "wrong pw"
                break
            }
        }
        if((answer == "login")||(answer == "wrong pw"))
        {}
        else{answer = "fail"}
        return answer
    }
}
// 2차원 배열이 나오므로 1차원 배열로 분리해보자
// 1차원 배열화 후 머리박다가 잠시 멈추고 생각해보기로 하였다.
// 1. id부터 for로 검사한다. 반복문이 다 끝나도 없으면 fail을 주고
// 1. 반복문 시행중 id가 걸리면 다시 for문을 준다. => 문제를 잘못이해해서 오류났음.
// 1. 그래서 for문 지워주니 답이됨.
// 2. for문에서 비밀번호를 찾아본다. 찾으면 Login을주고 break를 하고
// 2. 위에것도 for문이 아닌 if문으로
// 3. for문이 끝나도 없으면 wrong pw를 준다.
// 3. 위에것도 for문이 아닌 if문으로
// 4. login, wroing pw가 둘다 아니라면 fail 되도록.
// 5. gpt 답변 : https://chat.openai.com/share/1e2ae0b0-64fd-41f1-9319-29904eddc621
