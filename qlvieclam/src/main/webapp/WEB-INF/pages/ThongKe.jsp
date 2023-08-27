<%-- 
    Document   : ThongKe
    Created on : Aug 20, 2023, 8:48:46 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h2 style="margin-left: 500px;">THỐNG KÊ</h2>
    <form>



        <input class="form-control me-auto" type="number" id="year"  placeholder="Nhập năm cần thống kê .....">
        <button class="btn btn-primary" onClick="showName()" type="button">Thống kê theo năm</button>

        <button class="btn btn-primary" onClick="GetName()" type="button">Thống kê theo số lượng</button>
        <button class="btn btn-primary" onClick="destroy()" type="button">Xoá</button>

    </form>
    <canvas id="myChart" style="width: auto;">

    </canvas>

</div>
<script>
    const ctx = document.getElementById('myChart');
    let name = [];
    let number = [];
   
    var chart;
    function destroy() {
        chart.destroy();
        document.getElementById("year")===null;
    }
    function showName() {

 var year = document.getElementById("year").value;
        if (year)
        {
            $.ajax({
                url: "http://localhost:8080/QLViecLam/api/GetNameByYear/" + year,
                method: "GET",
                success: function (n) {
                    name = n;
                    console.log(name);
                    $.ajax({
                        url: "http://localhost:8080/QLViecLam/api/GetNumber/" + year,
                        method: "GET",
                        success: function (res) {
                            number = res;
                            console.log(number);
                            chart = new Chart(ctx, {
                                type: 'bar',
                                data: {
                                    labels: name,
                                    datasets: [{
                                            label: 'Số lượng nghề trong năm',
                                            data: res,
                                            borderWidth: 1
                                        }]
                                },
                                options: {
                                    scales: {
                                        y: {
                                            beginAtZero: true
                                        }
                                    }
                                }
                            });

                        }
                    })
                }
            });
        }
    }
    function GetName() {
        $.ajax({
            url: "http://localhost:8080/QLViecLam/api/GetThongKeByNameMajor/",
            method: "GET",
            success: function (n) {
                name = n;
                console.log(name);
                $.ajax({
                    url: "http://localhost:8080/QLViecLam/api/GetThongKeByNumberMajor/",
                    method: "GET",
                    success: function (res) {
                        number = res;
                        console.log(number);
                        chart = new Chart(ctx, {
                            type: 'bar',
                            data: {
                                labels: name,
                                datasets: [{
                                        label: 'Số lượng đơn ứng tuyển của các ngành nghề',
                                        data: res,
                                        borderWidth: 1
                                    }]
                            },
                            options: {
                                scales: {
                                    y: {
                                        beginAtZero: true
                                    }
                                }
                            }
                        });
                    }
                });
            }
        });
    }



</script>

