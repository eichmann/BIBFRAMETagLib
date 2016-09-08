package edu.uiowa.slis.BIBFRAME.Barcode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BarcodeSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BarcodeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BarcodeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			if (!theBarcode.commitNeeded) {
				pageContext.getOut().print(theBarcode.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Barcode for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			return theBarcode.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Barcode for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			theBarcode.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Barcode for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for subjectURI tag ");
		}
	}
}

