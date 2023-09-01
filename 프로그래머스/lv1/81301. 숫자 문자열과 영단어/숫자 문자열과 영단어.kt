class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var cA = s.toCharArray()
        val size = cA.size
        var arr = CharArray(size)
        var count = 0 // 배열 추가할때마다 카운트 세서 나중에 추가안해준 인덱스 없앨꺼임
        for (i in 0..size-1) {
            for (j in 0..9) {
                if (cA[i].toInt() - '0'.toInt() == j) {
                    arr[count] = cA[i]
                    count++
                    break
                }
            }
            if((i!=(size-1)))
            {
                when(cA[i])
                {
                    'z' -> if((cA[i+1]=='e')&&(cA[i+2]=='r')&&(cA[i+3]=='o')){arr[count] = '0'
                    count++}
                    'o' -> if((cA[i+1]=='n')&&(cA[i+2]=='e')){arr[count] = '1'
                        count++}
                    't' -> if((cA[i+1]=='w')&&(cA[i+2]=='o')){arr[count] = '2'
                        count++}
                    else if((cA[i+1]=='h')&&(cA[i+2]=='r')&&(cA[i+3]=='e')&&(cA[i+4]=='e')){arr[count] = '3'
                        count++}
                    'f' -> if((cA[i+1]=='o')&&(cA[i+2]=='u')&&(cA[i+3]=='r')){arr[count] = '4'
                        count++}
                    else if((cA[i+1]=='i')&&(cA[i+2]=='v')&&(cA[i+3]=='e')){arr[count] = '5'
                        count++}
                    's' -> if((cA[i+1]=='i')&&(cA[i+2]=='x')){arr[count] = '6'
                        count++}
                    else if((cA[i+1]=='e')&&(cA[i+2]=='v')&&(cA[i+3]=='e')&&(cA[i+4]=='n')){arr[count] = '7'
                        count++}
                    'e' -> if((cA[i+1]=='i')&&(cA[i+2]=='g')&&(cA[i+3]=='h')&&(cA[i+4]=='t')){arr[count] = '8'
                        count++}
                    'n' -> if((cA[i+1]=='i')&&(cA[i+2]=='n')&&(cA[i+3]=='e')){arr[count] = '9'
                        count++}

                }
            }

        }
         answer = arr.copyOf(count).joinToString("").toInt() // 빈 인덱스 없애주기 위해 arr.copyOf(count) 로 현재 배열을 count 크기까지만 복사하고 이후 string 데이터 하나로 합쳐주고, Int형으로 바꿔주고.
        println(answer)
        return answer
    }
}
// 1. 문자열 데이터를 Char배열로 바꾸고, 그 배열의 크기만큼 해서
// 2. for 0부터 length만큼 돌린다
// 3. 그안에서 다시 for로 0~9를 확인해보고
// 4. 없으면 이제 그건 글자라는거니까 바꿔줄 준비를 한다.
// 5. 근데 원래 배열을 건드리면 i에 영향가니까 다른 리스트에 넣어주는것과
// * 리스트는 배열의 크기가 정해지지 않았기때문에 리스트에넣고 배열로 바꿔주는것
// 5-2. 문자열은 3~5개라 for에서 예를들어 i=3에서 i=6으로 넘어가는것을 gpt에게물어보앗는데
// 5-2. 그냥 내가아는것으로 구현할 수 잇었음.. continue와 if문으로 구현..
// 6. 리스트 선언하는거 gpt에게 물어보고
// 7. 이제 코딩짜기
// 8. 자꾸실수함. size랑 length 잘못쓰고, 또 ()붙일떄도 안붙일때도있고,
// 8. 또 자꾸 1칸차이. size 1뺴줘야하는거 까먹고.
// 9. state로 알파벳일때 적절하게 넘겨주는로직 완성하고 char 리스트를 int형 데이터로
// 9. 바꾸는거만 해주며 ㄴ될듯. int형 데이터로 바꾸는건 gpt에게
// 10. 재점검. for로 1개1개 검사할 때
// 10. 0~9면 list.add 그리고 알파벳이면 when 검사 그리고 아무것도없으면 다음 반복문.
// 11. 오류 발생 gpt에게 물어봤더니 "오류의 원인은 빈 문자열("")을 숫자로 변환하려고 했기 때문입니다." 라고 한다
// 12. 코드를 다시금 보니까 size는 one23four 이런식으로 알파벳까지 생각해버린 크기. 여기서 문제가 발생한건가?
// 13. 아니. 나는 List를 추가해주었고, 조건 하에서만 숫자를 추가해줬고 리스트에 빈 값이 있다고는 생각이 들지 않아.
// 14. 그래도 안되니까, 배열로 바꿔주었음. count를 세서 count랑 동일한 인덱스를 바꿔주고 count 추가해준뒤
// 15. 나중에 count의 크기로 새 배열 만드는 식으로.
// 16. 뭔가 이상해서 디버그를 해보니, CharArray의 요소 2에 대해서, int형 데이터 2를 toChar() 해줘도 같다고 되지가 않음.
// 17. gpt와 디버그를 통해 어디가 오류인지 알 수 잇었음.
// 17. 처음부터 cA[i] == j.toChar() 여기서 문제가 발생. 이걸 cA[i].toInt() - '0'.toInt() == j 이렇게 바꿔줘야 내가 하고자 하던것을 할 수 잇었음.


// 18. 이걸 모르고 괜히 엄한것만 건드리느라 시간을 정말 많이 낭비함.
// 19. 그리고 when으로 알파벳 찾는거도 좀 심하게 지저분한것 같음. for도 불필요하게 많이 돌리는것 같고.
// 20. 나중에 배열과 맵 리스트 숫자간 비교 등등 여러 개념들을 정리할 필요를 느낌. 
// 21. gpt 답변 : https://chat.openai.com/share/cf2fa1f7-81e5-4dae-92e7-aa52c64e395a