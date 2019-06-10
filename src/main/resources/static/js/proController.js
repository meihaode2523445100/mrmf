$(function () {
    $.ajax({
        type:"get",
        url:"../productionType/all.do",
        dataType:"json",
        success:function (data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li id="menu1"><a href="product.html" >'+this.pr_type+'</a></li>';
                    $("#productType,#titleId").append($(html))
                })
            }
        }
    })
})