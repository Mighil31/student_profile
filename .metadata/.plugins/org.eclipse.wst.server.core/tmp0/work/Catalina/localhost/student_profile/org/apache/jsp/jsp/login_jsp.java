/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-10-28 14:47:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/jsp/../styles/Login.css", Long.valueOf(1630592554364L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1635349770764L));
    _jspx_dependants.put("jar:file:/E:/College/7th%20Sem/ncp/trial/student_profile/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/student_profile/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>login</title>\r\n");
      out.write("    <style>");
      out.write("@import url(\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\");\r\n");
      out.write("@import url(\"https://fonts.googleapis.com/css2?family=Nunito:wght@500&display=swap\");\r\n");
      out.write("@import url(\"https://fonts.googleapis.com/css2?family=Montserrat:wght@700&display=swap\");\r\n");
      out.write("* {\r\n");
      out.write("  margin: 0%;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("          box-sizing: border-box;\r\n");
      out.write("  font-family: 'nuninto', sans-serif;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("  padding-top: 5%;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage header {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 10vh;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  -webkit-box-pack: justify;\r\n");
      out.write("      -ms-flex-pack: justify;\r\n");
      out.write("          justify-content: space-between;\r\n");
      out.write("  padding: 0 5% 0 5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage header .Logo svg {\r\n");
      out.write("  width: 36px;\r\n");
      out.write("  height: 36px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage header a {\r\n");
      out.write("  font-family: 'Roboto';\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  color: #0fbcf9;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel {\r\n");
      out.write("  width: 60%;\r\n");
      out.write("  height: 70%;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  -webkit-box-orient: vertical;\r\n");
      out.write("  -webkit-box-direction: normal;\r\n");
      out.write("      -ms-flex-direction: column;\r\n");
      out.write("          flex-direction: column;\r\n");
      out.write("  -webkit-box-pack: space-evenly;\r\n");
      out.write("      -ms-flex-pack: space-evenly;\r\n");
      out.write("          justify-content: space-evenly;\r\n");
      out.write("  -webkit-box-align: start;\r\n");
      out.write("      -ms-flex-align: start;\r\n");
      out.write("          align-items: flex-start;\r\n");
      out.write("  padding-left: 5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .Introtext {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 40%;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  -webkit-box-orient: vertical;\r\n");
      out.write("  -webkit-box-direction: normal;\r\n");
      out.write("      -ms-flex-direction: column;\r\n");
      out.write("          flex-direction: column;\r\n");
      out.write("  -ms-flex-pack: distribute;\r\n");
      out.write("      justify-content: space-around;\r\n");
      out.write("  -webkit-box-align: start;\r\n");
      out.write("      -ms-flex-align: start;\r\n");
      out.write("          align-items: flex-start;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .Introtext h1 {\r\n");
      out.write("  color: #005dbb;\r\n");
      out.write("  font-size: 48px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  font-family: 'Montserrat', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .Introtext p {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  color: #535353;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm {\r\n");
      out.write("  width: 50%;\r\n");
      out.write("  height: 50%;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  -webkit-box-orient: vertical;\r\n");
      out.write("  -webkit-box-direction: normal;\r\n");
      out.write("      -ms-flex-direction: column;\r\n");
      out.write("          flex-direction: column;\r\n");
      out.write("  -ms-flex-pack: distribute;\r\n");
      out.write("      justify-content: space-around;\r\n");
      out.write("  -webkit-box-align: start;\r\n");
      out.write("      -ms-flex-align: start;\r\n");
      out.write("          align-items: flex-start;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm .newUser a {\r\n");
      out.write("  color: #0fbcf9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm .LoginButton {\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  background: #0fbcf9;\r\n");
      out.write("  color: white;\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("      -ms-flex-pack: center;\r\n");
      out.write("          justify-content: center;\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("      -ms-flex-align: center;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  -webkit-transition: 0.2s;\r\n");
      out.write("  transition: 0.2s;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  border-radius: 20px;\r\n");
      out.write("  z-index: 5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm .LoginButton:hover {\r\n");
      out.write("  background: #005dbb;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm .input-field {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  width: 250px;\r\n");
      out.write("  height: 44px;\r\n");
      out.write("  line-height: 44px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm label {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 10px;\r\n");
      out.write("  color: #686868;\r\n");
      out.write("  -webkit-transition: 0.2s all;\r\n");
      out.write("  transition: 0.2s all;\r\n");
      out.write("  cursor: text;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  padding-left: 10px;\r\n");
      out.write("  -webkit-box-shadow: none;\r\n");
      out.write("          box-shadow: none;\r\n");
      out.write("  color: #111;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  background: #e7e7e7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input:invalid {\r\n");
      out.write("  outline: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input:focus,\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input:valid {\r\n");
      out.write("  border-color: #0fbcf9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input:focus ~ label,\r\n");
      out.write("#root .LoginPage .LeftPanel .LoginForm input:valid ~ label {\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  top: -30px;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  color: #0fbcf9;\r\n");
      out.write("}\r\n");
      out.write("/*# sourceMappingURL=Login.css.map */");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"root\">\r\n");
      out.write("    <div  class=\"LoginPage\">\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"Logo\">\r\n");
      out.write("            <svg width=\"48\" height=\"36\" viewBox=\"0 0 48 36\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"> <path d=\"M20.64 0.755644C21.6903 0.258094 22.8379 0 24 0C25.1622 0 26.3098 0.258094 27.36 0.755644L46.856 9.99164C47.1956 10.1524 47.4831 10.4055 47.6855 10.7221C47.8879 11.0387 47.997 11.4059 48.0003 11.7816C48.0037 12.1573 47.9011 12.5264 47.7044 12.8465C47.5077 13.1667 47.2247 13.4249 46.888 13.5916L27.488 23.2156C26.404 23.7535 25.2102 24.0334 24 24.0334C22.7899 24.0334 21.5961 23.7535 20.512 23.2156L4.00002 15.0236V23.9996C4.00002 24.5301 3.78931 25.0388 3.41423 25.4139C3.03916 25.7889 2.53045 25.9996 2.00002 25.9996C1.46959 25.9996 0.96088 25.7889 0.585807 25.4139C0.210734 25.0388 2.03059e-05 24.5301 2.03059e-05 23.9996V11.9996V11.8996C-0.0185743 11.5043 0.0800979 11.1122 0.283639 10.7727C0.48718 10.4333 0.786511 10.1615 1.14402 9.99164L20.64 0.751644V0.755644ZM8.00002 21.4756V27.9996C8.00008 28.2627 8.05204 28.5232 8.15294 28.7662C8.25384 29.0092 8.40169 29.2299 8.58802 29.4156L8.59602 29.4276L8.68802 29.5116L8.92802 29.7356C10.1816 30.8529 11.5368 31.8506 12.976 32.7156C15.648 34.3196 19.508 35.9996 24 35.9996C28.492 35.9996 32.352 34.3196 35.028 32.7156C36.4672 31.8506 37.8225 30.8529 39.076 29.7356L39.316 29.5116L39.38 29.4476L39.404 29.4236L39.408 29.4196L39.416 29.4156C39.6016 29.2296 39.7487 29.0087 39.8489 28.7658C39.9492 28.5228 40.0005 28.2625 40 27.9996V21.4716L29.264 26.7996C27.6279 27.6111 25.8263 28.0332 24 28.0332C22.1737 28.0332 20.3722 27.6111 18.736 26.7996L8.00002 21.4716V21.4756Z\" fill=\"#0FBCF9\"/> </svg>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"./About.html\">Student Profile</a>\r\n");
      out.write("    </header>\r\n");
      out.write("    <div class=\"LeftPanel\">\r\n");
      out.write("        <div class=\"Introtext\">\r\n");
      out.write("            <h1>Build and discover profiles</h1>\r\n");
      out.write("            <p>\r\n");
      out.write("                Hop into our application to discover talented students all over the world.\r\n");
      out.write("                \r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form action=\"new_user\" method=\"post\" class=\"LoginForm\">\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("              <input type=\"text\" name =\"userNam\" id=\"uname\" value=\"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\" required />\r\n");
      out.write("              <label for=\"uname\">userName</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <input type=\"password\" id=\"pwd\" value=\"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\" required />\r\n");
      out.write("                <label for=\"pwd\">password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"LoginButton\">Login</button>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <img src=\"../media/illustrations/login_image.png\" height=\"50px\" width=\"100px\"></img>\r\n");
      out.write("    </div>\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /jsp/login.jsp(31,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.firstName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /jsp/login.jsp(35,55) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.password}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }
}
