
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>

<%@page import= "java.io.IOException"%>
<%@page import ="java.io.PrintWriter" %>
<%@page import =  "java.io.BufferedReader" %>
<%@page import =  "java.io.FileNotFoundException" %>
<%@page import =  "java.io.FileReader" %>
<%@page import  = "java.io.IOException"%>
<%@page import  = "java.util.*"%>

  



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Hello World</title>
 <script src="http://maps.google.com/maps/api/js?sensor=false" 
          type="text/javascript"></script>
  <script src= "http://www.google.com/jsapi" type="text/javascript"></script>
</head>
<body>


<%!
  ArrayList<String[]> readCsv() {  
String csvFileToRead = "vessels.csv";  
  BufferedReader br = null;  
  String line = "";  
  String splitBy = "\\|"; 
 ArrayList<String[]> outs = new  ArrayList<String[]>();
  
  try {  
  
   br = new BufferedReader(new FileReader(csvFileToRead)); 
  
   line = br.readLine(); //discard heading
   while ((line = br.readLine()) != null) {  

    
    String[] vessel = line.split(splitBy);
    outs.add(vessel);


    

    
    
  
   } 
  
   
  
  } catch (FileNotFoundException e) {
   
   e.printStackTrace();  
  } catch (IOException e) {  
   e.printStackTrace();  
  } finally {  
   if (br != null) {  
    try {  
     br.close();  
    } catch (IOException e) {  
     e.printStackTrace();  
    }  
   }  
  }
  return outs;
  }  
  
 
   %>
 
	




   <table id = "datatable">
  
        <tr class="firstrow">
        

            <th > Vessel Name </th>
            <th > Imo </th>
            <th > Mmsi </th>
            <th > Type </th>

       
         </tr>
  <%  ArrayList<String[]> data = readCsv();
    int data_length= data.size();
    for(int i = 0 ; i< data_length; i++ ) { %>
        <tr class = "datarow">
            <td > <%= data.get(i)[0]%></td>
            <td> <%= data.get(i)[1]%> </td>
            <td> <%= data.get(i)[2]%></td>
            <td> <%= data.get(i)[3]%></td>
            

            <td style="visibility:collapse;"><%= data.get(i)[5]%> </td>
            <td style="visibility:collapse;"><%= data.get(i)[4]%> </td>
            
          </tr>
      



 

  <%  }%>

</table>
<div id="map" style="width: 80%; height: 500px;"></div>

<script type="text/javascript">
    var data_rows = document.getElementById("datatable").rows;
   var len = data_rows.length;


   var j;
   var locations = [];

   for(j=1; j<len; j++){
    var loca = new Array( String(data_rows[j].cells[0].innerHTML), Number(data_rows[j].cells[4].innerHTML) , Number(data_rows[j].cells[5].innerHTML));
    locations.push(loca);

   }

   
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 2,
      center: new google.maps.LatLng(45, 0),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var infowindow = new google.maps.InfoWindow();

    var marker, i;

    for (i = 0; i < locations.length; i++) {  
      marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });

      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }
  </script>

 

</body>
</html>