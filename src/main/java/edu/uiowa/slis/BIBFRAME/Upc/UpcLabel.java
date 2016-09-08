package edu.uiowa.slis.BIBFRAME.Upc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UpcLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UpcLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UpcLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			if (!theUpc.commitNeeded) {
				pageContext.getOut().print(theUpc.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Upc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			return theUpc.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Upc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			theUpc.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Upc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for label tag ");
		}
	}
}

