class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        var count:Int = 0
        for(i in array.indices){
        if(array[i] > height)
            {count++}
        }
        answer = count
        return answer
    }
}

// 정수 배열 array에서 특정 원소 height가 배열에 담김
// height보다 큰 값을 리턴?
// 우선 겹치는것을 방지하기위해 height의 인덱스부터 받아와서
// 그 인덱스일때는 for문을 돌릴때 패스하게끔 해야함. 이 아니고, 어짜피 같으면
// 순서 정할지 안정해줫으니 같은키는 없다고 가정.큰거만 구해보자.
