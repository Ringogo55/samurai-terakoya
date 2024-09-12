$(function() {
  console.log('loadイベントが発生しました');
  $(window).on('scroll', (e) => {
    //loadされた時
    if(e.type === 'scroll') {
      console.log('scrollイベントが発生しました');
    }
  });

});

