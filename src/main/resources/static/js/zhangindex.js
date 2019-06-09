$(function () {
    $.ajax({
        type:"get",
        url:"../teacher/all.do?page=1",
        dataType:"json",
        success:function (data) {
            if(data.code == 1) {
                $("#marqueeDemo21").empty();
                var infos = data.data.rows;
                $(infos).each(function () {
                    var html = '<li>';
                    html += '<div class="pic"><a href="teachers_info.html"><img src="'+this.te_imgpath+'"/></a></div>';
                    html += '<h1><b>'+this.te_name+'</b><em>高级化妆师、造型师</em></h1>';
                    html += '<dl>毕业于毛戈平形象艺术学校，荣获毛戈平校级发布会“整体造...<a href="teachers_info.html">[详情]</a></dl>';
                    html += '</li>';
                    $("#marqueeDemo21").append($(html));
                })
            }
        }
    })
})

$(function () {
   $.ajax({
       type:"get",
       url:"../findAllCourse.do",
       dataType:"json",
       success:function (data) {
           if(data.code == 1){
               $("#courseinfo").empty();
               var infos = data.data;
               $(infos).each(function () {
                   var html = '<li>';
                   html += '<div class="bgColor"></div>';
                   html += '   <div class="pic"><a href="course_info.html"><img src="'+this.cimg+'"/></a></div>';
                   html += '<h5>'+this.cname+'</h5>';
                   html += '<dl>'+this.cdesc+'<a href="course_info.html">[详情]</a></dl>';
                   html += '</li>';

                   $("#courseinfo").append($(html));
               })
           }
       }
   })
})