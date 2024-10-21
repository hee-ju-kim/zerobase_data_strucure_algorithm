**Deque**

- 양방향에서 삽입/삭제 가능한 구조
- 일부 기능을 제한하여 용도에 맞게 변형가능
- 데이터 추가: add / offer
- 데이터 삭제: remove / poll
- add/remove -> 공간이 부족할때 Exception 반환
- offer/poll -> 공간이 부족할때 null/false 반환

- 입력제한 데크(Scroll)
  - 한쪽의 입력을 제한한 데크
- 출력제한 데크(Shelf)
  - 한쪽의 출력을 제한한 데크