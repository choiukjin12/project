var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(37.6563583788839, 127.06343442037239), // 지도의 중심좌표
        level: 2 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
 
// 마커를 표시할 위치와 내용을 가지고 있는 객체 배열입니다 
var positions = [
    {
        content: '<div class="marker">에이블짐 노원본점</div>', 
        latlng: new kakao.maps.LatLng(37.65665787748533, 127.06357916682649),
   },
    {
        content: '<div class="marker">와우짐 노원점</div>', 
        latlng: new kakao.maps.LatLng(37.65668243542254, 127.06398433116033 )
    },
    {
        content: '<div class="marker">뷰티짐</div>', 
        latlng: new kakao.maps.LatLng(37.655650028289365, 127.06541134342837)
    },
    {
        content: '<div class="marker">바디짐 헬스</div>',
        latlng: new kakao.maps.LatLng(37.656604486092, 127.0664547864153)
    },
    {
        content: '<div class="marker">크로스핏 블리리언트</div>',
        latlng: new kakao.maps.LatLng( 37.65733502688685, 127.0651181693316)
    },
    {
        content: '<div class="marker">아이언 휘트니스</div>',
        latlng: new kakao.maps.LatLng(37.654128561430674, 127.06322287600598)
    },
    {
        content: '<div class="marker">재미짐 노원점</div>',
        latlng: new kakao.maps.LatLng(37.65321958037771, 127.06130697095786)
    },
    {
        content: '<div class="marker">버클다운짐</div>',
        latlng: new kakao.maps.LatLng(37.65814777355016, 127.0616510102199)
    },
    {
        content: '<div class="marker">에블짐 노원역점</div>',
        latlng: new kakao.maps.LatLng(37.653544395806975, 127.06041199376021)
    },
    {
        content: '<div class="marker">크로스핏 라쿤짐</div>',
        latlng: new kakao.maps.LatLng(37.65323873908073, 127.059074551355)
    },
    {
        content: '<div class="marker">비나이더 상계점</div>',
        latlng: new kakao.maps.LatLng( 37.652553199101675, 127.06063783187406)
    }
];

for (var i = 0; i < positions.length; i ++) {
    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        map: map, // 마커를 표시할 지도
        position: positions[i].latlng // 마커의 위치
    });

    // 마커에 표시할 인포윈도우를 생성합니다 
    var infowindow = new kakao.maps.InfoWindow({
        content: positions[i].content // 인포윈도우에 표시할 내용
    });

    // 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
    // 이벤트 리스너로는 클로저를 만들어 등록합니다 
    // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
}


// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };
}

// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
function makeOutListener(infowindow) {
    return function() {
        infowindow.close();
    };
}