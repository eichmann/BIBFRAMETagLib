package edu.uiowa.slis.BIBFRAME.Barcode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BarcodeLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BarcodeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BarcodeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			if (!theBarcode.commitNeeded) {
				pageContext.getOut().print(theBarcode.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Barcode for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			return theBarcode.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Barcode for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Barcode theBarcode = (Barcode)findAncestorWithClass(this, Barcode.class);
			theBarcode.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Barcode for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for label tag ");
		}
	}
}

