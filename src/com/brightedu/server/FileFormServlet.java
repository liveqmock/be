package com.brightedu.server;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import com.brightedu.model.edu.CollegeAgreement;
import com.brightedu.server.util.Log;

/**
 * @author chetwang
 * 
 */
public class FileFormServlet extends HttpServlet {

	public FileFormServlet() {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		process(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			if (ServletFileUpload.isMultipartContent(request)) {
				processFiles(request, response);
			} else {
				// processQuery(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void processFiles(HttpServletRequest request,
			HttpServletResponse response) {
		String actionType = request.getParameter("action");
		if (actionType != null && !actionType.trim().equals("")) {
			if (actionType.toLowerCase().equals("collegeagreement")) {
				processCollegeAgreement(request, response);
			} else {
				Log.e("Undefied action for FileFormServlet: " + actionType);
			}
		} else {
			Log.e("empty action type for FileFormServlet");
		}

	}

	private void processCollegeAgreement(HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String, String> args = new HashMap<String, String>();
		boolean isGWT = true;
		try {

			ServletFileUpload upload = new ServletFileUpload();
			FileItemIterator iter = upload.getItemIterator(request);
			// pick up parameters first and note actual FileItem
			CollegeAgreement agreement = new CollegeAgreement();
			while (iter.hasNext()) {
				FileItemStream item = iter.next();
				String name = item.getFieldName();
				if (item.isFormField()) {
					args.put(name, Streams.asString(item.openStream()));
				} else {
					request.getParameter("context");
					args.put("contentType", item.getContentType());
					String fileName = item.getName();
					int slash = fileName.lastIndexOf("/");
					if (slash < 0)
						slash = fileName.lastIndexOf("\\");
					if (slash > 0)
						fileName = fileName.substring(slash + 1);
					args.put("fileName", fileName);

					InputStream in = null;
					try {
						in = item.openStream();
						// FIXME handle inputstream of an uploaded file
					} catch (Exception e) {
						e.printStackTrace();

					} finally {
						if (in != null)
							try {
								byte[] buff = new byte[1024];
								int totalLen = 0;
								int readLen = 0;
								while ((readLen = in.read(buff)) > 0) {
									totalLen += readLen;
								}
								in.close();
								System.out.println(args + ", file len="
										+ totalLen);
							} catch (Exception e) {
								Log.e("", e);
							}
					}
				}
			}
			// // TODO: need to handle conversion options and error reporting
			response.setContentType("text/html");
			response.setHeader("Pragma", "No-cache");
			response.setDateHeader("Expires", 0);
			response.setHeader("Cache-Control", "no-cache");
			PrintWriter out = response.getWriter();
			out.println("");
			out.println("");
			if (isGWT) {
				out.println("");
			} else
				out.println(getEditorResponse());
			out.println("");
			out.println("");
			out.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private String getEditorResponse() {
		StringBuffer sb = new StringBuffer(400);
		sb.append("");
		return sb.toString();
	}
}