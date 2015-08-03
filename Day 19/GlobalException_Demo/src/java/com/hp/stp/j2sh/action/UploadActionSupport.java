/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.stp.j2sh.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Abhishek
 */
public class UploadActionSupport extends ActionSupport implements ServletRequestAware {
    
    private File myFile;
    private String myFileFileName;
    private String myFileContentType;
    private String destFileLocation;

    public String getDestFileLocation() {
        return destFileLocation;
    }

    public void setDestFileLocation(String destFileLocation) {
        this.destFileLocation = destFileLocation;
    }

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public HttpServletRequest getHsr() {
        return hsr;
    }

    public void setHsr(HttpServletRequest hsr) {
        this.hsr = hsr;
    }
    
    public UploadActionSupport() {
    }
    
    @Override
    public String execute() throws Exception {
        destFileLocation.equals("Test");
        try {
            destFileLocation = hsr.getSession().getServletContext().getRealPath("/").concat("\\fileUploads\\");
            
            System.out.println("myFileFileName :: " + myFileFileName);
            System.out.println("myFileContentType :: " + myFileContentType);
            System.out.println("destFileLocation :: " + destFileLocation);
            
            File destFile = new File(destFileLocation, myFileFileName);
            FileUtils.copyFile(myFile, destFile);
            destFileLocation = hsr.getServletContext().getContextPath().concat("/fileUploads/") + myFileFileName;
            
            System.out.println("destFileLocation :: " + destFileLocation);
        }
        catch (IOException e) {
            System.out.println("IOException : " + e);
            return ERROR;
        }
        catch (Exception e) {
            System.out.println("Exception : " + e);
            return INPUT;
        }
        return SUCCESS;
    }

    private HttpServletRequest hsr;
    public void setServletRequest(HttpServletRequest hsr) {
        this.hsr = hsr;
    }
    
}
