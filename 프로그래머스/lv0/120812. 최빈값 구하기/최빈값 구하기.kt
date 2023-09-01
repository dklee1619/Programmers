class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var count: Int = 0
        var countbest: Int = 0
        for(i in array) // i번째 배열 요소 1~100 까지
        {
            for(j in array.indices) // j번째 인덱스 1에대해서 1,2,3,3,3,4 검사, 2에대해서 1,2,3,3,3,4검사 , 3에대해서 1,2,3,3,3,4 검사 , 3에대해서 1,2,3,3,3,4 검사 ....
            {
                if(i == array[j])
                {count ++}

            }
            if(count>countbest) // 현재 카운터 베스트보다 카운터가 더 크면
            {countbest = count // 카운터베스트를 갱신해주고
                answer = i} // 어떤 요소가 제일 큰지 갱신
            else if( (count == countbest) && (answer != i)) // 숫자가 겹치는거 때문에 answer이 이미 검사했던 배열의 요소가 아니여야되서  (answer != i) 추가
            {answer = -1} // 카운터와 카운터 베스트가 같으면 최빈값이 여러개
            count = 0 // 한번 검사하고 초기화해주기222

        }
        return answer
    }
}