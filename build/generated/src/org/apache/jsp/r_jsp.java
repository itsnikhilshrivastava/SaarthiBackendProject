package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class r_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"online.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("             <link ref=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Restaurant</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("          <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card-deck\">\n");
      out.write("     <div class=\"card\">\n");
      out.write("         <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐒𝐡𝐚𝐫𝐦𝐚 𝐅𝐚𝐬𝐭 𝐅𝐨𝐨𝐝</b></h5>\n");
      out.write("    <p class=\"card-text\">New Market,TT Nagar</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"padding-right: 8%;\">\n");
      out.write("        <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("  </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\t\t\t<div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐓𝐨𝐩 𝐍 𝐓𝐨𝐰𝐧</b></h5>\n");
      out.write("    <p class=\"card-text\">New Market,TT Nagar</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐆𝐮𝐩𝐭𝐚𝐣𝐢 𝐁𝐮𝐫𝐠𝐞𝐫</b></h5>\n");
      out.write("    <p class=\"card-text\">10 Number Market</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("         <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐒𝐚𝐠𝐚𝐫 𝐆𝐚𝐢𝐫𝐞</b></h5>\n");
      out.write("    <p class=\"card-text\">Platinum Plaza,TT Nagar</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>  \n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("             <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card-deck\">\n");
      out.write("     <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐙𝐚𝐦 𝐙𝐚𝐦 𝐅𝐚𝐬𝐭 𝐅𝐨𝐨𝐝</b></h5>\n");
      out.write("    <p class=\"card-text\">Hamidia Road</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\t<div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐌𝐚𝐦𝐚 𝐉𝐮𝐢𝐜𝐞 𝐂𝐞𝐧𝐭𝐞𝐫</b></h5>\n");
      out.write("    <p class=\"card-text\">Kolar Road</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐑𝐚𝐣𝐡𝐚𝐧𝐬 𝐁𝐡𝐨𝐣𝐚𝐧𝐚𝐥𝐚𝐲𝐚</b></h5>\n");
      out.write("    <p class=\"card-text\">ISBT HbibGanj</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span> \n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("           \n");
      out.write("     <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐁𝐚𝐤𝐞-𝐧-𝐒𝐡𝐚𝐤𝐞</b></h5>\n");
      out.write("    <p class=\"card-text\">10 number Market</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div> <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card-deck\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐂𝐚𝐤𝐞𝐰𝐚𝐥𝐤</b></h5>\n");
      out.write("    <p class=\"card-text\">Chunabhatti,Bhopal</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\t<div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐏𝐨𝐨𝐣𝐚 𝐁𝐡𝐨𝐣𝐚𝐧𝐚𝐥𝐚𝐲𝐚</b></h5>\n");
      out.write("    <p class=\"card-text\">MP Nagar</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐁𝐚𝐩𝐮 𝐊𝐢 𝐊𝐮𝐭𝐢𝐚</b></h5>\n");
      out.write("    <p class=\"card-text\">Roshanpura Square</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("           \n");
      out.write("     <div class=\"card\">\n");
      out.write("        <a href=\"\"><img style=\"padding:2%;\"class=\"card-img-top\" src=\"top.jpg\" alt=\"Card image cap\">\n");
      out.write("         </a>   <div class=\"card-body\">\n");
      out.write("       <h5><b>𝐀𝐧𝐮𝐩𝐚𝐦 𝐒𝐰𝐞𝐞𝐭𝐬</b></h5>\n");
      out.write("    <p class=\"card-text\">Jawahar Chowk</p>\n");
      out.write("    <div style=\"padding-bottom: 10%;\">\n");
      out.write("    <span Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star \"></span>\n");
      out.write("<span  Style=\"color: orange;\"class=\"fa fa-star\"></span>\n");
      out.write("<span class=\"fa fa-star\"></span>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"padding-right: 8%;\">\n");
      out.write("    <a href=\"#\"class=\"btn btn-success\">Order Now</a>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("       \n");
      out.write("    </body>    \n");
      out.write("  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
