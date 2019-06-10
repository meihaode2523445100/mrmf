$(function () {
    $.ajax({
        type:"get",
        url:"../job",
        dataType:"json",
        success:function(data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li>';
                    html +=    '<a href="javascript:loadJobService('+this.c_id+');">'+this.c_name+'</a>';
                    html +=    '</li>';
                    $("#js1,#js2").append($(html));
                    loadCStar();
                })

            }
        }
    })
});

function loadCStar(page) {
    $(function () {
        $.ajax({
            type: "get",
            url: "../CStar?page="+page,
            dataType: "json",
            success: function (data) {
                if (data.code == 1) {
                    var info = data.data.rows;
                    $(".Honor_list").empty();
                    $(info).each(function (){
                        var html ='<li>';
                        html += ' <div class="pic"><img src="../images/Pic21.jpg" /></div>';
                        html +=    '  <h5>'+this.js_name+'</h5><br>';
                        html +=    '  <h6 class="Info_time">'+this.js_time+'</h6>';
                        html +=    '</li>';
                        $(".Honor_list").append($(html))
                    });
                    var total = data.data.total;
                    //ceil向上取整
                    var totalPage = Math.ceil(total / 3);
                    var pno = $('.now').text();


                    //分页设置
                    $('.M-box').pagination({
                        pageCount: totalPage,  // 总页数
                        current:pno,//当前第几页
                        jump: true,  // 是否显示跳转相关元素
                        jumpBtn: 'go', // 跳转按钮显示文字
                        coping: true,    //是否显示首页末页
                        homePage: '首页',
                        endPage: '末页',
                        prevContent: '<<',  // 上一页功能 显示文字信息
                        nextContent: '>>',
                        callback:function(index){
                            $('.now').text(index.getCurrent());
                            $('.total').text(totalPage);
                            $('.count').text(total);
                            loadCStar(index.getCurrent());//获取当前页
                        }
                    });
                }
            }
        })
    });

}

function loadJStar(page) {
    $.ajax({
        type: "get",
        url: "../JStar?page="+page,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var info = data.data;
                $(".Honor_list").empty();
                $(info).each(function (){
                    var html ='<li>';
                    html += ' <div class="pic"><img src="../images/Pic21.jpg" /></div>';
                    html +=    '  <h5>'+this.js_name+'</h5><br>';
                    html +=    '  <h6 class="Info_time">'+this.js_time+'</h6>';
                    html +=    '</li>';
                    $(".Honor_list").append($(html))
                });

                var total = data.data.total;
                //ceil向上取整
                var totalPage = Math.ceil(total / 3);
                var pno = $('.now').text();


                //分页设置
                $('.M-box').pagination({
                    pageCount: totalPage,  // 总页数
                    current:pno,//当前第几页
                    jump: true,  // 是否显示跳转相关元素
                    jumpBtn: 'go', // 跳转按钮显示文字
                    coping: true,    //是否显示首页末页
                    homePage: '首页',
                    endPage: '末页',
                    prevContent: '<<',  // 上一页功能 显示文字信息
                    nextContent: '>>',
                    callback:function(index){
                        $('.now').text(index.getCurrent());
                        $('.total').text(totalPage);
                        $('.count').text(total);
                        loadJStar(index.getCurrent());//获取当前页
                    }
                });
            }
        }
    })
}


function loadJobServer(page) {
    $.ajax({
        type: "get",
        url: "../jobServer?page="+page,
        dataType: "json",
        success: function (data) {
            if (data.code == 1) {
                var info = data.data;
                $(".Honor_list").empty();
                $(info).each(function (){
                    var html = ' <h5 class="Info_title">'+this.jss_title+'</h5>';
                    html +=    '<h6 class="Info_time">'+this.jss_pushtime+'</h6>';
                    html +=    '<div class="Info_txt">'+this.jss_detail+'</div>';
                    html +=    '  <h5>'+this.jss_pushtime+'</h5>';
                    $(".Honor_list").append($(html))
                });
                var total = data.data.total;
                //ceil向上取整
                var totalPage = Math.ceil(total / 3);
                var pno = $('.now').text();


                //分页设置
                $('.M-box').pagination({
                    pageCount: totalPage,  // 总页数
                    current:pno,//当前第几页
                    jump: true,  // 是否显示跳转相关元素
                    jumpBtn: 'go', // 跳转按钮显示文字
                    coping: true,    //是否显示首页末页
                    homePage: '首页',
                    endPage: '末页',
                    prevContent: '<<',  // 上一页功能 显示文字信息
                    nextContent: '>>',
                    callback:function(index){
                        $('.now').text(index.getCurrent());
                        $('.total').text(totalPage);
                        $('.count').text(total);
                        loadJobServer(index.getCurrent());//获取当前页
                    }
                });
            }
        }
    })
}
function loadJobService(id) {
    //0创业之星，1就业之星，2就业服务
    switch (id) {
        case 0:
            loadCStar(1);
            break;
        case 1:
            loadJStar(1);
            break;
        case 2:
            loadJobServer(1);
            break;
    }
}