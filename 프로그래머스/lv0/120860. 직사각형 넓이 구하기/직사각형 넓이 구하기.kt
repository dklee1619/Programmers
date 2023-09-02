class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var xArray: IntArray = IntArray(dots.size)
        var yArray: IntArray = IntArray(dots.size)
        var xmin = 256
        var xmax = -256
        var ymin = 256
        var ymax = -256
        for(i in 0..dots.size-1){
            xArray[i] = dots[i][0]
            yArray[i] = dots[i][1]
        } // 4. 1차원 배열화 완료
        for (i in 0..dots.size-1){
            if(xmin>=xArray[i])
            {xmin=xArray[i]}
            if(xmax<=xArray[i])
            {xmax=xArray[i]}
            if(ymin>=yArray[i])
            {ymin=yArray[i]}
            if(ymax<=yArray[i])
            {ymax=yArray[i]} // 8. x,y 최댓값과 최솟값 찾기
        }
        answer = (xmax-xmin) * (ymax-ymin)
        return answer
    }
}

// 1. x축,y축과 평행함
// 2. 2차원배열은 못다루겟어. 1차원 배열 x 와 1차원 배열 y로 나눠야지
// 3. xArray: IntArray = IntArray(dots.size)
// 3. yArray: IntArray = IntArray(dots.size)
// 4. for(i in 0..dots.size-1){}

// 5. 가장 작은 x,y를 찾고
// 6. 가장 큰 x,y를 찾아서
// 7. (xMax - xMin ) * (yMax - yMin) 하면 답이나올꺼
// 8. 가장 작은 x,y를 찾는 과정