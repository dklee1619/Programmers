class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        var ss = s.toCharArray()
        var size = ss.size
        var count = 0
        if((size==4)||(size==6))
        {
        for(i in 0..size-1)
        {
           
            for(j in 0..9)
            {
                if((ss[i]==((j + '0'.toInt()).toChar())))
                {count++
 break
                }
                //  if(j.toInt() == ss[i].toInt())
                // {count++
                //     break
                // }
            }
        }
        if(count==size)
        {answer = true}
        else
    {answer = false}}
        else
        {answer = false}
        return answer
    }
}

// 1. 문자열 데이터를 배열로 바꾼후에
// 2. for(i in 0..size) 안에 for(i 0..9) 로 해서
// 3. 그리고 2번쨰 for안에는 break 넣어서
// 4. 확인하면될듯
// 5. char형 데이터를 index와 비교할땐 이전에 배운
// 6. (ss[i]==((j + '0'.toInt()).toChar())) 이러한 형식으로
// 7. 우선은 오류가 뜸.
// 8. 너무답답해서 다른 사람의 풀이 보니까 4,6도 조건에 줘야하는거였음 .........