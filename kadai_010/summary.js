$(function() {
  //id要素change-colorがクリックされたら
  $('#change-color').on('click', function() {
  //文字の色を赤に変化
    $('#target').css('color', 'red');
  });
  //id要素change-textがクリックされたら
  $('#change-text').on('click', function() {
  //文字のを'Hello'に変更
    $('#target').text('Hello');
  });
  //id要素fade-outがクリックされたら
  $('#fade-out').on('click', function() {
  //文字をフェードアウト
  $('#target').fadeOut();
  });
  //id要素fade-inがクリックされたら
  $('#fade-in').on('click', function() {
  //文字をフェードイン
  $('#target').fadeIn();
  });
});