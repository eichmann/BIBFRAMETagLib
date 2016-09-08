package edu.uiowa.slis.BIBFRAME.Barcode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BarcodeIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BarcodeIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(BarcodeIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BarcodeIdentifiesIterator theBarcodeIdentifiesIterator = (BarcodeIdentifiesIterator)findAncestorWithClass(this, BarcodeIdentifiesIterator.class);
			pageContext.getOut().print(theBarcodeIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Barcode for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Barcode for identifies tag ");
		}
		return SKIP_BODY;
	}
}

