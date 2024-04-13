<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head> 
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/dashboard-style.css">
    <link rel="icon" type="image/x-icon" href="<%= request.getContextPath() %>/IMAGE/smartflow.png">
    
</head>
<body >
    
    <header>
        <div class="logo">
            <img src="<%= request.getContextPath() %>/IMAGE/smartflow.png" alt="zbi logo" usemap="#logo">
        </div>
        <div class="top">
            <nav class="topnav">   
                <a class="other-nav" href="new-tank">New Tank</a>
                <a class ="other-nav"href="new-motor">New Motor</a>
                <a class ="other-nav" href="new-connection">New Connection</a>
                <a class="other-nav" href="new-sensor">New Sensor</a>
                <a class="other-nav" href="new-project">New Project</a>
            </nav>
        </div>
    </header>
   
    <div class="page" >
   
        <div class="side-nav">
            <div class="other-side-nav">    
                <a href="water-quantity" >Water Quantity</a>
            </div>
            <div class="other-side-nav">
                <a href="sensor-data" > Water Quality </a>
            </div>    
            <div class="other-side-nav">
                <a href="Voltage-data" >Voltage data</a>
            </div>
           
        </div>
         <div class="complete-dash">
            <div class="dashboard-head">
                <h2>Dashboard</h2>
            </div>
            <div class="dashboard">
                <div class="pump-detail">
                    <div class="name">
                        <h3>Pump</h3>

                    </div>
                    <div class="value">
                        <h4>R voltage - <%= request.getAttribute("voltageR") %></h4>
                        <h4>Y voltage - <%= request.getAttribute("voltageY") %></h4>
                        <h4>B voltage - <%= request.getAttribute("voltageB") %></h4>
                        <h4>Pump Status - OFF</h4>
                    </div>
                </div>
                <div class="flow-detail">
                    <div class="name">
                        <h3>Quantity & Quantity</h3>
                    </div>
                    <div class="value">
                        <h4>Water Quantity - 1200L</h4>
                        <h4>Water PH - 7</h4>
                        <h4>Water Turbidity - 100</h4>
                        <h4>Water TDS - 2</h4>
                    </div>
                </div>
               <div class="tank-detail">
                    <div class="name">
                        <h3>Tank</h3>
                    </div>
                    <div class="values">
                        <h4>Total Water In - 20000L</h4>
                        <h4>Total Water Out - 12000L</h4>
                        <h4>Total Availability - 8000L</h4>
                        <h4>Availability in % - 2.0%</h4>
                    </div>
               </div> 
            </div>
        </div>
        
    </div>
   
</body>