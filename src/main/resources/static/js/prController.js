$(function () {
    $.ajax({
        type:"get",
        url:"../productionType/all.do",
        dataType:"json",
        success:function (data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li id="menu1"><a href="javascript:findProductIdAndPage('+this.pr_type_id+', 1);" >'+this.pr_type+'</a></li>';
                    $("#productType,#titleId,#titleId2").append($(html))
                })
            }
        }
    })
})