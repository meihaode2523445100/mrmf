$(function () {
    $.ajax({
        type:"get",
        url:"../aboutSchool",
        dataType:"json",
        success:function(data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li>';
                    html +=    '<a href="javascript:loadAboutSchool('+this.id+');">'+ this.c_name+'</a>';
                    html +=    '</li>';
                    $("#sc1,#sc2,#aboutSchool").append($(html));
                    loadschoolpro();
                })

            }
        }
    })
});

function loadschoolpro() {
    $(function () {
        $.ajax({
            type: "get",
            url: "../schoolProfile",
            dataType: "json",
            success: function (data) {
                if (data.code == 1) {
                    var info = data.data;
                    $(".RightSidebar").empty();
                    $(info).each(function (){
                        var html = ' <div class="current">';
                        html += ' <h1>学校简介<em>School Profile</em></h1>';
                        html += ' <dl><a href="#">首页</a> > <a href="#">学校概况</a> > <span>学校简介</span></dl>';
                        html += '  </div>';
                        html += '  <div class="MainContent">';
                        html += '      <p style="padding-bottom:20px;"><img src="../images/Pic20.jpg" /></p>';
                        html += '      <p style="font-size:14px;">'+this.sp_introduction+'</p><br>';
                        html += '  <div class="space20"></div>';
                        html += ' </div>';
                        $(".RightSidebar").append($(html))

                    })
                }
            }
        })
    });

}

function loadAboutSchool(id) {
    //1学校简介,2校长致辞,3学校环境,4学校荣誉,5学校快讯
    switch (id) {
        case 1:
            loadschoolpro();
            break;
        case 2:
            $(function () {
                $.ajax({
                    type: "get",
                    url: "../schoolMaster",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 1) {
                            var info = data.data;
                            $(".RightSidebar").empty();
                            $(info).each(function (){
                                var html = ' <div class="current">';
                                html += ' <h1>校长致辞<em>School Master</em></h1>';
                                html += ' <dl><a href="#">首页</a> > <a href="#">学校概况</a> > <span>校长致辞</span></dl>';
                                html += '  </div>';
                                html += '  <div class="MainContent">';
                                html += '     <p style="padding-bottom:20px;"><img src="../images/Pic20.jpg" /></p>';
                                html += '        <p style="font-size:14px;">'+this.sm_time+'</p>';
                                html += '       <p style="font-size:14px;">'+this.sm_letter+'</p><br>';
                                html += '  <div class="space20"></div>';
                                html += ' </div>';
                                $(".RightSidebar").append($(html))

                            })
                        }
                    }
                })
            });
            break;
        case 3:
            $(function () {
                $.ajax({
                    type: "get",
                    url: "../schoolEnvir",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 1) {
                            var info = data.data;
                            $(".RightSidebar").empty();
                            $(info).each(function (){
                                var html = ' <div class="current">';
                                html += ' <h1>学校环境<em>School Envir</em></h1>';
                                html += ' <dl><a href="#">首页</a> > <a href="#">学校概况</a> > <span>学校环境</span></dl>';
                                html += '  </div>';
                                html += '  <div class="MainContent">';
                                html += '    <ul class="News_list">';
                                html += '     <li class="top">';
                                html += '       <p class="pic"><img src="../images/Pic22.jpg" /></p>';
                                html += '       <h5>'+this.se_title+'</em></h5>';
                                html += '     </li>';
                                html += '    </ul>';
                                html += '  <div class="space20"></div>';
                                html += ' </div>';
                                $(".RightSidebar").append($(html))

                            })
                        }
                    }
                })
            });
            break;
        case 4:
            $(function () {
                $.ajax({
                    type: "get",
                    url: "../schoolHonor",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 1) {
                            var info = data.data;
                            $(".RightSidebar").empty();
                            $(info).each(function (){
                                var html = ' <div class="current">';
                                html += ' <h1>学校荣誉<em>School Honor</em></h1>';
                                html += ' <dl><a href="#">首页</a> > <a href="#">学校概况</a> > <span>学校荣誉</span></dl>';
                                html += '  </div>';
                                html += '  <div class="MainContent">';
                                html += '    <ul class="News_list">';
                                html += '     <li class="top">';
                                html += '       <div class="pic"><img src="../images/Pic26.jpg" /></div>';
                                html += '       <h5>'+this.sh_title+'</h5>';
                                html += '     </li>';
                                html += '    </ul>';
                                html += '  <div class="space20"></div>';
                                html += ' </div>';
                                $(".RightSidebar").append($(html))
                            })
                        }
                    }
                })
            });
            break;
        case 5:
            $(function () {
                $.ajax({
                    type: "get",
                    url: "../schoolNews",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 1) {
                            var info = data.data;
                            $(".RightSidebar").empty();
                            $(info).each(function (){
                                var html = ' <div class="current">';
                                html += ' <h1>学校快讯<em>School News</em></h1>';
                                html += ' <dl><a href="#">首页</a> > <a href="#">学校概况</a> > <span>学校快讯</span></dl>';
                                html += '  </div>';
                                html += '  <div class="MainContent">';
                                html += '    <ul class="News_list">';
                                html += '     <li class="top">';
                                html += '       <div class="pic"><img src="../images/Pic23.jpg" /></div>';
                                html += '       <h5>'+this.sn_title+'<em>发布时间：'+this.sn_pushtime+'</em>'+this.sn_detail+'</h5>';
                                html += '     </li>';
                                html += '    </ul>';
                                html += '  <div class="space20"></div>';
                                html += ' </div>';
                                $(".RightSidebar").append($(html))

                            })
                        }
                    }
                })
            });
            break;
    }
}

