/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2015-09-03 13:22:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public final class vessels_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


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
  
 
   
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.io.BufferedReader");
    _jspx_imports_classes.add("java.io.FileReader");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.io.InputStreamReader");
    _jspx_imports_classes.add("java.io.FileNotFoundException");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("java.io.FileInputStream");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Track our ships!</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"vessels.css\">\r\n");
      out.write(" <script src=\"http://maps.google.com/maps/api/js?sensor=false\" \r\n");
      out.write("          type=\"text/javascript\"></script>\r\n");
      out.write("  <script src= \"http://www.google.com/jsapi\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1> Welcome to  Maritime Data Systems! </h1>\r\n");
      out.write("  <h3> Here is information regarding our vessels,  use the sort button to sort in ascending order: </h3>\r\n");
      out.write("<div id=\"searchbox\">\r\n");
      out.write("<form name=\"searchform\"  action=\"\" method=\"get\">\r\n");
      out.write("  <input type = \"text\" name=\"searchtext\"  placeholder = \"Enter text, click Search \">\r\n");
      out.write("  <input  type=\"button\" class= \"buttons\"name=\"searchbuton\" Value=\"Search\" onclick=\"replaceSearch(this.form)\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <table id = \"datatable\">\r\n");
      out.write("  \r\n");
      out.write("        <tr class=\"firstrow\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            <th > Vessel Name <button onclick=\"mysort('vesselname')\" class = 'buttons'>Sort</button> </th>\r\n");
      out.write("            <th > Imo <button onclick=\"mysort('imo')\" class = 'buttons'>Sort</button></th>\r\n");
      out.write("            <th > Mmsi <button onclick=\"mysort('mmsi')\" class = 'buttons'>Sort</button></th>\r\n");
      out.write("            <th > Type <button onclick=\"mysort('type')\" class = 'buttons'>Sort</button></th>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("         </tr>\r\n");
      out.write("      \r\n");
      out.write("        ");
  ArrayList<String[]> data = readCsv();
          int data_length= data.size();
            for(int i = 0 ; i< data_length; i++ ) { 
      out.write("\r\n");
      out.write("        <tr class = \"datarow\">\r\n");
      out.write("            <td > ");
      out.print( data.get(i)[0]);
      out.write("</td>\r\n");
      out.write("            <td> ");
      out.print( data.get(i)[1]);
      out.write(" </td>\r\n");
      out.write("            <td> ");
      out.print( data.get(i)[2]);
      out.write("</td>\r\n");
      out.write("            <td> ");
      out.print( data.get(i)[3]);
      out.write("</td>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <td style=\"display:none;\">");
      out.print( data.get(i)[5]);
      out.write(" </td>\r\n");
      out.write("            <td style=\"display:none;\">");
      out.print( data.get(i)[4]);
      out.write(" </td>\r\n");
      out.write("            \r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  ");
  }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("      var data_rows = document.getElementById(\"datatable\").rows;\r\n");
      out.write("    var len = data_rows.length;\r\n");
      out.write("    var index;\r\n");
      out.write("    \r\n");
      out.write("    var vessels = [];\r\n");
      out.write("    \r\n");
      out.write("    for(index = 1; index< len; index++){\r\n");
      out.write("      var vessel = { vesselname: String(data_rows[index].cells[0].innerHTML) , imo: String(data_rows[index].cells[1].innerHTML), mmsi:String(data_rows[index].cells[2].innerHTML), typev: String(data_rows[index].cells[3].innerHTML), latitude:Number(data_rows[index].cells[4].innerHTML), longitude:Number(data_rows[index].cells[5].innerHTML) };\r\n");
      out.write("     \r\n");
      out.write("      vessels.push(vessel);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<h3>  You can track them here. </h3>\r\n");
      out.write("<div id=\"map\" style=\"width: 80%; height: 500px;\"></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   data_rows = document.getElementById(\"datatable\").rows;\r\n");
      out.write("     len = data_rows.length;\r\n");
      out.write("   var j;\r\n");
      out.write("   var locations = [];\r\n");
      out.write("\r\n");
      out.write("   for(j=1; j<len; j++){\r\n");
      out.write("    var loca = new Array( String(data_rows[j].cells[0].innerHTML), Number(data_rows[j].cells[4].innerHTML) , Number(data_rows[j].cells[5].innerHTML));\r\n");
      out.write("    locations.push(loca);\r\n");
      out.write("\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("      zoom: 2,\r\n");
      out.write("      center: new google.maps.LatLng(45, 0),\r\n");
      out.write("      mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    var infowindow = new google.maps.InfoWindow();\r\n");
      out.write("\r\n");
      out.write("    var marker, i;\r\n");
      out.write("\r\n");
      out.write("    for (i = 0; i < locations.length; i++) {  \r\n");
      out.write("      marker = new google.maps.Marker({\r\n");
      out.write("        position: new google.maps.LatLng(locations[i][1], locations[i][2]),\r\n");
      out.write("        map: map\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      google.maps.event.addListener(marker, 'click', (function(marker, i) {\r\n");
      out.write("        return function() {\r\n");
      out.write("          infowindow.setContent(locations[i][0]);\r\n");
      out.write("          infowindow.open(map, marker);\r\n");
      out.write("        }\r\n");
      out.write("      })(marker, i));\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  <script type= \"text/javascript\">\r\n");
      out.write("  function mysort(column){\r\n");
      out.write("      \r\n");
      out.write("      if(column == \"vesselname\"){\r\n");
      out.write("        vessels.sort(function(a, b) {\r\n");
      out.write("             return a.vesselname.localeCompare(b.vesselname);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("      }else if(column==\"imo\"){\r\n");
      out.write("        vessels.sort(function(a, b) {\r\n");
      out.write("             return Number(a.imo) - Number(b.imo);\r\n");
      out.write("      \r\n");
      out.write("        });\r\n");
      out.write("      }else if(column == \"mmsi\"){\r\n");
      out.write("        vessels.sort(function(a, b) {\r\n");
      out.write("             return Number(a.mmsi) - Number(b.mmsi);\r\n");
      out.write("        });\r\n");
      out.write("      }else{\r\n");
      out.write("        vessels.sort(function(a, b) {\r\n");
      out.write("             return (a.typev.localeCompare(b.typev));\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      replaceTable(vessels);\r\n");
      out.write("     \r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("  <script type = \"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  function replaceSearch(form){\r\n");
      out.write("    \r\n");
      out.write("    var txt =  form.searchtext.value;\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    var select= [];\r\n");
      out.write("    for(var i = 0; i< vessels.length; i++){\r\n");
      out.write("\r\n");
      out.write("        var v = vessels[i];\r\n");
      out.write("\r\n");
      out.write("        if((String(v.vesselname).toUpperCase().indexOf(txt.toUpperCase()) > -1)||(v.imo.indexOf(txt) > -1)||(v.mmsi.indexOf(txt) > -1)||\r\n");
      out.write("          (String(v.typev).toUpperCase().indexOf(txt.toUpperCase()) > -1)){\r\n");
      out.write("\r\n");
      out.write("            select.push(v);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if(select.length ==0){\r\n");
      out.write("      alert(\"No search results found\");\r\n");
      out.write("      \r\n");
      out.write("    }else{\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     replaceTable(select);\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function replaceTable(mlist){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" var newtable = document.createElement(\"table\");\r\n");
      out.write("       newtable.id = 'datatable';\r\n");
      out.write("      var hrow = document.createElement('tr');\r\n");
      out.write("      hrow.setAtribute = ('class', \"firstrow\");\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      var h1 = document.createElement('th');\r\n");
      out.write("      h1.textContent = \"Vessel Name\";\r\n");
      out.write("      var b1 = document.createElement('button');\r\n");
      out.write("      b1.setAttribute('onclick', \"mysort('vesselname')\");\r\n");
      out.write("      b1.setAttribute('class' , \"buttons\");\r\n");
      out.write("      b1.innerHTML = 'Sort'\r\n");
      out.write("      h1.appendChild(b1);\r\n");
      out.write("      hrow.appendChild(h1);\r\n");
      out.write("\r\n");
      out.write("      var h2 = document.createElement('th');\r\n");
      out.write("      h2.textContent = \"Imo\";\r\n");
      out.write("      var b2 = document.createElement('button');\r\n");
      out.write("     b2.setAttribute('onclick', \"mysort('imo')\");\r\n");
      out.write("      b2.setAttribute('class' , \"buttons\");\r\n");
      out.write("      b2.innerHTML = 'Sort';\r\n");
      out.write("      h2.appendChild(b2);\r\n");
      out.write("      hrow.appendChild(h2);\r\n");
      out.write("\r\n");
      out.write("      var h3 = document.createElement('th');\r\n");
      out.write("      h3.textContent = \"Mmsi\";\r\n");
      out.write("      var b3 = document.createElement('button');\r\n");
      out.write("      b3.setAttribute('onclick', \"mysort('mmsi')\");\r\n");
      out.write("       b3.setAttribute('class' , \"buttons\");\r\n");
      out.write("      b3.innerHTML = 'Sort';\r\n");
      out.write("      h3.appendChild(b3);\r\n");
      out.write("      hrow.appendChild(h3);\r\n");
      out.write("\r\n");
      out.write("      var h4 = document.createElement('th');\r\n");
      out.write("      h4.textContent = \"Type\";\r\n");
      out.write("      var b4 = document.createElement('button');\r\n");
      out.write("      b4.setAttribute('onclick', \"mysort('type')\");\r\n");
      out.write("       b4.setAttribute('class' , \"buttons\");\r\n");
      out.write("      b4.innerHTML = 'Sort';\r\n");
      out.write("      h4.appendChild(b4);\r\n");
      out.write("      hrow.appendChild(h4);\r\n");
      out.write("\r\n");
      out.write("       newtable.appendChild(hrow); \r\n");
      out.write("        \r\n");
      out.write("      for (var k = 0; k < mlist.length; k++) {\r\n");
      out.write("  \r\n");
      out.write("        var vals = mlist[k];\r\n");
      out.write("    \r\n");
      out.write("         var row = document.createElement('tr');\r\n");
      out.write("       \r\n");
      out.write("        var cell1 = document.createElement('td');\r\n");
      out.write("        cell1.textContent = vals.vesselname;    \r\n");
      out.write("        row.appendChild(cell1);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var cell2 = document.createElement('td');\r\n");
      out.write("        cell2.textContent = vals.imo;    \r\n");
      out.write("        row.appendChild(cell2);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var cell3 = document.createElement('td');\r\n");
      out.write("        cell3.textContent = vals.mmsi;    \r\n");
      out.write("        row.appendChild(cell3);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var cell4 = document.createElement('td');\r\n");
      out.write("        cell4.textContent = vals.typev;\r\n");
      out.write("        row.appendChild(cell4);\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("        var cell5 = document.createElement('td');\r\n");
      out.write("        cell5.textContent = vals.latitude;\r\n");
      out.write("        cell5.style.display = 'none';\r\n");
      out.write("        row.appendChild(cell5);\r\n");
      out.write("\r\n");
      out.write("        var cell6 = document.createElement('td');\r\n");
      out.write("        cell6.textContent = vals.longitude;\r\n");
      out.write("        cell6.style.display = 'none';\r\n");
      out.write("        row.appendChild(cell6);\r\n");
      out.write("\r\n");
      out.write("            newtable.appendChild(row);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    document.body.replaceChild(newtable, document.getElementById(\"datatable\"));\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
