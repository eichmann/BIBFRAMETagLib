package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			if (!theCartography.commitNeeded) {
				pageContext.getOut().print(theCartography.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			return theCartography.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cartography for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Cartography theCartography = (Cartography)findAncestorWithClass(this, Cartography.class);
			theCartography.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for label tag ");
		}
	}
}

